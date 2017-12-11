package nus.iss.sa45.team13.stockist.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import nus.iss.sa45.team13.stockist.model.Suppliers;

@Component
public class SuppliersValidator implements Validator  {
		
		@Override
		public boolean supports(Class<?> arg0) {
			return Suppliers.class.isAssignableFrom(arg0);

		}

		@Override
		public void validate(Object arg0, Errors arg1) {
			Suppliers s = (Suppliers) arg0;
			ValidationUtils.rejectIfEmpty(arg1, "supplierid", "error.suppliers.id.empty");
			ValidationUtils.rejectIfEmpty(arg1, "name", "error.suppliers.name.empty");
			ValidationUtils.rejectIfEmpty(arg1, "address", "error.suppliers.address.empty");
			ValidationUtils.rejectIfEmpty(arg1, "country", "error.suppliers.country.empty");
			ValidationUtils.rejectIfEmpty(arg1, "contact", "error.suppliers.contact.empty");
			
			System.out.println(s.toString());
		}
}
