import java.util.Scanner;
public class Index {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String string = new String();
		
		System.out.println("::Enter the encoded pattern::");
		string = input.nextLine();
		int a[] = new int[26];
		int i=0;
		while(i<string.length()){
			if(i+2 < string.length()){
				if(string.charAt(i+2) == '#'){
					a[Integer.parseInt(string.substring(i,i+2))-1]++;
					i += 3;
				}
				else if(string.charAt(i+2) != '#'){
					a[Character.getNumericValue(string.charAt(i))-1]++;
					i+=1;
				}
			}
			else{
				a[Character.getNumericValue(string.charAt(i))-1]++;
				if(i+1<string.length())
				a[Character.getNumericValue(string.charAt(i+1))-1]++;
				i+=2;
			}
			
		}
		for(int j =0;j<a.length;j++)
			System.out.print(a[j]+" ");
		
	}
}
