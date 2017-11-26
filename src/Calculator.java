public class Calculator {

    public static void main(String[] args) {

        final double arg1 = 2, arg2 = 7;
        final Calculator calc = new Calculator();

        System.out.println("Kalkulator");
        System.out.println("Suma podanych liczb: " + calc.add(arg1, arg2));
        System.out.println("Różnica podanych liczb: " + calc.substract(arg1, arg2));

        System.out.println("Iloczyn podanych liczb: " + calc.multiply(arg1, arg2));
        System.out.println("Iloraz podanych liczb: " + calc.divide(arg1, arg2));
    }

    double add(double arg1, double arg2) {
        return arg1 + arg2;
    }

    double substract(double arg1, double arg2) {
        return arg1 - arg2;
    }

    double multiply(double arg1, double arg2) {
        return arg1 * arg2;
    }

    double divide(double arg1, double arg2) {
        return arg1 / arg2;
    }


}
