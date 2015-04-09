package com.jivesoftware.services.model.jive;

import io.nodus.util.annotation.Descriptor;
import io.nodus.util.annotation.Selection;

import static io.nodus.util.field.DescriptorType.FULL_NAME;

/**
 * Created by erwolff on 4/1/15.
 */
public class Person {

    private Long id;

    @Descriptor(type = FULL_NAME)
    private String displayName;

    private Email[] email;

    private Jive jive;

    private Name name;

    @Selection(values = {"person"})
    private String type;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Email[] getEmail() {
        return email;
    }

    public void setEmail(Email[] email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jive getJive() {
        return jive;
    }

    public void setJive(Jive jive) {
        this.jive = jive;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
