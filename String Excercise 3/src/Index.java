import java.util.Scanner;
public class Index{
     public static void main(String []args){
        
         Scanner input = new Scanner(System.in);
         System.out.println(":: Enter the pattern ::");
         String pattern = input.nextLine();
         System.out.println(":: Enter the string ::");
         String string = input.nextLine();
         boolean flag = true;
         int strpos=0,pattpos=0;
         
         while(strpos<string.length()){
             if(string.charAt(strpos)==pattern.charAt(pattpos)){
                 strpos++;
                 pattpos++;
             }
             else if(pattern.charAt(pattpos)=='.'){
                 strpos++;
                 pattpos++;
             }
             else if(pattern.charAt(pattpos)=='*' && pattpos!=0){
                  if(string.charAt(strpos) == pattern.charAt(pattpos-1) ){
                      strpos++;
                  }
                  else if(string.charAt(strpos) == pattern.charAt(pattpos+1) || pattern.charAt(pattpos+1)== '.'){
                      pattpos+=2;
                      strpos++;
                  }
                  else{
                      flag = false;
                      break;
                  }
             }
             else{
                 flag= false;
                 break;
             }
         }
         System.out.println(flag);
     }
}