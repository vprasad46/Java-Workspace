import java.util.Scanner;
public class Index {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("::Enter the number of iterations::");
		int n = input.nextInt();
		String string = "1";
		int count = 0;
		System.out.println(string);
		while(n>0){
				String loopstring= "";
				char temp = string.charAt(0);
			for(int i=0;i<string.length();i++){
			 if(string.charAt(i)!=' '){
				if(string.charAt(i)==temp){
					count++;
					if(i==string.length()-1){
						System.out.print(count+" "+temp);
						loopstring+=count+" "+temp;
					}
				}
				else{
					System.out.print(count+" "+temp+" ");
					loopstring+=count+" "+temp+" ";
					temp = string.charAt(i);
					count = 1;
					if(i==string.length()-1){
						System.out.print(count+" "+temp);
						loopstring+=count+" "+temp;
					}
				}
			  }
			}
			string = new String(loopstring);
			count = 0;
			
			System.out.println();
		 n--;
		}
	}

}
