import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Global variables
        String fName;
        String lName;
        String middleName;
        int age;
        double length;
        int weight;
        boolean isAStudent;

        // Giving variables value
        Scanner userInput = new Scanner(System.in);

        // Giving instruction
        System.out.println("Please enter your information");

        // System.out.println(ageStats(25));

        System.out.println("Your first name: ");
        fName = userInput.nextLine();
        System.out.println("Your last name: ");
        lName = userInput.nextLine();
        System.out.println("Your middle name: ");
        middleName = userInput.nextLine();

        vocalCount(controlUser(fName.trim(), lName.trim(), middleName.trim()));
        // System.out.println(controlUser(fName.trim(), lName.trim(), middleName.trim()));
        /*
        System.out.println("Your age: ");
        age = userInput.nextInt();
         */

        /*
        System.out.println("Your length in meter: ");
        length = userInput.nextDouble();
        System.out.println("Your weight in kg: ");
        weight = userInput.nextInt();

        userInput.nextLine();
        System.out.println(controlUser(calculateBMI(weight, length)));
         */

        // System.out.println("Are you a student? Y or N? ");
        // String answer = userInput.nextLine();
        // isAStudent = answer.equals("Y");

        /*
        System.out.println(fullName(fName, lName));
        System.out.println(isAdult(age));
        System.out.println(calculateBMI(weight, length));
        System.out.println(lengthInCmAndM(length));


        System.out.println(userInformationNiceFormat(
                fName,lName,age, length, weight, isAStudent
        ));


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
  /*
    static String calculateBMI(int weight, double length){
        return String.format("&.2f", (weight / (length * length)));
    }
   */

    static double calculateBMI(int weight, double length){
        return weight / (length * length);
    }


    static String isFat(double bmi){
        return (bmi > 25 ? "yes" : "no");
    }

    static String lengthInCmAndM(double length){
        return length + "m, "+((int) (length * 100)+"cm");
    }

    static String userInformationNiceFormat(
            String fName,
            String lName,
            int age,
            double length,
            int weight,
            boolean isAStudent
    ){
        return  "Name: " +fullName(fName, lName) + "\n" +
                "Age: "+age+"\n"+
               // "Is an adult: "+(isAdult(age) ? "yes" : "no")+"\n"+
                "Is: "+controlUser(age)+"\n"+
                "Length in m and cm: " + lengthInCmAndM(length) +"\n"+
                "Weight: "+weight +"kg\n"+
                "BMI: " + String.format("%.2f", calculateBMI(weight, length))+" and is "+controlUser(calculateBMI(weight, length))+"\n" +
                "Is " +fName+" fat: " + isFat(calculateBMI(weight, length))+"\n"+
                "Is "+fName+" a student: "+ (isAStudent ? "yes" : "no");
    }

    static String controlUser(int age){
        String ageInfo = "";

        if(age < 12){
            ageInfo = "a child";
        } else if(age > 12 && age < 18 ){
            ageInfo = "an youth";
        } else if(age > 18 && age < 65){
            ageInfo = "an adult";
        } else if(age > 65){
            ageInfo = "very, very, very old";
        }

        return ageInfo;
    }

    static String controlUser(double bmi){
        String bmiInfo = "";
        if(bmi <= 18.4 ){
            bmiInfo = "underweight";
        } else if(bmi >18.4 && bmi < 24.9){
            bmiInfo = "normal";
        } else if(bmi > 25.0 && bmi < 39.0){
            bmiInfo = "overweight";
        } else if(bmi >= 40.0){
            bmiInfo = "obese";
        }
        return bmiInfo;
    }

    static String ageStats(int age){
        String ageStat = "";
        int futureAge = 10;
        Date date = new Date();
        int year = date.getYear() + 1900;

        for(int i = 0; i <= 10; i++){
            // System.out.println("In the year "+(year + i)+" the age will be "+(age + i));
            ageStat += "In the year "+(year + i)+" the age will be "+(age + i)+"\n";
        }

        return ageStat;
    }

    static String controlUser(String fName, String lName, String middleName){
        Scanner menu = new Scanner(System.in);
        String name = "";
        System.out.println("Select you name presentation");
        System.out.println("1) First name");
        System.out.println("2) First name and last name");
        System.out.println("3) First name, middle name and last name");
        int choice = menu.nextInt();

        switch(choice){
            case 1 -> name = fName;
            case 2 -> name = fullName(fName, lName);
            case 3 -> name = fName + " " + middleName + " " + lName;
            default -> System.out.println("Wrong choice");
        }

        return name;
    }

    static void vocalCount(String name){
        name = name.trim().toLowerCase();
        int numberOfVocals = 0;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'a'
                || name.charAt(i) == 'e'
                || name.charAt(i) == 'i'
                || name.charAt(i) == 'o'
                || name.charAt(i) == 'u'
                || name.charAt(i) == 'y'){
                numberOfVocals++;
            }
        }

        System.out.println(numberOfVocals);
    }
}
