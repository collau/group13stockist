package nus.iss.sa45.team13.stockist.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import nus.iss.sa45.team13.stockist.model.Product;

@Component
public class ProductValidator implements Validator {

	private Pattern pattern;
	private Matcher matcher;

	String STRING_PATTERN = "[a-zA-Z\\s0-9]+";
	String MOBILE_PATTERN = "[0-9]{10}";
	String COUNTRY_PATTERN = "[a-zA-Z]+";
	String AZ_PATTERN = "[a-zA-Z]+";
	String INT_PATTERN = "[0-9]{10}";
	String PRICE_PATTERN = "([+-]?\\d*\\.\\d+)(?![-+0-9\\.])";;

	@Override
	public boolean supports(Class<?> arg0) {
		return Product.class.isAssignableFrom(arg0);

	}

	@Override
	public void validate(Object arg0, Errors arg1) throws NumberFormatException{
		Product p = (Product) arg0;
		ValidationUtils.rejectIfEmpty(arg1, "partName", "error.product.partName.empty");
		ValidationUtils.rejectIfEmpty(arg1, "unitPrice", "error.product.unitPrice.empty");
		ValidationUtils.rejectIfEmpty(arg1, "description", "error.product.description.empty");
		ValidationUtils.rejectIfEmpty(arg1, "color", "error.product.color.empty");
		ValidationUtils.rejectIfEmpty(arg1, "dimension", "error.product.dimension.empty");
		ValidationUtils.rejectIfEmpty(arg1, "supplierId", "error.product.supplierId.empty");
		ValidationUtils.rejectIfEmpty(arg1, "reorderPoint", "error.product.reorderPoint.empty");
		ValidationUtils.rejectIfEmpty(arg1, "minOrder", "error.product.minOrder.empty");
		ValidationUtils.rejectIfEmpty(arg1, "shelfLocation", "error.product.shelfLocation.empty");
		ValidationUtils.rejectIfEmpty(arg1, "category", "error.product.category.empty");

//		// input string contains characters only for name
//		if (!(p.getPartName() != null && p.getPartName().isEmpty())) {
//			pattern = Pattern.compile(STRING_PATTERN);
//			matcher = pattern.matcher(p.getPartName());
//			if (!matcher.matches()) {
//
//				arg1.rejectValue("partName","partName.containNonChar", "Enter a valid name.");
//			}
//		}

	// // input string contains numeric values only for contact
	// if (s.getContact() != null && s.getContact().toString().length() != 8) {
	// pattern = Pattern.compile(MOBILE_PATTERN);
	// matcher = pattern.matcher(s.getContact().toString());
	// if (!matcher.matches()) {
	// arg1.rejectValue("contact", "contact.incorrect",
	// "ContactNumber should contain 8 numeric digits");
	// }

	// // input string contains characters only for country
	// if (!(s.getCountry() != null && s.getCountry().isEmpty())) {
	// pattern = Pattern.compile(COUNTRY_PATTERN);
	// matcher = pattern.matcher(s.getCountry());
	// if (!matcher.matches()) {
	// arg1.rejectValue("country", "country.containNonChar", "Enter a valid country
	// name.");
	// }
	// }

	 System.out.println(p.toString());
	// }
//	 }
//	
//	public static boolean isIntegerParseInt(String str) {
//		try {
//			Integer.parseInt(str);
//			return true;
//		} catch (NumberFormatException nfe) {
//		}
//		return false;
	}
}
