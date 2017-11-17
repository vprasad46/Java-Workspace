public class HelloWorld{

     public static void main(String []args){
        String input = "gfF!@";
        boolean lower=false,upper=false,special=false,length=false,number=false;
        if(input.length()>=8) length = true;
        for(int i=0;i<input.length();i++){
            if((int)input.charAt(i)>=(int)'a' && (int)input.charAt(i)<=(int)'z')
                lower = true;
            else if((int)input.charAt(i)>=(int)'A' && (int)input.charAt(i)<=(int)'Z')
                upper = true;
            else if(input.charAt(i)=='!'||input.charAt(i)=='@'||input.charAt(i)=='#'||input.charAt(i)=='$'||input.charAt(i)=='%'||input.charAt(i)=='^'||input.charAt(i)=='&'||input.charAt(i)=='*'||input.charAt(i)=='('||input.charAt(i)==')'||input.charAt(i)=='-'||input.charAt(i)=='+')
            special = true;
            else if((int)input.charAt(i)>=(int)'0' && (int)input.charAt(i)<=(int)'9')
            number = true;
        }
        if(lower&&upper&&special&&length&&number)
            System.out.println("Strong");
        else if(lower&&upper&&special)
            System.out.println("Medium");
        else
            System.out.println("Weak");
        
     }
}
