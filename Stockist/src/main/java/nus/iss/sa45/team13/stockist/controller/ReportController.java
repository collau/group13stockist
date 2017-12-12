package nus.iss.sa45.team13.stockist.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.export.SimplePdfReportConfiguration;
import net.sf.jasperreports.engine.export.JRPdfExporter;

@Controller
public class ReportController {
	
//	@ModelAttribute("jasperRptFormats")
//	public ArrayList getJasperRptFormats()
//	{
//		ArrayList<String> jasperRptFormats = new ArrayList<String>();
//		jasperRptFormats.add("Html");
//		jasperRptFormats.add("PDF");
//		
//		return jasperRptFormats;
//	}
	
//	@RequestMapping(value = "/loadJasper", method = RequestMethod.GET)
//	public String loadPg(@ModelAttribute("inputForm") JasperInputForm inputForm, Model model)
//	{
//		model.addAttribute("inputForm", inputForm);
//		
//		return "loadJasper";
//	}
	
	@Autowired
	private ApplicationContext appContext;
	
	
	@RequestMapping(value = "/generateReport", method = RequestMethod.GET)
	@ResponseBody
	public void generateReport(HttpServletResponse response) throws JRException, SQLException, IOException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sa45grp13ca?useSSL=false", "root", "password");
		ClassLoader classLoader = getClass().getClassLoader();
		String inputFileLocation = new File(classLoader.getResource("ReorderReport.jrxml").getFile()).getAbsolutePath().toString();
		inputFileLocation = URLDecoder.decode(inputFileLocation, "UTF-8");
		System.out.println("Opening Jasper File : " + inputFileLocation);
		JasperDesign reorderReportStream = JRXmlLoader.load(inputFileLocation);
//		InputStream reorderReportStream = getClass().getResourceAsStream("/reports/ReorderReport.jrxml");
		Map<String,Object> params = new HashMap<>();
		JasperReport jasperReport = JasperCompileManager.compileReport(reorderReportStream);
//		JRSaver.saveObject(jasperReport, "./reports/ReorderReport.jasper");	
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,params,conn);
//		JRSaver.saveObject(jasperReport, "/reports/ReorderReport.jasper");
		
		response.setContentType("application/pdf");
		response.setHeader("Content-disposition", "inline; filename=reorderReport.pdf");
		final OutputStream outStream = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);
	}
}


//		public void generateReport(HttpServletRequest request, HttpServletResponse response) throws SQLException, JRException, IOException
		
			
//			JRPdfExporter exporter = new JRPdfExporter();
//			
//			exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
//			exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("/reorderReport.pdf"));
//			
//			SimplePdfReportConfiguration reportConfig
//			  = new SimplePdfReportConfiguration();
//			reportConfig.setSizePageToContent(true);
//			reportConfig.setForceLineBreakPolicy(false);
//			 
//			SimplePdfExporterConfiguration exportConfig
//			  = new SimplePdfExporterConfiguration();
//			 
//			exporter.setConfiguration(reportConfig);
//			exporter.setConfiguration(exportConfig);
//			 
//			exporter.exportReport();
//		}}}


//private JasperReport getCompiledFile(String fileName, HttpServletRequest request) throws JRException {
//	File reportFile = new File(request.getSession().getServletContext().getRealPath("/reports/ReorderReport.jasper"));
//	if(!reportFile.exists()) {
//		JasperCompileManager.compileReportToFile(request.getSession().getServletContext().getRealPath("/reports/ReorderReport.jrxml"),
//				request.getSession().getServletContext().getRealPath("/reports/ReorderReport.jasper"));
//	}
//	JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(reportFile.getPath());
//	return jasperReport;
//}

//private void generateReportPDF (HttpServletResponse response, JasperReport jasperReport, Connection conn) throws JRException, IOException
//{
//	byte[] bytes = null;
//	bytes = JasperRunManager.runReportToPdf(jasperReport,null,conn);
//	response.reset();
//	response.resetBuffer();
//	response.setContentType("application/pdf");
//	response.setContentLength(bytes.length);
//	ServletOutputStream outputStream = response.getOutputStream();
//	outputStream.write(bytes,0,bytes.length);
//	outputStream.flush();
//	outputStream.close();
	


