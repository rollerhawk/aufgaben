package com.aufgaben;

public class Auto {    

    public void beschleunige(double a){
        String resulString;
        
        if (a>0 && a <1) resulString = "bremsen";
        else if (a>=1) resulString = "beschleunigen";
        else if (a == 0) resulString = "anhalten";
        else if (a<0) resulString = "!! FEHLER !!";
        else resulString = "nicht definiert";

        System.out.println(resulString);
    }

}
