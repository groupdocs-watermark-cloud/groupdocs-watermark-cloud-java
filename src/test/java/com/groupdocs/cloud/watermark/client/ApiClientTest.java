package com.groupdocs.cloud.watermark.client;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import org.junit.Assert;
import org.junit.Test;

public class ApiClientTest {
    private static String errorMessage(String body) {
        ApiClient apiClient = new ApiClient(new Configuration("app-sid", "app-key"));
        Response response = new Response.Builder()
            .request(new Request.Builder().url("https://api.groupdocs.cloud/v1.0/watermark").build())
            .protocol(Protocol.HTTP_1_1)
            .code(400)
            .message("Bad Request")
            .body(ResponseBody.create(MediaType.parse("application/json"), body))
            .build();
        try {
            apiClient.handleResponse(response, String.class);
        } catch (ApiException e) {
            Assert.assertEquals(400, e.getCode());
            return e.getMessage();
        }
        Assert.fail("Expected ApiException was not thrown.");
        return null;
    }

    @Test
    public void testErrorResponse() {
        Assert.assertEquals("Error message", errorMessage("{\"code\":\"errorCode\",\"message\":\"Error message\"}"));
    }

    @Test
    public void testErrorMessageOnlyResponse() {
        Assert.assertEquals("Error message", errorMessage("{\"message\":\"Error message\"}"));
    }

    @Test
    public void testApiErrorResponse() {
        Assert.assertEquals("Error message", errorMessage("{\"requestId\":\"id\",\"error\":{\"code\":\"errorCode\",\"message\":\"Error message\"}}"));
    }

    @Test
    public void testAuthErrorResponse() {
        Assert.assertEquals("invalid_client", errorMessage("{\"error\":\"invalid_client\",\"error_description\":\"Invalid client\"}"));
    }

    @Test
    public void testUnknownResponse() {
        Assert.assertEquals("Bad Request", errorMessage("{}"));
        Assert.assertEquals("Bad Request", errorMessage("<html>Bad Request</html>"));
    }
}
