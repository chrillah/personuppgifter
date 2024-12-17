import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Global variables
        String fName;
        String lName;
        int age;
        double length;
        int weight;
        boolean isAStudent;

        // Giving variables value
        Scanner userInput = new Scanner(System.in);

        // Giving instruction
        System.out.println("Please enter your information");
        System.out.println("Your first name: ");
        fName = userInput.nextLine();
        System.out.println("Your last name: ");
        lName = userInput.nextLine();
        System.out.println("Your age: ");
        age = userInput.nextInt();
        System.out.println("Your length in meter: ");
        length = userInput.nextDouble();
        System.out.println("Your weight in kg: ");
        weight = userInput.nextInt();

        userInput.nextLine();
        System.out.println("Are you a student? Y or N? ");
        String answer = userInput.nextLine();
        isAStudent = answer.equals("Y");

        System.out.println(fullName(fName, lName));
        System.out.println(isAdult(age));
        System.out.println(calculateBMI(weight, length));
        System.out.println(lengthInCmAndM(length));

        /*
        System.out.println("Hello " + fName + " " + lName);
        System.out.println("Here is everything I know about you:");
        System.out.println("You are "+age+" years old, you are "+length+" meter,");
        System.out.println("you weight is "+ weight+"kg, and you are "+(isAStudent? "a student" : "not a student"));
        System.out.println("So suck a dick");

        int extraYears = 5;
        int futureAge =  age + extraYears;
        System.out.println("Some more shit, why not: in "+ extraYears+" years you will be "+futureAge+" years old...");

        int centimeter = (int) (length * 100);
        System.out.println("Yeah, your length was in meters, why not give it back to you as centimeters? Here you go: "+centimeter+"cm");
         */


    }

    static String fullName(String fName, String lName){
        return fName + " " + lName;
    }

    static boolean isAdult(int age){
        return (age > 18);
    }

    static double calculateBMI(int weight, double length){
        return weight / (length * length);
    }

    static String lengthInCmAndM(double length){
        return length + "m, "+((int) (length * 100)+"cm");
    }
}
