package com.jivesoftware.services.model.verification;

/**
 * Created by erwolff on 4/8/15.
 */
public class VerificationRequest {

    private String json;

    public VerificationRequest(String json) {
        this.json = json;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
