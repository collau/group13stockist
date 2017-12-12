package nus.iss.sa45.team13.stockist.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import nus.iss.sa45.team13.stockist.model.LocalinventoryList;;

@Component
public class TransationValidator implements Validator {

	private Pattern pattern;
	private Matcher matcher;

	//String STRING_PATTERN = "[a-zA-Z\\s0-9]+";
	String MOBILE_PATTERN = "[0-9]{10}";
	//String COUNTRY_PATTERN = "[a-zA-Z]+";
	

	@Override
	public boolean supports(Class<?> arg0) {
		return LocalinventoryList.class.isAssignableFrom(arg0);

	}

	@Override
	public void validate(Object arg0, Errors arg1) throws NumberFormatException{
		LocalinventoryList l = (LocalinventoryList) arg0;
		ValidationUtils.rejectIfEmpty(arg1, "supplierid", "error.suppliers.id.empty");
		ValidationUtils.rejectIfEmpty(arg1, "name", "error.suppliers.name.empty");
		ValidationUtils.rejectIfEmpty(arg1, "address", "error.suppliers.address.empty");
		ValidationUtils.rejectIfEmpty(arg1, "country", "error.suppliers.country.empty");
		ValidationUtils.rejectIfEmpty(arg1, "contact", "error.suppliers.contact.empty");

		
		
		// input string contains numeric values only for contact
		  if (l.getStoreqty() < 0) {  
		  
			  arg1.rejectValue("contact", "contact.incorrect",  
				      "ContactNumber should contain 8 numeric digits");  
		    
		   }  
	}

		/*// input string contains characters only for country
		if (!(s.getCountry() != null && s.getCountry().isEmpty())) {
			pattern = Pattern.compile(COUNTRY_PATTERN);
			matcher = pattern.matcher(s.getCountry());
			if (!matcher.matches()) {
				arg1.rejectValue("country", "country.containNonChar", "Enter a valid country name.");
			}
		}

		System.out.println(s.toString());
		  }
	}
	*/
    public static boolean isIntegerParseInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {}
        return false;
    }

}
