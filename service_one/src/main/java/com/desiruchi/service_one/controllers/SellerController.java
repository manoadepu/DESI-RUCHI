package com.desiruchi.service_one.controllers;

import com.desiruchi.service_one.APIHelpers.APIHelpers;
import io.restassured.response.Response;
import org.springframework.web.bind.annotation.*;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class SellerController {

    @RequestMapping(value="/seller/loginVal/{email}/{password}", method= RequestMethod.POST)
    public String validatingSellerCredentials(@PathVariable String email, @PathVariable String password){
        Response response = null;
        try{
            List<String> params = new ArrayList<>();
            params.add(email);
            response = APIHelpers.restCall("http://localhost:8080/foodSellers/search/findByEmail?email=",1,params);
            System.out.println("Rest call made to: " + "http://localhost:8080/foodSellers/search/findByEmail?email="+email);

        }catch(Exception e){e.printStackTrace();}

        return response.getBody().prettyPrint();
    }
}
