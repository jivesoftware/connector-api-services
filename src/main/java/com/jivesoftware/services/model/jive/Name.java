package com.jivesoftware.services.model.jive;

import io.nodus.util.annotation.Descriptor;

import static io.nodus.util.field.DescriptorType.FIRST_NAME;
import static io.nodus.util.field.DescriptorType.LAST_NAME;
import static io.nodus.util.field.DescriptorType.FULL_NAME;

/**
 * Created by erwolff on 4/1/15.
 */
public class Name {

    @Descriptor(type = LAST_NAME)
    private String familyName;

    @Descriptor(type = FULL_NAME)
    private String formatted;

    @Descriptor(type = FIRST_NAME)
    private String givenName;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
