package com.jivesoftware.services.model.verification;

import com.jivesoftware.services.model.jive.Result;
import com.jivesoftware.services.util.RequestMapper;

/**
 * Created by erwolff on 4/9/15.
 */
public class VerificationResponseGenerator {

    public static VerificationResponse verify(VerificationRequest request) {
        VerificationResponse response = new VerificationResponse();
        boolean success = false;
        if (request == null) {
            response.setReason("Request was null");
        }
        else {
            try {
                Result result = RequestMapper.mapJiveData(request.getJson());
                JiveDataVerifier.verify(result);
                success = true;
                response.setReason("no errors");
            } catch (Exception e) {
                response.setReason("Unable to map request to data object");
            }
        }
        response.setSuccess(success);
        return response;
    }
}
