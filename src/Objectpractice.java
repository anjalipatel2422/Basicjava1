

public class Objectpractice{
    public  void calc(){

            int ans;
            int a=20;
            int b=30;


            ans=a+b;
            System.out.println("The addition of "+a+" +"+b+"=" +ans);

            ans=a-b;
            System.out.println("The sub" +
                    "traction of "+a+"-" +b+" ="+ans);

            ans=a*b;
            System.out.println("The multiplication of"+a+"*"+b+"="+ans);

            ans=a/b;
        System.out.println("The division of "+a+"/"+b+"="+ans);

        ans=a%b;
        System.out.println("The modulus of "+a+"%"+b+"="+ans);
     }

    public static void main(String[] args)
    { Objectpractice objectpractice=new Objectpractice();
        objectpractice.calc();
        //calc();
        System.out.println();
    }}




