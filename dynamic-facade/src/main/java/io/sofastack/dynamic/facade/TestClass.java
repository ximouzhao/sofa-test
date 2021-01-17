package io.sofastack.dynamic.facade;

public class TestClass {
    private static TestClass instance=new TestClass();
    public static TestClass getInstance(){
        return instance;
    }
    public synchronized int testAAA(){
        return 1;
    }
}
