//package nus.iss.sa45.team13.stockist.validators;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;
//
//import nus.iss.sa45.team13.stockist.model.Product;
//
//@Component
//public class ProductValidator implements Validator  {
//		
//
//	private Pattern pattern;
//	private Matcher matcher;
//
//	String STRING_PATTERN = "[a-zA-Z]+";
//	String MOBILE_PATTERN = "[0-9]{10}";
//
//	@Override
//	public boolean supports(Class<?> arg0) {
//		return Product.class.isAssignableFrom(arg0);
//
//	}
//
//	@Override
//	public void validate(Object arg0, Errors arg1) throws NumberFormatException{
//		Product p = (Product) arg0;
//		ValidationUtils.rejectIfEmpty(arg1, "supplierid", "error.suppliers.id.empty");
//		ValidationUtils.rejectIfEmpty(arg1, "name", "error.suppliers.name.empty");
//		ValidationUtils.rejectIfEmpty(arg1, "address", "error.suppliers.address.empty");
//		ValidationUtils.rejectIfEmpty(arg1, "country", "error.suppliers.country.empty");
//		ValidationUtils.rejectIfEmpty(arg1, "contact", "error.suppliers.contact.empty");
//
//		// input string contains characters only
//		if (!(s.getName() != null && s.getName().isEmpty())) {
//			pattern = Pattern.compile(STRING_PATTERN);
//			matcher = pattern.matcher(s.getName());
//			if (!matcher.matches()) {
//				arg1.rejectValue("name","name.containNonChar", "Enter a valid name.");
//			}
//		}
//		
//		// input string contains numeric values only  
//		  if (s.getContact() != null && s.getContact().SIZE != 8) {  
//		   pattern = Pattern.compile(MOBILE_PATTERN);  
//		   matcher = pattern.matcher(s.getContact().toString());  
//		   if (!matcher.matches()) {  
//		    arg1.rejectValue("contact", "contact.incorrect",  
//		      "ContactNumber should contain 8 numeric digits");  
//		   }  
//		
////		// input string can not exceed that a limit  
////		   if (s.getContact().SIZE != 8) {  
////		    arg1.rejectValue("contact",  "contact.notmet",
////		      "ContactNumber should contain 8 numeric digits");  
////		   }  
//		   
////			// input string can not exceed that a limit  
////		   if (s.getContact().SIZE != 8) {  
////		    arg1.rejectValue("contact",  "contact.notmet",
////		      "ContactNumber should contain 8 numeric digits");  
////		   }  
//		   
//
//		if (!(s.getCountry() != null && s.getCountry().isEmpty())) {
//			pattern = Pattern.compile(STRING_PATTERN);
//			matcher = pattern.matcher(s.getName());
//			if (!matcher.matches()) {
//				arg1.rejectValue("country", "country.containNonChar", "Enter a valid country name.");
//			}
//		}
//
//		System.out.println(s.toString());
//		  }
//	}
//	
//    public static boolean isIntegerParseInt(String str) {
//        try {
//            Integer.parseInt(str);
//            return true;
//        } catch (NumberFormatException nfe) {}
//        return false;
//    }
//}