import java.util.*;
class complex
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the real and imaginary part of 1 st complex no:");
int a=s.nextInt();
int b=s.nextInt();
System.out.println("enter the real and imaginary part of 2 st complex no:");
int c=s.nextInt();
int d=s.nextInt();
System.out.println("complex numbers are:\n"+a+"+i"+b+"\n"+c+"+i"+d);
int p=a+c;
int f=b+d;
System.out.println("Added complex numbers is:"+p+"+i"+f);
}
}






