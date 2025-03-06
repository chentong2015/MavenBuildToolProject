package com.example;

/**
 * Demo Class for JavaDoc plugin
 */
public class DemoClass {

    private int id;
    private String value;

    /**
     * Get the Id value
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Get the Value
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * Test print function
     */
    public void testPrint() {
        System.out.println(id);
        System.out.println(value);
    }
}
