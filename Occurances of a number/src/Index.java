import java.util.Scanner;
public class Index {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the count::");
		
		int n = input.nextInt();
		
		int[] number= new int[n];
		System.out.println("::Enter the numbers::");
		for(int i=0;i<n;i++){
			number[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++){
			int count = 0;
			if(number[i]!=0){
				for(int j=0;j<n;j++){
						if(number[i]==number[j]&&i!=j){count++;number[j]=0;}
				}
				System.out.println("The number is "+number[i]+" and it is repeated "+(count+1)+" times");
			}
		}
	}
}
