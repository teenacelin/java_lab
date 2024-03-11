import java.util.*;
class Reverse
{
public static void main(String args[])
{
System.out.println("Enter a string:");
String a,rev="";
Scanner ob= new Scanner(System.in);
a=ob.nextLine();
int l=a.length();
for(int i=l-1;i>=0;i--)
{
rev=rev+a.charAt(i);
}
System.out.println("Reverse of a string is:"+rev);
}
}


