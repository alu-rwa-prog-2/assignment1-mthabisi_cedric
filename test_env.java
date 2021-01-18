/* Authors: Cedric Murairi | Wanjiru Wan'gondu
   this program plays as test to the environment setup, we are getting
   some input from the user and calculate their BMI and also compute the perimeter
   and surface of a rectangle given the lenght and the width.
*/

import java.util.*;

public class test_env {
    public static void main(String[] args) {
        // Instantiate the scanner object to get the input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your height (in meters): ");
        float height = sc.nextFloat();
        System.out.println("Enter your weight (in kilograms): ");
        float weight = sc.nextFloat();

        sc.close();

        String conclusion = "";

        float bmi = weight / (height * height); // Calculate the BMI
        
        // Get the conclusion depending on the BMI result
        conclusion = bmi < 15 ?
        "Very severely underweight" : bmi > 15 && bmi < 16 ?
        "Severely underweight" : bmi > 16 && bmi < 18.5 ?
        "Underweight" : bmi > 18.5 && bmi < 25 ?
        "Normal weight" : bmi > 25 && bmi < 30 ?
        "Overweight" : bmi > 30 && bmi < 35 ?
        "Moderately obese" : bmi > 35 && bmi < 40 ?
        "Severely obese" : bmi > 40 ?
        "Very severely obese" : "Nothing for you buddy";

        System.out.println(name + " age: " + age + ", your BMI is: " + bmi + ". This is considered " + conclusion);

        // Declare var for width and length and compute the per and surf
        int width = 10, length = 15;
        int perimeter = (width + length) * 2;
        int surface = width * length;

        // Print result on the screen
        System.out.print("\n");
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The surface of the reactangle is: " + surface);
    }
}