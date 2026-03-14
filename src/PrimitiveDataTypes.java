public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // primitive data types
        //A] Integral numbers
        //1]byte--> 1 Bytes
        byte b=29;
        System.out.println(b);
        System.out.println("Min Range of byte is"+Byte.MIN_VALUE); //Byte is wrapper class
        System.out.println("Max Range of byte is"+ Byte.MAX_VALUE);

        //short--> 2 bytes
        short s=32;
        System.out.println(s);
        System.out.println("Min Range of short is "+Short.MIN_VALUE); //Short is wrapper class
        System.out.println("Max Range of short is "+Short.MAX_VALUE);

        //int-->4 bytes
        int a=839;
        System.out.println(a);
        System.out.println("Min Range of int is "+Integer.MIN_VALUE); //Integer is wrapper class
        System.out.println("Max Range of int is "+Integer.MAX_VALUE);

        //long-->8 bytes
        //You must add L at the end if the number is large, otherwise Java treats it as an int.
        long l=83888899L;
        System.out.println(l);
        System.out.println("Max Range of Long is "+Long.MAX_VALUE);
        System.out.println("Min Range of Long is "+Long.MIN_VALUE); //Integer is wrapper class


        //B] Decimal numbers
        // 1] float--4 bytes --~6–7 decimal digits precision
        //Without f, Java treats it as a double by default.
        float num = 10999.512345f;
        System.out.println(num);
        System.out.println("Min Range of float is "+Float.MIN_VALUE);
        System.out.println("Max Range of float is "+Float.MAX_VALUE);


        // 2] double---8 bytes ---~15 decimal digits
        double num2=10999.5767899999999;
        System.out.println(num2);
        System.out.println("Min Range of double is "+Double.MIN_VALUE);
        System.out.println("Max Range of double is "+Double.MAX_VALUE);




        //C] Char--1 byte
        char ch='a';  //can store single char
        System.out.println(ch);
        System.out.println("Max Range of charracter is "+ (int)Character.MAX_VALUE);
        System.out.println("Min Range of charracter is "+ (int)Character.MIN_VALUE);

        // 65535 total characters---numbers are associated with evry char
        System.out.println((int) ch); // will give 97

        char heart=10084;
        System.out.println(heart);
        System.out.println((char) 10084); //heart emoji :)

        char hindiChar=2309;
        System.out.println(hindiChar); //will print अ

        char uniChar='\u27A5'; //unicode representation, giving hexadecimal code
        System.out.println(uniChar);

        //ASCII Value-- 0-127 , subset of unicode
        for(int i=0;i<=127;i++){
            System.out.println((char)i);


        }


        //D] Boolean
        boolean isOKay=true; //or false , those are reserved keywords
        System.out.println(isOKay);
    }
}