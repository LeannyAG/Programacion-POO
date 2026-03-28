package access.modifiers;

public class Main {
    public static void main(String[] args) {
        Clock reloj = new Clock();

        reloj.setTime(1000);
        System.out.println("Time: " + reloj.getTime());
    }
}

