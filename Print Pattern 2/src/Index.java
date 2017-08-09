import java.util.Scanner;
public class Index {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the number of lines::");
		int n = input.nextInt();
		
		for(int i=1;i<=n;i++){
			System.out.print(i+" ");
			int sum = i;
				for(int j=0;j<n-i;j++){
					sum+= n-j;
					System.out.print(sum+" ");
			}
			System.out.println();	
		}	
	}
}
