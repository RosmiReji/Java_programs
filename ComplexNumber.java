import java.util.Scanner;
class ComplexNumber
{
   	double real, img;
    	void read()
    	{
           		Scanner s=new Scanner(System.in); 
		System.out.print("Enter the real part ");   
                  	real=s.nextInt();  
		System.out.print("Enter the imginary part ");   
                 		img=s.nextInt();  
    	}
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2)
   	{      
        		 ComplexNumber temp = new ComplexNumber();
        		 temp.real = c1.real + c2.real;
        		 temp.img = c1.img + c2.img;  
 		 return temp;         
                 }     
    	public static void main(String args[]) 
      	{
		ComplexNumber c1 = new ComplexNumber();
		ComplexNumber c2 = new ComplexNumber();
                  	System.out.println("Enter the real and imaginary of first number");
                 	 	c1.read();
 		System.out.println("Enter the real and imaginary of Second number");
		c2.read();
           		ComplexNumber temp = sum(c1, c2);
		System.out.printf("Sum is: "+ temp.real +" + "+ temp.img +"i");
        
    	}
}
