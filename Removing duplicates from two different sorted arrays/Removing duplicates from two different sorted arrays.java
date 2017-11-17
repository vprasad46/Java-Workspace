import java.util.*;

public class HelloWorld{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,8,9};
		int arr2[] = {1,2,3,5,7,8,10,12};
		int c1=0,c2=0;
		while(c1<arr.length || c2<arr2.length){
			if(c1<arr.length && c2<arr2.length && arr[c1]==arr2[c2]){
				System.out.print(arr[c1]+" ");
				c1++;c2++;
			}
			else if(c1<arr.length && c2<arr2.length && arr[c1]<arr2[c2]){
				System.out.print(arr[c1]+" ");
				c1++;
			}
			else if(c1<arr.length && c2<arr2.length && arr2[c2]<arr[c1]){
				System.out.print(arr2[c2]+" ");
				c2++;
			}
			else if(c1<arr.length || c2<arr2.length){
				if(c1<arr.length){
					System.out.print(arr[c1]+" ");
					c1++;
				}
				else if(c2<arr2.length){
					System.out.print(arr2[c2]+" ");
					c2++;	
				}
			}
		}
	}
}