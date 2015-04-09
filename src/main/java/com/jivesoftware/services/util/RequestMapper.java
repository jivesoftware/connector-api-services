package com.jivesoftware.services.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jivesoftware.services.model.jive.Result;

import java.io.IOException;

/**
 * Created by erwolff on 4/9/15.
 */
public class RequestMapper {

    private static ObjectMapper mapper = new ObjectMapper();

    public static Result mapJiveData(String json) throws IOException {
        return mapper.readValue(json, Result.class);
    }
}
