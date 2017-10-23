import java.util.*;
public class Index {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the number of array elements::");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("::Enter the elements::");
		for(int i = 0;i<arr.length;i++)
			arr[i] = input.nextInt();
		System.out.println("::Enter the sum for which the pairs to be found::");
		int sum = input.nextInt();
		
		HashMap hm = new HashMap();
		
		for(int i = 0; i<arr.length;i++){
		
			if (hm.containsKey(Integer.toString(sum-arr[i])))
					System.out.println("The pair is "+ (sum-arr[i]) +" "+arr[i]);
			else
				hm.put(Integer.toString(arr[i]),"dummy_value");
		}
	}
}
