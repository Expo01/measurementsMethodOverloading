public class measurementMethodOverload {

    public static void main(String[] args) {
        double conversionToCentimeters = calcFeetAndInchesToCentimeters(0,1) + calcFeetAndInchesToCentimeters(1);
        System.out.println(conversionToCentimeters);
    }

    public static double calcFeetAndInchesToCentimeters (int feet, int inches){
        if (feet <0 || inches <0 || inches>12) {
            return 0;
        } else {
            double centimeters = ((feet*12*2.54) + inches * 2.54);
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters (int inches) {
        if (inches<0 || inches>12) {
            return -1;
        } else {
            double centimeters = inches * 2.54;
            return centimeters;
        }
    }

}
