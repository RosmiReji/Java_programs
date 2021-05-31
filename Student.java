import java.util.Scanner;
public class Student
{
 public static void main(String[] args)
{
int m1,m2,m3,tot=0,p;
int a[]=new int[3];
Scanner s= new Scanner(System.in);

System.out.println("Enter the marks in 100");
for(int i=0;i<3;i++)
{
a[i]=s.nextInt();
tot=tot+a[i];
}
p=(tot*100)/300;
System.out.println("Total Mark:" +tot);
System.out.println("Percentage:" +p +"%");
}
}


   