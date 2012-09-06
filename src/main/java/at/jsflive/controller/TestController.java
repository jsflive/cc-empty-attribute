package at.jsflive.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class TestController {

    private Long testLong;

    public Validator getMyValidator() {
        return new MyValidator();
    }

    public Long getTestLong() {
        return testLong;
    }

    public void setTestLong(Long testLong) {
        this.testLong = testLong;
    }

    public static class MyValidator implements Validator {
        public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
            if (((Long)value) < 10) {
                throw new ValidatorException(new FacesMessage("error"));
            }
        }
    }

}
