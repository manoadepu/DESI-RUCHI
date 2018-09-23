package com.desiruchi.service_one.controllers;

import com.desiruchi.service_one.ControllerHelpers.ControllerHelpersConstants;
import com.desiruchi.service_one.ControllerHelpers.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desiruchi.service_one.ControllerHelpers.ControllerHelpersConstants.*;

@CrossOrigin
@RestController
public class HelperServices {


    //TODO: Research on why @autowired annotion isn't working.
    Helper helper = new Helper();

    @RequestMapping("/getStoreID")
    public int getStoreID(){
        System.out.println("Working");
        return helper.getRandomNumber(ControllerHelpersConstants.STOREID_MIN,ControllerHelpersConstants.STOREID_MAX);
    }
}
