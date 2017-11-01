import java.util.*;
public class Index {
	public static void main(String args[]){
		
		int a[] = {2,3,7,1,8,5,11};
		int max;
		for(int i=0;i<a.length;i++){
			max = a[i];
			for(int j=0;j<a.length;j++){
				if(a[j]>a[i]){
					if(max==a[i]){
						max = a[j];
					}
					else if(max>a[j]){
						max = a[j];
					}
				}
			}
			if(max!=a[i])
				System.out.println(a[i]+" -> "+max);
			else
				System.out.println(a[i]+" -> -1");
		}
	}
}
