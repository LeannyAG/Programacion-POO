package Exception.handling;

public class SampleException {
    public static void main(String args[]) {

        // 1. ArithmeticException (división por cero)
        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by zero");
        }

        // 2. NumberFormatException
        try {
            int num = Integer.parseInt("Edureka");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int a[] = new int[5];
            a[7] = 9;
        } catch (Exception e) {
            System.out.println("Array Index Out Of Bounds");
        }
    }
}
