package com.company.customcomponents.gui.xml.layout.loaders;

import com.company.customcomponents.gui.components.RatingField;
import com.haulmont.cuba.gui.xml.layout.loaders.AbstractComponentLoader;

public class RatingFieldLoader extends AbstractComponentLoader<RatingField> {
    @Override
    public void createComponent() {
        resultComponent = factory.createComponent(RatingField.class);
        loadId(resultComponent, element);
        loadWidth(resultComponent, element, "250px");
    }

    @Override
    public void loadComponent() {
        String value = element.attributeValue("value");
        if (value != null)
            resultComponent.setValue(Integer.valueOf(value));
    }
}
