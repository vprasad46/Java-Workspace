
public class HelloWorld{

     public static void main(String []args){
        
        for (int i=0;i<16;i++){
            int temp = i;
            String temp1 = "";
            while(temp>0){
                temp1+=(char)temp%2;
                temp/=2;
            }
            if(temp1.length()<4){
                for(int j=0;j<4-temp1.length();j++)
                    System.out.print("0 ");
            }
            for(int k = temp1.length()-1;k>=0;k--)
                System.out.print(temp1.charAt(k)+" ");
            System.out.println();
        }
        
     }
}
