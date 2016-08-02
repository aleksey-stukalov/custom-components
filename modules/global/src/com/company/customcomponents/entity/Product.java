/*
 * Copyright (c) 2016 customcomponents
 */

package com.company.customcomponents.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

/**
 * @author stukalov
 */
@Table(name = "CUSTOMCOMPONENTS_PRODUCT")
@Entity(name = "customcomponents$Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 1429205264560549529L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "MIN_DISCOUNT")
    protected Double minDiscount;

    @Column(name = "MAX_DISCOUNT")
    protected Double maxDiscount;

    @Column(name = "IN_STOCK")
    protected Integer inStock;

    @Column(name = "BUYER_RATING")
    protected Integer buyerRating;

    public void setBuyerRating(Integer buyerRating) {
        this.buyerRating = buyerRating;
    }

    public Integer getBuyerRating() {
        return buyerRating;
    }


    public void setInStock(Integer inStock) {
        this.inStock = inStock;
    }

    public Integer getInStock() {
        return inStock;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMinDiscount(Double minDiscount) {
        this.minDiscount = minDiscount;
    }

    public Double getMinDiscount() {
        return minDiscount;
    }

    public void setMaxDiscount(Double maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public Double getMaxDiscount() {
        return maxDiscount;
    }


}