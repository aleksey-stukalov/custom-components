/*
 * Copyright (c) 2016 customcomponents
 */

package com.company.customcomponents.web.product;

import com.company.customcomponents.entity.Product;
import com.company.customcomponents.gui.components.RatingField;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

/**
 * @author stukalov
 */
public class ProductBrowse extends AbstractLookup {

    public Component generateRatingCell(Product entity) {
        RatingField rf = (RatingField) AppBeans.get(ComponentsFactory.class).createComponent(RatingField.NAME);
        rf.setValue(entity.getBuyerRating());
        rf.setEnabled(false);
        return rf;
    }
}