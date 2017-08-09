import java.util.Scanner;
public class Index {
	
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		System.out.println("::Enter the number for which the Column name to be displayed::");
		int n = input.nextInt();
		System.out.println(ExcelColumnFromNumber(n));
	}
	
	public static String ExcelColumnFromNumber(int n){
		
		String result="";
		
		while(n>0){
			int numeral = (n-1)%26;
			char numerl = (char)(numeral+65);
			result = numerl + result;
			n = (n-numeral+1)/26;
		}
		return result;
	}

}
