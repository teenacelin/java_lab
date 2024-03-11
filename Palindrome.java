import java.util.*;
class Palindrome
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
if(a.equals(rev))
System.out.println("Palindrome");
else
System.out.println(" Not Palindrome");
}
}


