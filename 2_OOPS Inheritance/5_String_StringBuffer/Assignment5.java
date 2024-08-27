package stringbuffer;
import java.util.*;
public class Assessment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      StringBuffer sb=new StringBuffer(s.next());
      int n=sb.length()-1;
      sb.deleteCharAt(0);
      sb.deleteCharAt(n-1);
      System.out.println(sb);
      s.close();
	}

}
