
public class HelloWorld{

     public static void main(String []args){
        
        int a[] = {1,0,1,1,0,1,1,0,1,1,1,1};
        int count = 1;
        int c = 0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]==1 && c < count){
                System.out.print(a[i]+" ");
                ++c;
            }
            else if(a[i]==1 && c >=count){
                System.out.print(a[i]+" ");
                c =0;
                System.out.print("0 ");
            }
            else{
                System.out.print(a[i]+" ");
                c=0;
            }
        }
     }
}
