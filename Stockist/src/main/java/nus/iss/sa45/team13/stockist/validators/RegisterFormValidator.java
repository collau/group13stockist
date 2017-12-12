package nus.iss.sa45.team13.stockist.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import nus.iss.sa45.team13.stockist.model.RegisterForm;

@Component
public class RegisterFormValidator implements Validator {

	String STRING_PATTERN = "[a-zA-Z]+";

	private Pattern pattern;
	private Matcher matcher;

	@Override
	public boolean supports(Class<?> arg0) {
		return RegisterForm.class.isAssignableFrom(arg0);

	}

	@Override
	public void validate(Object arg0, Errors arg1) throws NumberFormatException {
		RegisterForm rf = (RegisterForm) arg0;
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "userId", "error.suppliers.id.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "name", "error.suppliers.name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "userName", "error.suppliers.name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "password", "error.suppliers.name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "confirmPassword", "error.suppliers.name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "adminStatus", "error.suppliers.name.empty");

		// input string contains characters only for name
		if (!(rf.getName() != null && rf.getName().isEmpty())) {
			pattern = Pattern.compile(STRING_PATTERN);
			matcher = pattern.matcher(rf.getName());
			if (!matcher.matches()) {
				arg1.rejectValue("name", "name.containNonChar", "Enter a valid name.");
			}

		}
		System.out.println(rf.toString());

	}
}
