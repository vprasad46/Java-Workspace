import java.util.*;

public class Index {
	
	public static void main(String args[]){
		
		HashMap<String, LinkedList> family = new HashMap<String, LinkedList>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("::Enter the number of Pairs::");
		int sets = in.nextInt();
		
		for(int i=0; i<sets; i++) {
			
			System.out.println("::Enter Father::");
			String father = in.next();
			System.out.println("::Enter Son::");
			String son = in.next();
			
			if (family.containsKey(father)) {
				family.get(father).add(son);
			}
			else {
				LinkedList sons = new LinkedList();
				sons.add(son);
				family.put(father, sons);
			}
		}
		
		System.out.println("Enter the person and  level");
		String inp_father = in.next();
		int level = in.nextInt();
		
		LinkedList<String> faa = new LinkedList<String>();
		faa.add(inp_father);
		
		int output = 0;
		for(int i=0; i<level; i++) {
			LinkedList<String> child = new LinkedList<String>();
			for(int j=0; j<faa.size(); j++) {
				child.addAll(find_output(faa.get(j), family));	
			}
			output = child.size();
			faa.clear();
			faa = (LinkedList<String>) child.clone();	
		}
		System.out.println("Output is "+ output);
		
		
		
	}
	
	static LinkedList find_output(String inp_father, HashMap family) {

		if(family.containsKey(inp_father)) {
			LinkedList<String> sons = (LinkedList<String>) family.get(inp_father);
			return sons;
		}
		else {
			return null;
		} 
	}
}
