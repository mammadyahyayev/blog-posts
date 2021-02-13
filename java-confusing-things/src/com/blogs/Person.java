package com.blogs;

public class Person { // you can not define private, protected and static class
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

    public Person(String publicFinalVariable,
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

    // public abstract String variable;  // Variable can not be abstract*/


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
