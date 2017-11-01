import java.util.*;
public class Index {
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("::Enter the ip::");
		String ip = input.next();
		
		int dot = 0;
		boolean flag = true;
		String temp = "";
		for(int i=0;i<ip.length();i++){
			if(ip.charAt(i) == '.'){
				dot++;
				if(!(0<=Integer.parseInt(temp) && Integer.parseInt(temp)<=255 )){
					flag = false;
				}
				temp = "";
			}
			else if(i==ip.length()-1){
				temp+= ip.charAt(i);
				if(!(0<=Integer.parseInt(temp) && Integer.parseInt(temp)<=255))
					flag = false;
				temp = "";
				
			}
			else{
				temp+= ip.charAt(i);
			}
		}
		
		if(flag && dot == 3)
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
	}
}
