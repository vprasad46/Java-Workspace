
// Question available at https://drive.google.com/file/d/0B3BsuS5MSA08b1NmNE1TZ2R0d0U/view?usp=sharing
import java.util.*;
public class Index {
	public static void main(String args[]){
		LinkedHashMap<Integer,Integer[][]> seats = new LinkedHashMap<Integer,Integer[][]>();
		int i=1;

		seats.put(0,new Integer[2][3]);
		seats.put(1, new Integer[3][4]);
		seats.put(2,new Integer[3][2]);
		seats.put(3,new Integer[4][3]);
		
		//aisle seats
		for(int j=0;j<4 && i<=30;j++){
			for(Map.Entry<Integer, Integer[][]> entry: seats.entrySet()){
				
				Integer[][] temp = (Integer[][])entry.getValue();
				if(j<=temp.length-1){
				
				for(int k=0;k<temp[j].length&&i<=30;k++){
						if(temp[j][k] == null && !(entry.getKey()==0 && k==0) && !(entry.getKey()==3 && k==temp[j].length-1) && (k==0 || k==temp[j].length-1) ){
						temp[j][k] = i++;
						}
						
					}
				}	
			}
		}
		
		// window seats
		for(int j=0;j<4 && i<=30;j++){
			for(Map.Entry<Integer, Integer[][]> entry: seats.entrySet()){
				
				Integer[][] temp = (Integer[][])entry.getValue();
				if(j<=temp.length-1){
				
				for(int k=0;k<temp[j].length&&i<=30;k++){
						if(temp[j][k] == null && ((entry.getKey()==0 && k==0) || (entry.getKey()==3 && k==temp[j].length-1))){
							temp[j][k] = i++;
						}
						
					}
				}	
			}
		}
		
		//middle seats
		for(int j=0;j<4 && i<=30;j++){
			for(Map.Entry<Integer, Integer[][]> entry: seats.entrySet()){
				
				Integer[][] temp = (Integer[][])entry.getValue();
				if(j<=temp.length-1){
				
				for(int k=0;k<temp[j].length&&i<=30;k++){
						if(temp[j][k] == null ){
						temp[j][k] = i++;
						}
					}
				}	
			}
		}

		for(Map.Entry<Integer, Integer[][]> entry: seats.entrySet()){
			Integer[][] temp1 = (Integer[][])entry.getValue();
			
			for(int j=0;j<temp1.length;j++){
				for(int k=0;k<temp1[j].length;k++){
					System.out.print(temp1[j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("------------");
		}
	}
}
