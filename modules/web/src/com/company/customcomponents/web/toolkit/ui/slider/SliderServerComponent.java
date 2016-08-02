/*
 * Copyright (c) 2016 customcomponents
 */

package com.company.customcomponents.web.toolkit.ui.slider;

import com.company.customcomponents.gui.components.SliderValueChangeListener;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.annotations.JavaScript;
import elemental.json.JsonArray;


@JavaScript({"slider-connector.js", "jquery-ui.js"})
@StyleSheet({"jquery-ui.css"})
public class SliderServerComponent extends AbstractJavaScriptComponent {

    private SliderValueChangeListener listener;

    public SliderServerComponent() {
        addFunction("valueChanged", arguments -> {
            JsonArray array = arguments.getArray(0);
            double[] values = new double[2];
            values[0] = array.getNumber(0);
            values[1] = array.getNumber(1);
            if (listener != null)
                listener.valueChanged(values);
        });
    }

    public void setValue(double[] value) {
        getState().values = value;
    }

    public double[] getValue() {
        return getState().values;
    }

    public double getMinValue() {
        return getState().minValue;
    }

    public void setMinValue(double minValue) {
        getState().minValue = minValue;
    }

    public double getMaxValue() {
        return getState().maxValue;
    }

    public void setMaxValue(double maxValue) {
        getState().maxValue = maxValue;
    }

    @Override
    protected SliderState getState() {
        return (SliderState) super.getState();
    }

    public SliderValueChangeListener getListener() {
        return listener;
    }

    public void setListener(SliderValueChangeListener listener) {
        this.listener = listener;
    }
}