package com.jivesoftware.services.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Singleton;
import com.jivesoftware.services.model.jive.List;
import com.jivesoftware.services.model.jive.Result;
import com.jivesoftware.services.model.verification.VerificationRequest;
import com.jivesoftware.services.model.verification.VerificationResponse;
import com.jivesoftware.services.model.verification.VerificationResponseGenerator;
import io.nodus.Nodus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by erwolff on 4/1/15.
 */

@Singleton
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class ServicesResource {

    private static final Logger log = LoggerFactory.getLogger(ServicesResource.class);
    private static final ObjectMapper mapper = new ObjectMapper();

    @GET
    @Path("/api/core/v3/contents")
    public String getTestData(@QueryParam("count") Integer count) {
        count = count == null ? 1 : count;
        Result r = new Result();
        r.setItemsPerPage(count);
        ObjectNode result = Nodus.builder().instance(r).build().getJson();
        ArrayNode arrayNode = mapper.createArrayNode();
        for (int i = 0; i < count; i++) {
            arrayNode.add(Nodus.builder(List.class).build().getJson());
        }
        result.put("list", arrayNode);
        return result.toString();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/api/salesforce/receive")
    public VerificationResponse receive(String json) {
        return VerificationResponseGenerator.verify(new VerificationRequest(json));
    }
}
