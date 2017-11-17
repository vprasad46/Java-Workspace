import java.util.*;
public class HelloWorld{
     public static void main(String []args){
     
        int a[] = {1,2,3,4};
        int sum = -100000,b=-1,e=-1; 
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int tsum = 0;
                for(int k = i;k<=j;k++)
                    tsum+=a[k];
                if(tsum>=sum){
                    sum = tsum;
                    b=i;
                    e=j;
                }
            }
        }
        
        System.out.println(b+" "+e);
     }
}
