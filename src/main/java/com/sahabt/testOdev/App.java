package com.sahabt.testOdev;

public class App
{
    Circle circle = new Circle(2);
    int eSq= circle.expo*circle.expo;

    public App() {

    }

    public int alanBul(){

        return circle.yaricap*circle.pi*circle.expo*eSq;
    }
    public int cevreBul(){
        return circle.yaricap*circle.pi*circle.expo;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
