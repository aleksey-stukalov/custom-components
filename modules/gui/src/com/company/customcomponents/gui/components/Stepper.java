package com.company.customcomponents.gui.components;

import com.haulmont.cuba.gui.components.Field;

public interface Stepper extends Field {
    String NAME = "stepper";

    Integer getMinValue();

    void setMinValue(Integer minValue);

    Integer getMaxValue();

    void setMaxValue(Integer maxValue);

    Integer getStepAmount();

    void setStepAmount(Integer amount);

    void setMouseWheelEnabled(boolean isMouseWheelEnabled);

    boolean isMouseWheelEnabled();

    void setManualInputAllowed(boolean isManualInputAllowed);

    boolean isManualInputAllowed();
}