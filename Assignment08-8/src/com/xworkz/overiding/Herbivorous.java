package com.xworkz.overiding;

public class Herbivorous extends Carnivorus{
        int lengthOfIntestins;
        String gender;
        
        void pet() {
        	System.out.println("The herbivorus may be pet");
        }
        
        @Override
        void running() {
        	System.out.println("These animals runs faster");
        }
        
}
