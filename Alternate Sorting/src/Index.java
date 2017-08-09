import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("::Enter the number of elements in the array::");
		int n= input.nextInt();
		
		int a[] = new int[n];
		System.out.println("::Enter the elements::");
		for(int i=0;i<n;i++) a[i] =input.nextInt();
		System.out.println("::Output::");
		for(int i=0;i<(n+1)/2;i++){
			if(i==((n+1)/2)-1)
				System.out.print(a[i]+" ");
			else
			System.out.print(a[i]+" "+a[n-i-1]+" ");
			
		}
			
		
	
	}
}
