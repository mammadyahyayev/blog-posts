package com.blogs;

public class PublicClass { // you can not define private, protected and static class
    public String publicVariable;
    private String privateVariable;
    protected String protectedVariable;
    String defaultVariable;

    // static variables
    public static String publicStaticVariable;
    private static String privateStaticVariable;
    protected static String protectedStaticVariable;
    static String defaultStaticVariable;

    // final variables
    public final String publicFinalVariable;
    private final String privateFinalVariable;
    protected final String protectedFinalVariable;
    final String defaultFinalVariable;

    public PublicClass(String publicFinalVariable,
                       String privateFinalVariable,
                       String protectedFinalVariable,
                       String defaultFinalVariable) {
        this.publicFinalVariable = publicFinalVariable;
        this.privateFinalVariable = privateFinalVariable;
        this.protectedFinalVariable = protectedFinalVariable;
        this.defaultFinalVariable = defaultFinalVariable;
    }

    // final static variables
    public static final String publicStaticFinalVariable = "";
    private static final String privateStaticFinalVariable = "";
    protected static final String protectedStaticFinalVariable = "";
    static final String defaultStaticFinalVariable = "";

    // public abstract String variable;  // Variable can not be abstract

    // Methods of Normal class

    // normal method - this method return String value. Of course it can return any type of value, for example: int, Integer, long , any Class, interface and so on.
    public String nonVoidMethod(){
        return "Non Void Method: returns String";
    }

    // void method - this method doesn't return anything because void methods can't return, you can use void methods for printing something or logging and so on.
    public void voidMethod(){
        System.out.println("Void Method");
    }

    // final method - this method return String value. If you create final method in java , you can't override this method from subclass, this can't be override.
    public final String finalMethod(){
        return "Final Method";
    }

    // static method - as static variables, you can call this method like this: Classname.methodName. for example: Person.staticMethod.
    // and also static methods can't be override but it can be hidden. And also this method is final.
    public static String staticMethod(){
        return "Static Method";
    }

    // static final method - this method is the same as static method and you don't need to add final keyword to this method because
    // static methods declared final by default
    public static final String staticFinalMethod(){
        return "Static Final Method";
    }

    // abstract method -- you can't create abstract method in public class, abstract method can be created within the interface and abstract class
    // public abstract String abstractMethod();

    @Override
    public String toString() {
        return "Person{" +
                "publicFinalVariable='" + publicFinalVariable + '\'' +
                ", privateFinalVariable='" + privateFinalVariable + '\'' +
                ", protectedFinalVariable='" + protectedFinalVariable + '\'' +
                ", defaultFinalVariable='" + defaultFinalVariable + '\'' +
                '}';
    }
}
