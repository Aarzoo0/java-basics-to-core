public class Operators {

    public static void main ( String [] args){
        //1] Arithmetic Operators - addition, substraction , multiplication, divison
        int salary=30000;
        int rent =4000;
        int grocery=5000;
        int otherExpenses=8000;

        int remainingAmount=salary - ( rent+ grocery + otherExpenses);
        System.out.println("Remaining amount is : "+remainingAmount);

        int yearlyInvestment=100000;
        int monthlyInvestment=yearlyInvestment/12;
        System.out.println("monthly investment :" + monthlyInvestment);

        float monthlySaving=5321.56f;
        float yearlySaving=monthlySaving *12;
        System.out.println("Total savings :" + yearlySaving);

        //modulo operator--will give remainder
        int num=100;
        int res=num%3;
        System.out.println(res);

        //  narrowing/widening of data type
//        Widening (Automatic Casting) – No Data Loss
//        When a smaller data type is converted to a larger data type,
//        Java does it automatically because the larger type can store the value safely.
        int marks = 85;
        double finalMarks = marks;  // automatic conversion (widening)

        System.out.println("Integer marks: " + marks);
        System.out.println("Converted to double: " + finalMarks);

        //Narrowing (Manual Casting) – Possible Data Loss
        //When a larger data type is converted to a smaller data type,
        //Java requires explicit casting, because data might be lost.
        double price = 99.99;
        int finalPrice = (int) price;   // explicit casting (narrowing)

        System.out.println("Original price: " + price);
        System.out.println("After conversion: " + finalPrice);

        //ex-
        double monthlySalary = 45678.75;
        int roundedSalary = (int) monthlySalary;

        System.out.println("Actual salary: " + monthlySalary);
        System.out.println("Rounded salary: " + roundedSalary);

        //2] Assignment Operator--> =  +=  -=  *=  /=  %=
        int number = 10;

        number += 5; // num = num + 5
        System.out.println(number); // 15

        number -= 3; // num = num - 3
        System.out.println(number); // 12

        number *= 2; // num = num * 2
        System.out.println(number); // 24

        //3]Relational Operator--> ==   !=   >   <   >=   <=
        int age = 20;

        System.out.println(age > 18);   // true
        System.out.println(age < 18);   // false
        System.out.println(age == 20);  // true
        System.out.println(age != 20);  // false

       // 4] Logical Operators--> &&   ||   !
        int personsAge = 25;
        boolean hasLicense = true;

        System.out.println(personsAge > 18 && hasLicense); // true
        System.out.println(personsAge > 18 || hasLicense); // true
        System.out.println(!hasLicense); // false

        //5] Unary Operators --> +  -  ++  --  !
        int num1 = 10;
        int result = +num1;

        System.out.println(result);

        int num2 = 10;
        int result2 = -num2;

        System.out.println(result2);

        //Prefix Increment--> ++a
        //Increment happens first, then value is used.
        int a = 5;
        int b = ++a;

        System.out.println(a); // 6
        System.out.println(b); // 6

        //Postfix Increment--> a++
        //Value is used first, then increment happens.
        int c = 5;
        int d = c++;

        System.out.println(c); // 6
        System.out.println(d); // 5

      //Decrement Operator --> --a
     //  Prefix Decrement--Subtracts 1 from the variable.
        int a1 = 10;
        int b1 = --a1;

        System.out.println(a1); // 9
        System.out.println(b1); // 9

        // postfix decrement
        int c1 = 10;
        int d1 = c1--;

        System.out.println(c1); // 9
        System.out.println(d1); // 10

        //Operator precedence is important because it decides which operation Java performs first
        // when multiple operators are used in one expression
        //Think of it like BODMAS in maths.
       // Operator Precedence (Highest → Lowest) in one line:() → ++ -- ! → * / % → + - → < > <= >= → == != → && → || → ?: → = += -= *= /= %=
        int expression = 10 + 5 * 2 - 4 / 2;

        System.out.println("Result: " + expression);

    }
}
