import java.util.Scanner;

public class Index {

	
	public static void main(String args[]){
		
		Memory[] memory = new Memory[10];
		Scanner input = new Scanner(System.in);
		boolean exit=true;
		int count = 0,ch;
		while(exit==true){
			System.out.println("******************************************************");
			System.out.println("Enter 1.Adding elements 2. Accessing elements 3.Exit: ");
			System.out.println("******************************************************");
			ch = input.nextInt();
			
			switch(ch){
			
			case 1: {
						if(count<10){
							System.out.println("Enter the value for the "+(count+1)+" key: ");
							int value = input.nextInt();
							memory[count] = new Memory(count,value);
							System.out.println("******************************************************");
							System.out.println("-------------------------------------------------------");
							System.out.println("|\tKey\t|\tValue\t|\tCount\t|");
							System.out.println("-------------------------------------------------------");
							for(int i=0;i<=count;i++)
								System.out.println("|\t"+(memory[i].getkey()+1)+"\t|\t"+memory[i].getvalue()+"\t|\t"+memory[i].getcount()+"\t|");
							System.out.println("-------------------------------------------------------");
							System.out.println("******************************************************");
							count++;
						}
						else{
							int least=0,key=0;
							least = memory[0].getcount();
							for(int i=1;i<10;i++){
								if(least>=memory[i].getcount()){ 
									key=memory[i].getkey(); 
								 	least=memory[i].getcount();
								}
							}
							System.out.println("The key, lowest accessed is "+ (key+1));
							System.out.println("Enter the value for the "+(key+1)+ " key: ");
							int value = input.nextInt();
							memory[key].setvalue(value);
						    System.out.println("******************************************************");
							System.out.println("-------------------------------------------------------");
							System.out.println("|\tKey\t|\tValue\t|\tCount\t|");
							System.out.println("-------------------------------------------------------");
							for(int i=0;i<10;i++)
								System.out.println("|\t"+(memory[i].getkey()+1)+"\t|\t"+memory[i].getvalue()+"\t|\t"+memory[i].getcount()+"\t|");
							System.out.println("-------------------------------------------------------");
							System.out.println("******************************************************");
						}
				}
				break;
			case 2:{
				System.out.println("Enter the key to be accessed: ");
				int key= input.nextInt();
				System.out.println("The Key is "+(memory[key-1].access().getkey()+1)+" and the value is "
						+memory[key-1].access().getvalue());
				
			}
			break;
					
			case 3:{
				for(int i =0;i<count;i++){
					
					System.out.println("* The key is "+memory[i].getkey()+" and the value is "+memory[i].getvalue()+" *");
				}
				System.out.println("Bye Bye...!");
				exit = false;
			}
			
			}
			
		}
	}
	
	
}
	