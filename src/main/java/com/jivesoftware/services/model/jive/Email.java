package com.jivesoftware.services.model.jive;

import io.nodus.util.annotation.Descriptor;
import io.nodus.util.annotation.Selection;

import static io.nodus.util.field.DescriptorType.EMAIL;

/**
 * Created by erwolff on 4/1/15.
 */
public class Email {

    @Selection(values = {"Email"})
    private String jive_label;

    private boolean primary;

    @Selection(values = {"work", "personal"})
    private String type;

    @Descriptor(type = EMAIL)
    private String value;

    private Integer jive_summaryDisplayOrder;

    private boolean jive_showSummaryLable;

    public String getJive_label() {
        return jive_label;
    }

    public void setJive_label(String jive_label) {
        this.jive_label = jive_label;
    }

    public boolean isJive_showSummaryLable() {
        return jive_showSummaryLable;
    }

    public void setJive_showSummaryLable(boolean jive_showSummaryLable) {
        this.jive_showSummaryLable = jive_showSummaryLable;
    }

    public Integer getJive_summaryDisplayOrder() {
        return jive_summaryDisplayOrder;
    }

    public void setJive_summaryDisplayOrder(Integer jive_summaryDisplayOrder) {
        this.jive_summaryDisplayOrder = jive_summaryDisplayOrder;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
