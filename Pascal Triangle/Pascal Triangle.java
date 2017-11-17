import java.util.*;
public class HelloWorld{

 public static void main(String []args){
    
    int rows = 9,number = 1;
    
    for(int i =0 ;i<rows;i++){
        
        for(int k =rows-i-1; k>0;k--)
            System.out.print(" ");
        number = 1;
        for(int j=0;j<=i;j++){
            System.out.print(number+ " ");
                 number = number * (i - j) / (j + 1);
        } 
        System.out.println();
    }
  }
}
