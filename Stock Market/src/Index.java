import java.util.Scanner;
public class Index {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the number of days::");
		
		int days = input.nextInt();
		
		int[] value = new int[days];
		System.out.println("::Enter the value for each day::");
		for(int i=0;i<days;i++){
			value[i]=input.nextInt();
		}
		
		int buy=value[0],sell=0,profit=0;
		
		for(int i=0;i<days;i++){
			
			if(buy>=value[i])
			{	
				if(sell!=0){
					System.out.println("Buy at "+buy+" and Sell at "+sell);
					profit += (sell-buy);
				}
				buy=value[i]; 
					
			} 
			else if(buy<value[i]&&sell<=value[i]){
				
				sell=value[i];
				if(i==days-1){
					System.out.println("Buy at "+buy+" and Sell at "+sell);
					profit += (sell-buy);
				}
			}
			else{
				System.out.println("Buy at "+buy+" and Sell at "+sell);
				profit+=(sell-buy);
				sell=0;
				buy=value[i];	
			}
		
		}
		System.out.println("Total Profit: "+profit);	
	}

}
