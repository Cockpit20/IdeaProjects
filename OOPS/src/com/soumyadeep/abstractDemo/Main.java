package com.soumyadeep.abstractDemo;

public class Main {

    public static void main(String[] args) {
        Son son=new Son(30);
        son.career();

        son.normal();

        Daughter daughter=new Daughter(28);
        daughter.career();

//      Objects of abstract classes cannot be created

        Parent.hello();
    }
}
