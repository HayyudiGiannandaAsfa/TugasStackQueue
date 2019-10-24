
public class StackMakananRingan {

	private String[] data;
	private int top;
	
	public StackMakananRingan(int jumlah){
	data=new String[jumlah];
}

	public void push(String nilai){
	if (top < data.length){
		data[top]=nilai;
		top++;
		
	}else{
		System.out.println("DATA PENUH");
	}
}
	public String pop(){
	if(top >0){
		top--;
		String tmp=data[top];
		data[top]=null;
		return tmp;
	}else{
		System.out.println("DATA KOSONG");
		return null;
	}
	
	
}
	public void printdata(){
	for (int i=data.length-1;i>=0;i--){
		System.out.println(data[i]);
	}
}

	
	
	

}



