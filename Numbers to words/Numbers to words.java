public class HelloWorld{

     public static void main(String []args){
        
        int a = 23;
        int length = Integer.toString(a).length();
        int count = length-1;
        boolean flag = false;
        while(a>0){
            int num = a/(int)(Math.pow(10,count));
            a = a%(int)(Math.pow(10,count));
            
            if(count == 2){
                if(num == 1)
                    System.out.print("One Hundred ");
                else if(num == 2)
                    System.out.print("Two Hundred ");
                else if(num == 3)
                    System.out.print("Three Hundred ");
                else if(num == 4)
                    System.out.print("Four Hundred ");
                else if(num == 5)
                    System.out.print("Five Hundred ");
                else if(num == 6)
                    System.out.print("Six Hundred ");
                else if(num == 7)
                    System.out.print("Seven Hundred ");
                else if(num == 8)
                    System.out.print("Eight Hundred ");
                else if(num == 9)
                    System.out.print("Nine Hundred ");
            }
            else if(count == 1){
                if(num == 1 && !(count == length-1)){
                    System.out.print("and  ");
                    flag = true;
                }
                else if(num == 2 && !(count == length-1))
                    System.out.print("and Twenty ");
                else if(num == 3 && !(count == length-1))
                    System.out.print("and Thirty ");
                else if(num == 4 && !(count == length-1))
                    System.out.print("and Fourty ");
                else if(num == 5 && !(count == length-1))
                    System.out.print("and Fifty ");
                else if(num == 6 && !(count == length-1))
                    System.out.print("and Sixty ");
                else if(num == 7 && !(count == length-1))
                    System.out.print("and Seventy ");
                else if(num == 8 && !(count == length-1))
                    System.out.print("and Eighty ");
                else if(num == 9 && !(count == length-1))
                    System.out.print("and Ninety ");
                else if(num == 1 && (count == length-1)){
                    System.out.print(" ");
                    flag = true;
                }
                else if(num == 2 && (count == length-1))
                    System.out.print("Twenty ");
                else if(num == 3 && (count == length-1))
                    System.out.print("Thirty ");
                else if(num == 4 && (count == length-1))
                    System.out.print("Fourty ");
                else if(num == 5 && (count == length-1))
                    System.out.print("Fifty ");
                else if(num == 6 && (count == length-1))
                    System.out.print("Sixty ");
                else if(num == 7 && (count == length-1))
                    System.out.print("Seventy ");
                else if(num == 8 && (count == length-1))
                    System.out.print("Eighty ");
                else if(num == 9 && (count == length-1))
                    System.out.print("Ninety ");
                
            }
            else if(count == 0){
                if(num == 1 && flag)
                    System.out.print("eleven ");
                else if(num == 2  && flag)
                    System.out.print("twelve ");
                else if(num == 3 && flag)
                    System.out.print("thirteen ");
                else if(num == 4 && flag)
                    System.out.print("fourteen ");
                else if(num == 5 && flag)
                    System.out.print("fifteen ");
                else if(num == 6 && flag)
                    System.out.print("sixteen ");
                else if(num == 7 && flag)
                    System.out.print("seventeen ");
                else if(num == 8 && flag)
                    System.out.print("eighteen ");
                else if(num == 9 && flag)
                    System.out.print("nineteen ");
                else if(num == 1 && !flag)
                    System.out.print("and one ");
                else if(num == 2  && !flag)
                    System.out.print("and two ");
                else if(num == 3 && !flag)
                    System.out.print("and three ");
                else if(num == 4 && !flag)
                    System.out.print("and four ");
                else if(num == 5 && !flag)
                    System.out.print("and five ");
                else if(num == 6 && !flag)
                    System.out.print("and six ");
                else if(num == 7 && !flag)
                    System.out.print("and sevem ");
                else if(num == 8 && !flag)
                    System.out.print("and eight ");
                else if(num == 9 && !flag)
                    System.out.print("and nine ");
               
            }
            count--;
        }
    }
}        

