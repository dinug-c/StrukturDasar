package com.radin.std;

import java.util.Date;

import com.radin.std.inst.guitar;
import com.radin.std.vehc.car;
import com.radin.std.vehc.mtrcylce;
import com.radin.std.vehc.train;

import org.apache.commons.lang3.time.DateUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Training Examples with Java");
        
        Date today = new Date();
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Today is : " + today);
        System.out.println("And tomorrow : " + tomorrow);
        
        guitar.play();
        car.tires();
        train.tires();
        mtrcylce.tires();

        

    }
}
