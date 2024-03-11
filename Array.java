import java.util.*;
class Array
{
public static void main(String args[])
{
int a[]=new int[10];
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of array:");
 int n=sc.nextInt();
System.out.println("Enter a array:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println("The sum is:"+sum);
int avg=sum/n;
System.out.println("The Average is:"+avg);
}
}


