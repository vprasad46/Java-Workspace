import java.util.*;
public class HelloWorld{
     public static void main(String []args){
     
        int a[] = {6,1,1,3,7,6,5,4,1,8,2,9};
        int b[] = {7,9,9,1,2,6,4,8,7};
        int c[] = new int[a.length+b.length];
        Arrays.fill(c, -1);
        int rem = 0;
        
        
        for(int i=0;i<((a.length>=b.length)?a.length:b.length);i++){
            
            if(i<b.length && i<a.length){
                c[i] = (a[i]+b[i]+rem)%10;
                rem =  (a[i]+b[i]+rem)/10;
            }
            else if(i<a.length && i>=b.length){
                c[i] = (a[i]+rem)%10;
                rem =  (a[i]+rem)/10;
            }
            else if(i<b.length && i>=a.length){
                c[i] = (b[i]+rem)%10;
                rem =  (b[i]+rem)/10;
            }
        }
         
        for(int i=c.length-1;i>=0;i--)
            if(c[i]!=-1)
             System.out.print(c[i]+" ");
     }
}
