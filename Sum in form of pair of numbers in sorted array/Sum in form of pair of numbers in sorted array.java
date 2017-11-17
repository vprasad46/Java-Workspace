import java.util.*;
public class HelloWorld{
     public static void main(String []args){
     
        int a[] = {1,3,4,8,10};
        int sum = 2;
        int csum = 0;
        for(int i=0;i<a.length;i++){
            if(sum - a[i] >= a[i]){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]+a[j] == sum)
                        System.out.println("TRUE");
                    else 
                        System.out.println("FALSE");
                }
            }
        }
     }
}
