package com.mohanverse.dev.striver.basics;
 
public class DataType {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(b);
        b++;
        System.out.println(b);

        // Not possible
        //int i1 = null;

        // Possible
        Integer i2 = null;

        // Autoboxing
        int i3 = 1;
        Integer i4 = i3;
        
        // Unboxing
        Integer i5 = 10;
        int i6 = i5;




        //Caching:

        
        System.out.println("Q1. Integer Caching");
        Integer a = 100;
        Integer aa = 100;
        System.out.println(a == aa);

        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y);

        
        System.out.println("Q2. Character Caching");
        Character c1 = 127;
        Character c2 = 127;
        System.out.println(c1 == c2);

        Character c3 = 128;
        Character c4 = 128;
        System.out.println(c3 == c4);


        System.out.println("Q3. Boolean Comparison");
        Boolean b1 = true;
        Boolean b2 = true;
        Boolean b3 = new Boolean(true);

        System.out.println(b1 == b2);
        System.out.println(b1 == b3);
        System.out.println(b1.equals(b3));

        System.out.println("Q4. Double Wrappers");
        Double d1 = 10.0;
        Double d2 = 10.0;
        System.out.println(d1 == d2);

        Double d3 = new Double(10.0);
        Double d4 = new Double(10.0);
        System.out.println(d3 == d4);

        System.out.println(d3.equals(d4));


        System.out.println("Q5. Autoboxing + Null");
        Integer num = null;
        // int primitive = num; // What happens here? Exception
        // System.out.println(primitive);

        float f = 1;
        System.out.println(f);

        String s = "😊";  
        System.out.println(s + s.length());

        char s1 = '😊';  
        System.out.println(s1);

        int smiley = 0x1F60A; 
        System.out.println(new String(Character.toChars(smiley)));



        /*
        OutPut:
        127
        -128


        */
    }
}