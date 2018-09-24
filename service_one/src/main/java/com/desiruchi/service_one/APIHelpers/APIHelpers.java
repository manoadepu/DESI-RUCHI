package com.desiruchi.service_one.APIHelpers;

import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.internal.http.URIBuilder;
import io.restassured.response.Response;

import java.net.URI;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.mapper.ObjectMapperType.JACKSON_2;

public class APIHelpers {

    /**
     *
     * @param endPoint
     * @param request
     * @return
     */
    public static Response restCall(String endPoint, Object request) {

        Gson gson = new Gson();
        String requestJSON = gson.toJson(request);
        Response response = given().log().all()
                .contentType(ContentType.JSON)
                .body(requestJSON, JACKSON_2)
                .when().post(endPoint).thenReturn();
        System.out.println("STATUS CODE: "+response.getStatusCode());
        return response;
    }

    /**
     * Without data in body.
     * @param endPoint
     * @return
     */
    public static Response restCall(String endPoint, int numberOfParams, List<String> params) {

        Gson gson = new Gson();

        //String requestJSON = gson.toJson(request);
        Response response = given().log().all()
                .given()
                .queryParam("email",params.get(0))
                .when()
                .post(endPoint);
        return response;
    }
}
