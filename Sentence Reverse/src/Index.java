import java.util.Scanner;
public class Index {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the sentence to be reversed::");
		String in = input.nextLine();
		
		char arr[] = in.toCharArray();
		
		int st,end= arr.length;
		
		for(int i = arr.length-1;i>=0;i--){
			if(arr[i]==' '||i==0){
				if(i==0) st = i;
				else st = i+1;
				for(int j=st;j<end;j++)
					System.out.print(arr[j]);
				System.out.print(" ");
				end = i;
			}	
		}
		
		
		
	}

}
