package com.example.meganlondon.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by MeganLondon on 24.06.2015.
 */
public class ColorWheel {
    public String[] mColors =
            {
                    "#39add1",
                    "#3079ab",
                    "#c25975",
                    "#e15258",
                    "#f9845b",
                    "#838cc7",
                    "#7d669e",
                    "#53bbb4",
                    "#51b46d",
                    "#e0ab18",
                    "#637a91",
                    "#f092b0",
                    "#b7c0c7",

            };
    //Method (abilities:things the object can do
    public int getColor(){

        String color = "";
        // Randomly select a fact

        Random randomGenerator = new Random(); //Construct a new random generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }

}