package main.java.com.egor_abrosimov.javacore.chapter15;

public class MethodRefDemo2 {
    public static void main(String[] args) {
        String inStr = "Лямбда-выражение повышает эффективность Java";
        String outStr;
        MyStringOps1 ops1 = new MyStringOps1();

        outStr = stringOp(ops1::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }

    static String stringOp(StringFunc3 sf, String s){
        return sf.func(s);
    }
}

interface StringFunc3{
    String func(String n);
}

class MyStringOps1{
    String strReverse(String str){
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}
