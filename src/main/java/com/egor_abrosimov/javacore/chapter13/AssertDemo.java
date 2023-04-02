package main.java.com.egor_abrosimov.javacore.chapter13;

public class AssertDemo {
    static int val = 3;

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getNum();

            assert n > 0;

            System.out.println("n равно " + n);
        }
    }

    static int getNum(){
        return val--;
    }
}
