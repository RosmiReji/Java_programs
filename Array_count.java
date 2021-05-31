import java.util.Scanner;
class Array_count
{
public static void main (String args[])
{ 
   int n, x, count=0;

Scanner s=new Scanner(System.in);
System.out.print("Enter the no of elements");
n=s.nextInt();
   int a[]= new int[n];
System.out.println("Enter all elements");
for (int i=0;i<n;i++)
{
  a[i]=s.nextInt();
 }
System.out.println("Enter the element you want count");
x=s.nextInt();
for (int i=0;i<n;i++)
{
if (a[i] == x)
{
count++;
}
}
System.out.println("No. of occurence of the element "+count);

}
}

