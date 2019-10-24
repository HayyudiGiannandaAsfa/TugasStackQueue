
public class AppQueuePesanan {
	public static void main(String []args){
		QueuePesanan q = new QueuePesanan(5);
		q.enqueue("Pesanan 1, ");
		q.enqueue("Pesanan 2, ");
		q.enqueue("Pesanan 3, ");
		q.enqueue("Pesanan 4, ");
		System.out.println("=====Total Pesanan=====");
		q.printdata();
		try{
			System.out.println("\n=====Dequeue=====");
			System.out.print(q.dequeue());
			System.out.print(q.dequeue());
			System.out.println("\n=====Sisa Queue=====");
			q.printdata();
		} catch (Exception e){
			System.out.println(e.getMessage());
		
}
}
}