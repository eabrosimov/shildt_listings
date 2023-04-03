package main.java.com.egor_abrosimov.javacore.chapter15;

public class ConstructorRefDemo3 {
    public static void main(String[] args) {
        MyFunc5<MyClass3<Double>, Double> myClassCons = MyClass3::new;
        MyClass3<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        MyFunc5<MyClass4, String> myClassCons2 = MyClass4::new;
        MyClass4 mc2 = myClassFactory(myClassCons2, "Привет");
        System.out.println("Значение str в объекте mc2 равно " + mc2.getStr());
    }

    static <R, T> R myClassFactory(MyFunc5<R, T> cons, T v){
        return cons.func(v);
    }
}

interface MyFunc5<R, T>{
    R func(T n);
}

class MyClass3<T>{
    private T val;

    public MyClass3(T val) {
        this.val = val;
    }

    public MyClass3() {
        this.val = null;
    }

    public T getVal() {
        return val;
    }
}

class MyClass4{
    String str;

    public MyClass4(String str) {
        this.str = str;
    }

    public MyClass4() {
        this.str = "";
    }

    public String getStr() {
        return str;
    }
}
