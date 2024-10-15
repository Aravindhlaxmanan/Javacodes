package nwknvghg;


@FunctionalInterface
interface Interface2 {
    void method2();

    default void defaultMethod() {
        System.out.println("Default method from Interface2");
    }
}

interface Interface3 extends  Interface2 {
    @Override
    default void defaultMethod() {
    	System.out.println("Default method from Interface3");
       // Interface2.super.defaultMethod(); // Call defaultMethod from Interface2
    }
}

public class Lambda_extends {
    public static void main(String[] args) {
        Interface3 obj = () -> {
            // Implementation of method1
            System.out.println("Inside method2 implementation");
        };

      
        obj.method2();
        obj.defaultMethod(); // This will call the overridden defaultMethod in Interface3
    }
}