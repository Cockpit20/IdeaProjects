package com.soumyadeep.access;

public class Subclass extends A{
    public Subclass(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(45,"Kunal");
        int n=obj.num;
    }

}class SubSubclass extends Subclass{
    public SubSubclass(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        A obj=new SubSubclass(45,"Kunal");
        int n=obj.num;
    }
}

class Subclass2 extends A{
    public Subclass2(int num, String name){
        super(num,name);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(45,"Kunal");
        int n=obj.num;

        System.out.println(obj instanceof Object);
    }
}
