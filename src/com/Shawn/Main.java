package com.Shawn;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// create a list and fill it with
        LinkedList<Snake> snakes = new LinkedList<Snake>();
        String moreSnakes = "Y";

        while (moreSnakes.equalsIgnoreCase("Y")){
            String snakeName = userInput("Enter the snake name.");
            int venomRating = venomInput("What is the venom level of the snake?");
            snakes.add(new Snake(snakeName, venomRating));
            moreSnakes = userInput("Would you like to add more snakes? Enter Y or N.");
        }
        Collections.sort(snakes,Snake::compare);
        for (Snake s : snakes) {
            s.printSnakeInfo();
        }
    }
    public static String userInput(String message){//get the snake info from the user.
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        //scanner.close(); - trying to leave this on breaks the information.
        return output;
    }

    public static int venomInput(String message){
        String venomSetting = userInput(message);
        int venomLevel = 0;
        try {
            venomLevel = Integer.parseInt(venomSetting);
        }catch (Exception e){
            System.out.println("That is not a valid number, please enter a whole number");
        }
        return venomLevel;
    }
}
