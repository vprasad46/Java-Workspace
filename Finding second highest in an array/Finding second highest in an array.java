public class HelloWorld{

     public static void main(String []args){
        
        int a[] = {4,1,2,7,5,7,9,8,6,5,3,12,2,11,20,129,2};
        
        int highest = a[0];
        
        int second_highest = -1;
        
        for(int i=0;i<a.length;i++){
            if(highest<a[i]){
                second_highest = highest;
                int temp = highest;
                highest = a[i];
                a[i] = temp;
            }
            else if(second_highest<a[i] && highest>a[i]){
                second_highest = a[i];
            }
        }
        if(second_highest != -1)
            System.out.println(second_highest);
        else
            System.out.println("No second Maximum");
     }
}
