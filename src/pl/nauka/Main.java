package pl.nauka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        calculateBMI();
    }

    static public void calculateBMI(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, press your weight: ");
        int weight = scanner.nextInt();
        System.out.println("Press your height now: ");
        int height = scanner.nextInt();
         BmiCaltulator bmiCaltulator = new BmiCaltulator(weight,height);
        System.out.println("Your BMI is equals to: " + bmiCaltulator.countBMI());
        System.out.println("Your Weight status is " + bmiCaltulator.WeightStatus().toString());

    }
}
