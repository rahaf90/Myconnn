package com.example.toshiba_pc.mycon;

/**
 * Created by toshiba-pc on 13/11/17.
 */

public class mmethods {




    //convert c to f
    public static double tof(double c){

        return 32 + c * 9 / 5;

    }
    // converting f o c
    public static double toc(double f){

        return (f - 32) * 5 / 9;
    }

    // converting m to k
    public static double tok(double m){


        return m*1.6;
    }


    // converting k to m
    public static double tom(double k){


        return k*0.6;
    }
}
