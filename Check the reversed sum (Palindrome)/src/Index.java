import java.util.*;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the number::");
		String inp = input.next();
		String rev_inp = "";
		
		for(int i=inp.length()-1;i>=0;i--){
			rev_inp+= inp.charAt(i);
		}
		int sum = Integer.parseInt(inp)+Integer.parseInt(rev_inp);
		
		System.out.println(isPalindrome(Integer.toString(sum)));
	}
	
	public static boolean isPalindrome(String s){		
		for(int i=0;i<s.length()/2;i++){
			if(!(s.charAt(i)==s.charAt(s.length()-1-i)))
				return false;	
		}
		
		return true;
	}
}
