public class HelloWorld{

     public static void main(String []args){
        
        char arr[][] = {{'a','z','o','l'},{'n','x','h','o'},{'v','y','i','v'},{'o','r','s','e'}};
        String find = "ohiv";
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] == find.charAt(0))
                    search(arr,find,i,j,0);
            }
        }
        
     }
     
     public static void search(char arr[][], String find, int i_ind, int j_ind, int st_ind){
        
          if(st_ind == find.length()-1){
              System.out.println(find);
          }
          else if(i_ind+1<arr.length && find.charAt(st_ind+1) == arr[i_ind+1][j_ind]){
              search(arr,find,i_ind+1,j_ind,st_ind+1);
          }
          else if(j_ind+1<arr.length && find.charAt(st_ind+1) == arr[i_ind][j_ind+1]){
              search(arr,find,i_ind,j_ind+1,st_ind+1);
          }
      
     }
}
