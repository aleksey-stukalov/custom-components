/*
 * Copyright (c) 2016 customcomponents
 */

package com.company.customcomponents.web.gui.components;

import com.company.customcomponents.gui.components.Slider;
import com.company.customcomponents.gui.components.SliderValueChangeListener;
import com.company.customcomponents.web.toolkit.ui.slider.SliderServerComponent;
import com.haulmont.cuba.web.gui.components.WebAbstractComponent;

public class WebSlider extends WebAbstractComponent<SliderServerComponent> implements Slider {
    public WebSlider() {
        this.component = new SliderServerComponent();

        this.component.setMinValue(0);
        this.component.setMaxValue(100);
        this.component.setValue(new double[] {0, 100});
    }

    @Override
    public void setValue(double[] value) {
        component.setValue(value);
    }

    @Override
    public double[] getValue() {
        return component.getValue();
    }

    @Override
    public void setMinValue(double minValue) {
        component.setMinValue(minValue);
    }

    @Override
    public double getMinValue() {
        return component.getMinValue();
    }

    @Override
    public void setMaxValue(double maxValue) {
        component.setMaxValue(maxValue);
    }

    @Override
    public double getMaxValue() {
        return component.getMaxValue();
    }

    @Override
    public void setListener(SliderValueChangeListener listener) {
        component.setListener(listener);
    }

    @Override
    public SliderValueChangeListener getListener() {
        return component.getListener();
    }
}