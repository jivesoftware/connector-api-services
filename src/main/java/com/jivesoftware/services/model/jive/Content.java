package com.jivesoftware.services.model.jive;

import io.nodus.util.annotation.Descriptor;
import io.nodus.util.annotation.Selection;

import static io.nodus.util.field.DescriptorType.MESSAGE;

/**
 * Created by erwolff on 4/2/15.
 */
public class Content {

    @Descriptor(type = MESSAGE)
    private String text;

    private boolean editable;

    @Selection(values = "text/html")
    private String type;

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
