package stringbuffer;
import java.util.*;
public class Assessment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     StringBuffer sb=new StringBuffer(s.next());
     int n=sb.length();
     String s1=sb.substring(0, 2);
     for(int i=0;i<n;i++)
     {
    	 System.out.print(s1);
     }
     s.close();
	}

}
