/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.Client;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnotherFakeApi
 */
@Ignore
public class AnotherFakeApiTest {

    private final AnotherFakeApi api = new AnotherFakeApi();

    
    /**
     * To test special tags
     *
     * To test special tags
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testSpecialTagsTest() {
        Client client = null;
        Client response = api.testSpecialTags(client);

        // TODO: test validations
    }
    
}
