/*
 * Copyright (c) 2016 customcomponents
 */

package com.company.customcomponents.web.product;

import com.company.customcomponents.entity.Product;
import com.company.customcomponents.gui.components.RatingField;
import com.company.customcomponents.gui.components.Slider;
import com.company.customcomponents.gui.components.Stepper;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.FieldGroup;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.Map;

/**
 * @author stukalov
 */
public class ProductEdit extends AbstractEditor<Product> {

    @Inject
    private Slider slider;

    @Inject
    private FieldGroup fieldGroup;

    @Inject
    private ComponentsFactory componentsFactory;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        fieldGroup.addCustomField("inStock", (datasource, propertyId) -> {
            Stepper stepper = componentsFactory.createComponent(Stepper.class);
            stepper.setDatasource(datasource, propertyId);
            stepper.setWidth("100%");
            stepper.setMinValue(0);
            return stepper;
        });

        fieldGroup.addCustomField("buyerRating", (datasource, propertyId) -> {
            RatingField rf = componentsFactory.createComponent(RatingField.class);
            rf.setDatasource(datasource, propertyId);
            rf.setWidth("100%");
            return rf;
        });
    }

    @Override
    protected void initNewItem(Product item) {
        super.initNewItem(item);
        item.setMinDiscount(15.0);
        item.setMaxDiscount(75.0);
        item.setInStock(0);
        item.setBuyerRating(1);
    }

    @Override
    protected void postInit() {
        super.postInit();
        slider.setValue(new double[] {getItem().getMinDiscount(), getItem().getMaxDiscount()});
        slider.setListener(newValue -> {
            getItem().setMinDiscount(newValue[0]);
            getItem().setMaxDiscount(newValue[1]);
        });
    }
}
