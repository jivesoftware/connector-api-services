package com.jivesoftware.services.model.jive;

import io.nodus.util.annotation.Descriptor;
import io.nodus.util.field.DescriptorType;

/**
 * Created by erwolff on 4/1/15.
 */
public class Jive {

    private Level level;

    private boolean externalContributor;

    @Descriptor(type= DescriptorType.FIRST_NAME)
    private String username;

    public boolean isExternalContributor() {
        return externalContributor;
    }

    public void setExternalContributor(boolean externalContributor) {
        this.externalContributor = externalContributor;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
