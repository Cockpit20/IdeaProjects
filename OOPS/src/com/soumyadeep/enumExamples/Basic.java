package com.soumyadeep.enumExamples;

public class Basic {
    // Enums are group of constants, which can't be overridden

    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,Sunday;
        // These are enum constants
        // public, static and final
        // Since it is final we cannot create child enums
        // Type is week

        // Abstract Classes are not allowed

        Week(){
            System.out.println("Constructor called for "+this);
        }

        @Override
        public void hello() {
            System.out.println("Hey How are you?");
        }
        // This is not public or protected, only private or default
        // We don't want to create new objects

    }

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;

        week.hello();

        System.out.println(Week.valueOf("Monday"));

//        for (Week day:Week.values()) {
//            System.out.println(day);
//        }

        System.out.println(week.ordinal());
    }
}
