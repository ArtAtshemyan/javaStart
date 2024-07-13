public class Main {
    public static void main(String[] args) {
        sum(6,50);
        sum(5,10);

        sub(16,6);
        sub(20,4);

        dividing(65,5);
        dividing(18,9);

        multiply(7,7);
        multiply(20,5);
    }

    static void sum(int numberOne,int numberTwo){
        int sum = numberOne+numberTwo;
        System.out.println("The sum is = " + sum);
    }

    static void sub(int numberOne,int numberTwo){
        int sub = numberOne-numberTwo;
        System.out.println("The sub is = " + sub);
    }

    static void dividing (int numberOne,int numberTwo) {

        int quotient = numberOne/numberTwo;
        int remainder = numberOne%numberTwo;

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }

    static void multiply (int numberOne,int numberTwo) {

        var multiplyValue = numberOne*numberTwo;

        System.out.println("The Multiply is = " + multiplyValue);
    }

}