
/* Input = "a1b5"; Output = "abbbbb"*/


public class Index{

     public static void main(String []args){
        
        String temp = "a1b10";
        char a = temp.charAt(0);
        String num = "";
        for(int i=1;i<temp.length();i++){
            if((int)temp.charAt(i)>=(int)'a' && (int)temp.charAt(i)<=(int)'z'){
                for(int j=0;j<Integer.parseInt(num);j++)
                    System.out.print(a);
                num = "";
                a  = temp.charAt(i);
            }
            else if(i==temp.length()-1){
                num+= temp.charAt(i);
                 for(int j=0;j<Integer.parseInt(num);j++)
                    System.out.print(a);
                num = "";
            }
            else{
                num+= temp.charAt(i);
            }
        }
     }
}


