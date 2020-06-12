public class ArithmeticOperators
{


    static int ans;//static global variable
    static int a=48;// static global variable
    static int b=30;// static global variable

    static void add(){//static method without parameter
        ans=a+b;
        System.out.println("The addition of "+a+"+"+b+ "is "+ans);
    }

        static void sub(){
        ans=a-b;
            System.out.println("The subtraction of "+a+"-"+b+" is "+ans);

    }
    static void multiplication(){
        ans=a*b;
        System.out.println("The multiplication of"+a+"*"+b+" is "+ans);
    }
    static void division(){
        ans=a/b;
        System.out.println("The division of"+a+"/"+b+" is " +ans);
    }
static void modulus(){
        ans=a%b;
    System.out.println("The modulus of "+a+" %"+b+" is" +ans);
}





















    public static void main(String[] args)
    {
add();
sub();
multiplication();
division();
modulus();


    }
}
