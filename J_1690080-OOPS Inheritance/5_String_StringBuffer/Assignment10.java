package stringbuffer;
import java.util.*;
public class Assessment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str =s.next();
		int n = 3;
		
		StringBuffer sb = new StringBuffer();
			
		for (int i = 0; i < n; i++) {
			sb.append(str.substring(str.length() - n));
		}

		System.out.println(sb);
		s.close();
	}

}
