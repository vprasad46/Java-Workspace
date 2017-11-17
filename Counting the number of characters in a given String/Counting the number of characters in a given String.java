/* Input  = "aa-bioasjdhabbbas" 
Output = 
	a = 4
	b = 2
	s = 2
	d = 1
	h = 1
	i = 1
	j = 1
	- = 1
	o = 1
*/
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        
        String test = "aaaaaaaaaaaaaaaaaa";
        
        char arr[] = test.toCharArray();
        
        HashMap values = new HashMap();
        char last = '-';
        for(int i=0;i<test.length();i++){
            if(last != arr[i]){
                if(values.containsKey(arr[i]))
                    values.put(arr[i], (int)values.get(arr[i])+1);
                else
                    values.put(arr[i],1);
                last = arr[i];
            }
        }
        
        Iterator it = values.entrySet().iterator();
        while (it.hasNext()) {
		Map.Entry pair = (Map.Entry)it.next();
		System.out.println(pair.getKey() + " = " + pair.getValue());
		it.remove(); 
    	}
     }
}
