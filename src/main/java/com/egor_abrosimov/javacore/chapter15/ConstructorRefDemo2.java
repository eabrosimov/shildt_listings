package main.java.com.egor_abrosimov.javacore.chapter15;

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc4<Integer> myClassCons = MyClass2::new;
        MyClass2<Integer> mc = myClassCons.func(101);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}

interface MyFunc4<T>{
    MyClass2<T> func(T n);
}

class MyClass2<T>{
    private T val;

    public MyClass2(T val) {
        this.val = val;
    }

    public MyClass2() {
        this.val = null;
    }

    public T getVal() {
        return val;
    }
}
