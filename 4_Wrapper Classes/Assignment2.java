package wrapperclasses;
import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=Integer.parseInt(s.next());
		System.out.println("Given number :"+num);
		System.out.println("Binary equivalent :"+Integer.toBinaryString(num));
		System.out.println("Octal equivalent :"+Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent :"+Integer.toHexString(num));
        s.close();
	}

}
