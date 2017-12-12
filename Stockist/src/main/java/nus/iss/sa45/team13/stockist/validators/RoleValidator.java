package nus.iss.sa45.team13.stockist.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import nus.iss.sa45.team13.stockist.model.Role;


@Component
public class RoleValidator implements Validator{
	
		@Override
		public boolean supports(Class<?> arg0) {
			return Role.class.isAssignableFrom(arg0);

		}

		@Override
		public void validate(Object arg0, Errors arg1) {
			Role r = (Role) arg0;
			ValidationUtils.rejectIfEmpty(arg1, "name", "error.suppliers.name.empty");
			ValidationUtils.rejectIfEmpty(arg1, "role", "error.suppliers.address.empty");
			
			System.out.println(r.toString());
		
		}

}
