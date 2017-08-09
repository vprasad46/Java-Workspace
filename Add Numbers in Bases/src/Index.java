import java.util.Scanner;
public class Index {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the base::");
		int base = input.nextInt();
		
		System.out.println("::Enter the numbers to be added::");
		
		int number1=input.nextInt();
		int number2=input.nextInt();
		int pow = 0, result = 0,rem =0;
		while((number1>number2?number1:number2)>0){
			
			int n1,n2;
			n1= number1%10;
			number1= number1/10;
			
			n2 = number2%10;
			number2 = number2/10;
		
			
			rem = rem+n1+n2;
			result+= Math.pow(10, pow)*(rem%base);
			rem = rem/base;
			
			pow++;			
			
		}
		System.out.println("::The Sum is::");
		if(rem==0)
		System.out.println(result);
		else
			System.out.println((int)(result+(Math.pow(10,pow)*rem)));
		
	}

}
