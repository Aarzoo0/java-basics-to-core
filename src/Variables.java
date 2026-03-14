public class Variables {

    public static void main (String [] args){
      //1] var name cant start with number but can start with letters, underscore and dollar
      int myvar=1;
      int $dollar=90;
      int _underscoreName=9;

        System.out.println("variables are : "+ myvar +" "+ $dollar +" "+ _underscoreName);
      //int 1hello=9;  will throw error

      //2] combination of character + numbers is acceptable

      int newNum123= 123;
        System.out.println("new num is :" + newNum123);

      //3] follow camel Case and useful variable names
        int myAge=24;
        System.out.println("My age is :"+myAge);

      //4] reserved keywords can not be used as variable names
       //int true=7; // will throw error
    }
}
