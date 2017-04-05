package com.nick.java;


import java.util.ArrayList;

public class Formulas {

    public static Double disctimenant(Double a, Double b, Double c){
//        double d = Math.pow(b,2)-4*a*c;
        return Math.pow(b,2)-4*a*c;
    }

    public static int amuntOfRootsByDisctiminant(double discr){
        int count = -1;
        if (discr>0){
            count=2;
        }else if (discr==0){
            count=1;
        } else {
            count=0;
        }
        return count;
    }

    public static ArrayList<Double> findRootsByDiscriminant(Double a, Double b, Double c){
        ArrayList<Double> roots = new ArrayList<>(2);
        double discr = disctimenant(a,b,c);
        final int x = amuntOfRootsByDisctiminant(discr);
        if ( x == 2){
            double x1 = (-b-Math.sqrt(discr))/2*a;
            double x2 = (-b+Math.sqrt(discr))/2*a;
            roots.add(x1);
            roots.add(x2);
        }
        if ( x == 1){
            double y = -b/2*a;
            roots.add(y);
        }
        return roots;
    }

}
