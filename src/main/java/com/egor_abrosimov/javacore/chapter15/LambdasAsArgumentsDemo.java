package main.java.com.egor_abrosimov.javacore.chapter15;

public class LambdasAsArgumentsDemo {
    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Эио исходная строка: " + inStr);

        outStr = stringOp(str -> str.toUpperCase(), inStr);
        System.out.println("Эта строка в верхнем регистре: " + outStr);

        outStr = stringOp(str -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != ' ')
                    result += str.charAt(i);
            }
            return result;
        }, inStr);

        System.out.println("Эта строка с удленными пробелами: " + outStr);

        StringFunc1 reverse = str ->{
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));
    }

    static String stringOp(StringFunc1 sf, String s){
        return  sf.func(s);
    }
}

interface StringFunc1 {
    String func(String n);
}
