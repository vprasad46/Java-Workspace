public class Memory {
	
	int key,value,count=1;
	
	Memory(int key,int value){
		this.key= key;
		this.value= value;
	}
	
	int getkey(){
		return key;
	}
	
	int getvalue(){
		return value;
	}
	
	void setvalue(int value){
	    
	    this.value= value;
	}
	
	int getcount(){
		return count;
	}
	
	Memory access(){
		count=count+1;
		return this;
	}

}