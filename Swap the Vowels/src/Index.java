import java.util.Scanner;
public class Index {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("::Enter the String whose vowels to be swapped::");
		String string = input.nextLine();
		char arr[]=string.toCharArray();
		
		int x=0,y=string.length()-1;
		boolean flagx=false,flagy=false;
		while(x<y){
			
			if(flagx==false&&(arr[x]=='a'||arr[x]=='e'||arr[x]=='i'||arr[x]=='o'||arr[x]=='u'))
				flagx=true;
			
			else if(flagy==false&&(arr[y]=='a'||arr[y]=='e'||arr[y]=='i'||arr[y]=='o'||arr[y]=='u'))
				flagy=true;
			
			else if(flagx==true&&flagy==true){
				char temp=arr[x];
				arr[x]=arr[y];
				arr[y]=temp;
				x++;y--;
				flagx=false;
				flagy=false;
			}
			else{
				if(!flagx) x++;
				if(!flagy) y--;
			}
			
		}
		System.out.println("::Output::");
		System.out.println(arr);
	
	}

}
