import java.util.Scanner;
public class Index {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        String string;
        System.out.println("Enter the String: ");
        string = input.nextLine();
        char arr[] = string.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            checkb4(i,arr);
        }
        
        System.out.println(arr);
    }
    
    public static void checkb4(int pos,char arr[]){
        
        for(int i=pos-1;i>=0;i--){
            if(arr[i]==arr[pos]){
                 if((char)(arr[i]+1)=='{'||(char)(arr[i]+1)=='['){
                  arr[pos]=(char)(arr[i]-25);
                  }
                 else if((char)(arr[i]+1)==':'){
                      arr[pos]=(char)(arr[i]-9);
                  }
                 else
                    arr[pos]= (char)(arr[i]+1);
                 checkb4(pos,arr);
            }
        }
    }
}