package stringbuffer;
import java.util.*;
public class Assessment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     StringBuffer sb=new StringBuffer(s.next());
     int n=sb.length()-1;
     if(sb.charAt(0)=='x' && sb.charAt(sb.length()-1)=='x')
     {
    	 sb.deleteCharAt(0);
    	 sb.deleteCharAt(n-1);
    	 System.out.println(sb);
     }
     else
     {
    	 System.out.println(sb);
     }
     s.close();
     
	}
}
