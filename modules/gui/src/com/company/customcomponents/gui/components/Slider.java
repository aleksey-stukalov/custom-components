/*
 * Copyright (c) 2016 customcomponents
 */

package com.company.customcomponents.gui.components;

import com.haulmont.cuba.gui.components.Component;

public interface Slider extends Component {
    String NAME = "slider";

    void setValue(double[] value);
    double[] getValue();

    void setMinValue(double minValue);
    double getMinValue();

    void setMaxValue(double maxValue);
    double getMaxValue();

    void setListener(SliderValueChangeListener listener);
    SliderValueChangeListener getListener();
}