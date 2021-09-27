

public class MethodExample {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 || (inches >= 0 || inches <= 12)) {
            double feetToInches = feet * 12;
            feetToInches += inches;
            double inchesToCentimeter = feetToInches * 2.54;
            System.out.println(feet + " feet," + inches + " inch = " + inchesToCentimeter + " cm");
            return inchesToCentimeter;
        }else {
            System.out.println("Invalid value");
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            double feetInInches = (int)inches / 12;
            double remainingInches = (int)inches % 12;
            System.out.println(inches + " inches is equal to " + feetInInches + " feet and " + remainingInches + " inch");
            return calcFeetAndInchesToCentimeters(feetInInches, remainingInches);
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(7,5);
        if(centimeters < 0.0) {
            System.out.println("Invalid Parameter.");
        }
        calcFeetAndInchesToCentimeters(157);
    }
}
