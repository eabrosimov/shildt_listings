package main.java.com.egor_abrosimov.javacore.chapter15;

public class MethodRefDemo {
    public static void main(String[] args) {
        String inStr = "Лямбда-выражение повышает эффективность Java";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }

    static String stringOp(StringFunc2 sf, String s){
        return sf.func(s);
    }
}

interface StringFunc2{
    String func(String n);
}

class MyStringOps{
    static String strReverse(String str){
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }


}
