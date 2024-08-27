package wrapperclasses;
import java.util.*;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
      System.out.print("Enter the number: ");
      int n=s.nextInt();
       if(n>=1 && n<=255)
       {
    	   String s1=String.format("%8s",Integer.toBinaryString(n)).replace(" ", "0");
           System.out.println(s1);
       }
       s.close();
       
     }
}
