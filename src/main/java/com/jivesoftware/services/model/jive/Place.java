package com.jivesoftware.services.model.jive;

import io.nodus.util.annotation.Selection;

/**
 * Created by erwolff on 4/2/15.
 */
public class Place {

    private Long id;
    private String html;
    private String name;

    @Selection(values = {"Group", "Space"})
    private String type;

    private String uri;

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
