package com.company.customcomponents.web.gui.components;

import com.company.customcomponents.gui.components.RatingField;
import com.company.customcomponents.web.toolkit.ui.RatingFieldServerComponent;
import com.haulmont.cuba.web.gui.components.WebAbstractField;

public class WebRatingField extends WebAbstractField<RatingFieldServerComponent> implements RatingField {

    public WebRatingField() {
        this.component = new com.company.customcomponents.web.toolkit.ui.RatingFieldServerComponent();
    }

}
