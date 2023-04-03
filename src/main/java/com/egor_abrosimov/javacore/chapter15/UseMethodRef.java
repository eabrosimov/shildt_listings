package main.java.com.egor_abrosimov.javacore.chapter15;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {
    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>(){{
            add(new MyClass(1));
            add(new MyClass(4));
            add(new MyClass(2));
            add(new MyClass(9));
            add(new MyClass(3));
            add(new MyClass(7));
        }};

        MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);
        System.out.println("Максимальное значение равно: " + maxValObj.getVal());
    }

    static int compareMC(MyClass a, MyClass b){
        return a.getVal() - b.getVal();
    }
}

class MyClass{
    private int val;

    MyClass(int v){
        val = v;
    }

    int getVal(){
        return val;
    }
}
