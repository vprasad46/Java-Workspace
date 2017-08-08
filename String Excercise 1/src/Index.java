import java.util.Scanner;
public class Index {
	
	public static void main(String args[]){
		
		int max_number;
		char fav_character;
		String words[];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("::Enter the number of words::");
		
		int n = input.nextInt();
		words= new String[n];
		
		System.out.println("::Enter the favorite character::");
		fav_character = input.next(".").charAt(0);
		
		System.out.println("::Enter the maximum length of the sentence::");
		max_number = input.nextInt();
		
		System.out.println("::Enter the words::");
		for(int i=0;i<n;i++){
			words[i] = input.next();
		}
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
					if(length(words[i],fav_character)+length(words[j],fav_character)<=max_number)
						System.out.println(words[i]+" "+words[j]);
			}
		}
		
	}
	
	public static int length(String input,char fav_character){
		int length=0;
		
		for(int i=0;i<input.length();i++){
			if(Character.toLowerCase(input.charAt(i))!=Character.toLowerCase(fav_character))
				length++;
			}
		
		return length;
	}

}
