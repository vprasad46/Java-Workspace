import java.util.Scanner;
public class Index{
     public static void main(String []args){
       Scanner input = new Scanner(System.in);
       System.out.println("::Enter the parent String::");
       String one = input.nextLine();
       System.out.println("::Enter the subString to be Checked::");
       String two = input.nextLine();
       int flag = -1,i=0,j=0;
       while(j<two.length()&&i<one.length()){
           if(two.charAt(j) == one.charAt(i)){
               if(j==0)
               flag = i;
               j++;
               i++;
           }
           else{
               i++;
               j=0;
               flag = -1;
           }
        }
        if(j<two.length()){
            System.out.println(-1);
        }
        else{
            System.out.println(flag);
        }
     }
}