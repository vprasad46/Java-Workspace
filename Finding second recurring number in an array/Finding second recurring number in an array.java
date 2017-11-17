import java.util.*;
public class HelloWorld{
     public static void main(String []args){
        
        int a[] = {1,1,1,1,1,1,1,2,3,3,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,6,6};
        int n1 =-1, fcount=-1,n2 =- 1,scount=-1;
        for(int i=0;i<a.length;i++){
            int count = 0;
         for(int j=0;j<a.length && i!=j;j++){
             if(a[i]==a[j])
              count++;
         }
         if(count>fcount){
            if(n1 != a[i]){
                scount = fcount;
                n2 = n1;
            }
            fcount = count;
            n1 = a[i];
         }
         else if(count<fcount && count>scount){
             scount = count;
             n2 = a[i];
         }
       }
       if(n2==-1)
        System.out.println("No Second number");
       else
       System.out.println(n2+" for "+(scount+1)+" times.");
    }
}
