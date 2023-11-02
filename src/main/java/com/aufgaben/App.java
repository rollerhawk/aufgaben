package com.aufgaben;

import java.io.Console;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Auto auto = new Auto();
        
        Console cnsl = System.console(); 
        
        while(true){           
            try{
                String manualString = cnsl.readLine();            
                double  manualValue = Double.parseDouble(manualString);
                auto.beschleunige(manualValue);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("FORMAT FALSCH!");
            }
        }
                
    }
}
