import java.util.*;
public class HelloWorld{

    public static void main(String []args){
    
        int a[][]={{1,0,1,1,1},{1,1,0,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,0,1,1,1},{1,0,1,1,1}};
        boolean flag = false;
        
        for(int i=0;i<a.length;i++){
         flag = checkb4(a,i);
         if(flag){
             
             for(int j=0;j<a[i].length;j++){
                 System.out.print(a[i][j]+" ");
             }
             System.out.println();
          }
        }
    }
    
    public static boolean checkb4(int arr[][],int index){
        int count=0;
        if(index != 0){
            for(int i=index-1;i>=0;i--){
             for(int j=0;j<arr[0].length;j++){
                   if(arr[i][j]==arr[index][j])
                        count++;
             }
             if(count == arr[0].length)
                return false;
            count =0;
            }
        }
        return true;
    }
}
