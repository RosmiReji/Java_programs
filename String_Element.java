public class String_Element
{  
public static void main(String args[])
{  
System.out.println("****Create new string using new***");
String s1="java";
char ch[]={'s','t','r','i','n','g','s'};  
String s2=new String(ch);
String s3=new String("objectoriented");
System.out.println(s2);  
System.out.println(s3);  
System.out.println("\n***Getting String length***");
int length =s2.length();
System.out.println("\nThe length of the String \""+s2+"\" is: " +length);
System.out.println("\n***String Concatenation***");
s2=s2.concat(" is immutable so assign it explicitly");  
System.out.println(s2);
System.out.println("\n***Character Extraction***");
char s=s1.charAt(2);
System.out.println(s);
System.out.println("\n***String Comparison***");
System.out.println(s1.compareTo(s2));
System.out.println("\n***Searching Substrings***");
int firstIndex = s2.indexOf('s');
System.out.println("First occurrence of char 's'" + " is found at : " + firstIndex);
int lastIndex = s2.lastIndexOf('s');
System.out.println("Last occurrence of char 's' is" + " found at : " + lastIndex);
System.out.println("\n***Modifying String***");
String s4="javatpoint is a very good website";  
String replaceString=s4.replace('a','e'); 
System.out.println(replaceString);
System.out.println("\n***Data conversion using valueOf***"); 
String  sample = String.valueOf(ch, 0, 3);
System.out.println(sample);
}
}