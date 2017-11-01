import java.util.*;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("::Enter the number::");
		int n = input.nextInt();
		int count = 0;
		
		while(n>0){
			n = return_square(n);
			count++;
		}
		
		System.out.println(count);
	}
	
	public static int return_square(int n){
		int a = 1;
		boolean flag = true;
		while(flag){
			if(a*a>n){
				a--;
				flag = false;
			}
			else
				a++;
		}
		return (n-a*a);
		
	}
}
