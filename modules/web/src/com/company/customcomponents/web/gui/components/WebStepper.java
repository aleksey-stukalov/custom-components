package com.company.customcomponents.web.gui.components;

import com.company.customcomponents.gui.components.Stepper;
import com.haulmont.cuba.web.gui.components.WebAbstractComponent;
import com.haulmont.cuba.web.gui.components.WebAbstractField;
import org.vaadin.risto.stepper.IntStepper;

public class WebStepper extends WebAbstractField<IntStepper> implements Stepper {

    public WebStepper() {
        this.component = new org.vaadin.risto.stepper.IntStepper();
    }

    @Override
    public Integer getMinValue() {
        return component.getMinValue();
    }

    @Override
    public void setMinValue(Integer minValue) {
        component.setMinValue(minValue);
    }

    @Override
    public Integer getMaxValue() {
        return component.getMaxValue();
    }

    @Override
    public void setMaxValue(Integer maxValue) {
        component.setMaxValue(maxValue);
    }

    @Override
    public Integer getStepAmount() {
        return component.getStepAmount();
    }

    @Override
    public void setStepAmount(Integer amount) {
        component.setStepAmount(amount);
    }

    @Override
    public void setMouseWheelEnabled(boolean isMouseWheelEnabled) {
        component.setMouseWheelEnabled(isMouseWheelEnabled);
    }

    @Override
    public boolean isMouseWheelEnabled() {
        return component.isMouseWheelEnabled();
    }

    @Override
    public void setManualInputAllowed(boolean isManualInputAllowed) {
        component.setManualInputAllowed(isManualInputAllowed);
    }

    @Override
    public boolean isManualInputAllowed() {
        return component.isManualInputAllowed();
    }
}