public class BitwiseOperator {

    public static void main(String[] args) {
        //bitwise and --> &
        int a=5;
        int b=4;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        int c=a&b;
        System.out.println(Integer.toBinaryString(c));

        System.out.println(" a & b :"+ c);

        //bitwise or --> |
        int d=5;
        int e =4;
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(e));
        int f= d | e;
        System.out.println(Integer.toBinaryString(f));

        System.out.println(" d | e :"+ f);

        //bitwise xor --> ^
        int g=5;
        int h =4;
        System.out.println(Integer.toBinaryString(g));
        System.out.println(Integer.toBinaryString(h));
        int i= g ^ h;
        System.out.println(Integer.toBinaryString(i));

        System.out.println(" g ^ h :"+ i);


        //bitwise not --> ~
        //left shift >>
        //right shift <<
        //unsigned right shift <<<




    }
}
