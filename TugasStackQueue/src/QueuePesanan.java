
public class QueuePesanan {

	private String[] data;
	private int tail;
	
	public QueuePesanan(int jumlah){
		data=new String[jumlah];
		tail=-1;
	}
	
	public void enqueue(String nilai){
		if (tail < data.length-1){
			tail++;
			data[tail]=nilai;
		}
	}
	public String dequeue(){
		if(tail>0){
		String temp=data[0];
		for(int i=0;i<data.length-1;i++){
			data[i]=data[i+1];
		}
			tail--;
			return temp;
		}
		return null;
	}
	public void printdata(){
		for (int i=0;i<data.length;i++){
			System.out.print(data[i]);
		}
	}
	
	
	
}






