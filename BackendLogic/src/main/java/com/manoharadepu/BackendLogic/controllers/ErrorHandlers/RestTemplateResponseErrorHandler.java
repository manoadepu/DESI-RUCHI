package com.manoharadepu.BackendLogic.controllers.ErrorHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

@Component
public class RestTemplateResponseErrorHandler
        implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse httpResponse)
            throws IOException {
        System.out.println("Status Code: "+httpResponse.getStatusCode().value());
        return false;
    }

    @Override
    public void handleError(ClientHttpResponse httpResponse)
            throws IOException {

        if (httpResponse.getStatusCode().value() == 500) {
            System.out.println("Server Error");
        } else if (httpResponse.getStatusCode()
                .series() == HttpStatus.Series.CLIENT_ERROR) {
            System.out.println("Client Error");
            // handle CLIENT_ERROR
//            if (httpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
//                throw new Exception();
//            }
        }
    }
}