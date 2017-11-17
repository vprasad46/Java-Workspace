import java.util.*;
public class HelloWorld{
     public static void main(String []args){
       
       int a[] = {2,8,10,4};
       
       
       for(int i=0;i<4;i++){
        
         int square = a[i]*a[i];
         
         if(is(square*5-4)||is(square*5+4))
            System.out.println(a[i]);
       }
     }
     
     public static boolean is(int number){
         
         int sq = (int)Math.sqrt(number);
         
         return(number == sq*sq);
     }
	
// public static boolean isfibonacci(int n){
//         int i=1;
//         int next_num = 1;
//         boolean flag= false;
//         while(i<=n){
//             int temp = next_num;
//             next_num+=i;
//             i = temp;
//             if(next_num==n) flag = true;
//         }
 
//         if((n==0||n==1)) return true;
//         else if(flag) return true;
//         return false;
//     }
}
