public class LogicalRelationaloperators
{
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int c=30;
        // logical operators
        System.out.println(a<b&&a<c);//false&&true=false
        System.out.println(a>b&&a<c);//true&&false=true
        System.out.println(a>b||a<c);//true||true=true
        System.out.println(b<c||c>a);//true||true=true

        // relational operators
        System.out.println("a==b=" +(a==b));
        System.out.println("a!=b="+(a!=b));
        System.out.println("a<b= "+(a<b));
        System.out.println("a>b="+(a>b));
        System.out.println("a>=b"+(a>=b));
        System.out.println("a<=b"+(a<=b));



    }
}
