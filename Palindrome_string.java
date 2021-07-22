import java.util.*;
public class palindrome_string {
    public static void main(String args[])
    {
String s1;
String reverse="";
Scanner sc=new Scanner(System.in);
s1=sc.nextLine();
for(int i=s1.length()-1;i>=0;i--)
{
    reverse=reverse +s1.charAt(i);
}
if(s1.equals(reverse))
System.out.println("Palindrome ");
else
System.out.println("Not Palindrome");

    }
    
}
