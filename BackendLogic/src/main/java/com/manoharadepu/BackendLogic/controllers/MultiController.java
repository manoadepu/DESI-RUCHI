package com.manoharadepu.BackendLogic.controllers;

import com.manoharadepu.BackendLogic.Constants;
import com.manoharadepu.BackendLogic.Endpoints;
import com.manoharadepu.BackendLogic.controllers.ErrorHandlers.RestTemplateResponseErrorHandler;
import com.manoharadepu.BackendLogic.models.foodSellerCollection.FoodSellerCollectionModel;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;
import com.manoharadepu.BackendLogic.models.requests.sellerLoginRequest;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
public class MultiController {


    @RequestMapping(value = "/sellerLoginValidation", method = RequestMethod.POST)
    public String sellerLoginValidation(@RequestBody sellerLoginRequest sellerLoginRequest){
        String credentialsValidated = "ErrorPage";
        System.out.println("endpoint working");
        System.out.println(sellerLoginRequest.toString());

        System.out.println("Service_one endpoint: "+ Endpoints.FIND_SELLER_BY_EMAIL+sellerLoginRequest.getEmail());
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        RestTemplate restTemplate = restTemplateBuilder.errorHandler(new RestTemplateResponseErrorHandler()).build();


        FoodSellerCollectionModel foodSellerCollectionModel = Constants.REST_TEMPLATE.getForObject(Endpoints.FIND_SELLER_BY_EMAIL+sellerLoginRequest.getEmail(),FoodSellerCollectionModel.class);

        //validating credentials entered by the seller to the credentials in the database
        String email = foodSellerCollectionModel.getEmbedded().getFoodSellers().get(0).getEmail();
        String password = foodSellerCollectionModel.getEmbedded().getFoodSellers().get(0).getPassword();

        if(email.equals(sellerLoginRequest.getEmail()) && password.equals(sellerLoginRequest.getPassword()))
            credentialsValidated = "seller";

        return credentialsValidated;
    }
}
