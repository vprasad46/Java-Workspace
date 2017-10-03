import java.util.Scanner;

public class Index{
     public static void main(String []args){
        
        System.out.println(":: Enter the size of the matrix::");
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int a[][] = new int[n][n];
        System.out.println("::Enter the matrix::");
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		a[i][j] = input.nextInt();
        	}
        }
        System.out.println("::1. 90degrees 2. 180degrees 3. 270degrees 4. 360degrees::");
        int r = input.nextInt();
        for(int i=0;i<r;i++)
        rotate90c(a);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
     }
     
     //Rotate array by 90 degrees clockwise
     public static void rotate90c(int a[][]){
         // Transpose
        for(int i=0;i<a[1].length;i++){
            for(int j=0;j<i;j++){
             int temp = a[i][j];
             a[i][j] = a[j][i];
             a[j][i] = temp;
            }
        }
        //Rotate
        for(int i=0;i<a[1].length;i++){
            for(int j=0;j<a[1].length/2;j++){
                a[i][j] += a[i][a[1].length-1-j];
                a[i][a[1].length-1-j] = a[i][j]-a[i][a[1].length-1-j];
                a[i][j] -=a[i][a[1].length-1-j];
            }
        }
     }
}