public class HelloWorld{

     public static void main(String []args){
        
        
        int a = 19821238,even = 0,odd = 0;
        
        while(a>0){
         
            int temp = a%10;
            a = a/10;
            
            if(temp%2==0) even++;
            else odd++;
        }
        
        System.out.println("ODD- "+odd+"\nEVEN- "+even);
     }
}