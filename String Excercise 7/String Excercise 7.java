/* Input = "nnnnnnnnn"
   Output = 
		n       n
		 n     n
		  n   n
		   n n
		    n
		   n n
		  n   n
		 n     n
		n       n
*/
public class HelloWorld{

     public static void main(String []args){
     
         String temp = "nnnnnnnnn";
         
         for(int i=0;i<temp.length();i++){
             if(i<(temp.length()-1)/2){
                 for(int j=0;j<i;j++)
                    System.out.print(" ");
                 System.out.print(temp.charAt(i));
                    for(int j=0;j<temp.length()-2-(2*i);j++)
                         System.out.print(" ");
                 System.out.print(temp.charAt(temp.length()-i-1));
             }
            else if(i == (temp.length()-1)/2){
                for(int j=0;j<i;j++)
                    System.out.print(" ");
                System.out.print(temp.charAt(i));
            }
            else{
                for(int j=0;j<temp.length()-i-1;j++)
                    System.out.print(" ");
                System.out.print(temp.charAt(i));
                for(int j=0;j<(2*(i-((temp.length()-1)/2)))-1;j++)
                    System.out.print(" ");
                System.out.print(temp.charAt(temp.length()-i-1));
            }
            System.out.println();
        }
     }
}        

