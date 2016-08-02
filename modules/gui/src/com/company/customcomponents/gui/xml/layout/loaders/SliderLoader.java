/*
 * Copyright (c) 2016 customcomponents
 */

package com.company.customcomponents.gui.xml.layout.loaders;

import com.company.customcomponents.gui.components.Slider;
import com.haulmont.cuba.gui.xml.layout.loaders.AbstractComponentLoader;

public class SliderLoader extends AbstractComponentLoader<Slider> {

    @Override
    public void createComponent() {
        resultComponent = factory.createComponent(Slider.class);
        loadId(resultComponent, element);
        loadWidth(resultComponent, element, "250px");
    }

    @Override
    public void loadComponent() {
        String minValue = element.attributeValue("minValue");
        if (minValue != null)
            resultComponent.setMinValue(Double.valueOf(minValue));

        String maxValue = element.attributeValue("maxValue");
        if (maxValue != null)
            resultComponent.setMaxValue(Double.valueOf(maxValue));

        String value = element.attributeValue("value");
        if (value != null) {
            String[] vals = value.split(",");
            resultComponent.setValue(new double[] {Double.valueOf(vals[0]), Double.valueOf(vals[1])});
        }
    }

}
