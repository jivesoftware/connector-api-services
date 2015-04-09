package com.jivesoftware.services.model.verification;

import com.jivesoftware.services.model.jive.Result;
import com.jivesoftware.services.util.RequestMapper;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by erwolff on 4/8/15.
 */
@XmlRootElement
public class VerificationResponse {

    private boolean success;
    private String reason;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
