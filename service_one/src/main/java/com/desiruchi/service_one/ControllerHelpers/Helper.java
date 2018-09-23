package com.desiruchi.service_one.ControllerHelpers;

import java.util.Random;

public class Helper {

    public int getRandomNumber(int min, int max){
        Random r = new Random();
        int Result = r.nextInt(max-min) + min;
        return Result;
    }
}
