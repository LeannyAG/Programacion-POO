package pass.by.value.referense;

public class PassByValueExample {

    public static void main(String[] args) {
        int num = 10;

        changeValue(num);

        System.out.println(num);
    }

    public static void changeValue(int x) {
        x = 50;
    }
}