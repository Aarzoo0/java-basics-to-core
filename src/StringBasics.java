public class StringBasics {


    public static void main(String[] args) {
        String s=new String("Aarzoo");
        String s2= new String("Aarzoo");
        System.out.println(s==s2); //false, pointing towards diff location

        String s3="Aarzoo";
        String s4="Aarzoo";

        System.out.println(s3==s4);

        //string methods
        String name="Ram Gopal Warma";
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.contains("a"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.startsWith("w"));

        String newName=name.replace("Ram","Anurag");
        System.out.println(newName);


       //compare
        System.out.println(s.equals(s2));

        System.out.println(name.compareTo(newName));

        // substring
        System.out.println(name.substring(1,6));
        System.out.println(name.subSequence(2,6));


    }
}
