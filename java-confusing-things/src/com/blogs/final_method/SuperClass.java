package com.blogs.final_method;

public class SuperClass {

    public final void finalMethod(){
        System.out.println("This is Final method and can't be override.");
    }

    public void nonFinalMethod(){
        System.out.println("This is normal method and it can be override.");
    }

}
