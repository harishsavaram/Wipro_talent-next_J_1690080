package stringbuffer;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
         String s=sc.next();
         String s1=s.toLowerCase();
         StringBuffer sb=new StringBuffer(s);
         String s2=sb.reverse().toString();
         if(s1.equals(s2))
         {
        	 System.out.println(s2+ " is palindrome");
         }
         else
         {
        	 System.out.println(s2+ " is not a palindrome");
         }
         sc.close();
	}

}
