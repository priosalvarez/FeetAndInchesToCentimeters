public class Main {
    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(12));
        System.out.println(calcFeetAndInchesToCentimeters(1, 6));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 6));

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || (inches <= 0 || inches > 12)){
            return -1;
        } else {
            return ((feet * 12 + inches) * 2.54);
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches <= 0 || inches > 12){
            return -1;
        } else {
            return (inches * 2.54);
        }

    }
}
