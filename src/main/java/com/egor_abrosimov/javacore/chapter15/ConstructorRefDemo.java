package main.java.com.egor_abrosimov.javacore.chapter15;

public class ConstructorRefDemo {
    public static void main(String[] args) {
       MyFunc3 myClassCons = MyClass1::new;
       MyClass1 mc = myClassCons.func(100);
       System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}

interface MyFunc3{
    MyClass1 func(int n);
}

class MyClass1{
    private int val;

    MyClass1(int v){
        val = v;
    }

    MyClass1(){
        val = 0;
    }

    int getVal(){
        return val;
    }
}
