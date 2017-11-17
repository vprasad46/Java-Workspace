// Input = "A man, in the boat says:I see 1-2-3 in the sky"; Output = "y kse, ht ni3 21ee sIsy:a sta o-b-e ht nin amA"

public class HelloWorld{

     public static void main(String []args){
        
        String input = "A man, in the boat says:I see 1-2-3 in the sky";
        int count = 0;
        for(int i=input.length()-1;i>=0;){
            if(input.charAt(count)==',' ||input.charAt(count)==' '||input.charAt(count)==':'||input.charAt(count)=='-'){
                System.out.print(input.charAt(count));
                count++;
            }
            else if(input.charAt(i)==',' ||input.charAt(i)==' '||input.charAt(i)==':'||input.charAt(i)=='-'){
                i--;
               continue;
            }
            else{
                System.out.print(input.charAt(i));
                i--;
                count++;
            }
        }
     }
}
