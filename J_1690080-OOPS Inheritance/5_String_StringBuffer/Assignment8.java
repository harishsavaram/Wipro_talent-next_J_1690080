package stringbuffer;
import java.util.*;
public class Assessment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       String s1=s.next();
       String[] str=s1.split(".[\\*]+.");
       StringBuffer sb=new StringBuffer();
       for(String x:str)
       {
    	   sb.append(x);
       }
       System.out.println(sb);
       s.close();
    }

}
