
public class AppStackMakananRingan {
	public static void main(String []args){
		StackMakananRingan x=new StackMakananRingan(6);
		x.push("Chitato");
		x.push("Lays");
		x.push("Cheetos");
		x.push("Chips");
		x.push("Nissin");
		System.out.println("=====Daftar Makanan Ringan Rak 10=====");
		x.printdata();
		
		try{
			System.out.println("\n=====Stack yang di Pop=====");
			System.out.println(x.pop());
			System.out.println(x.pop());
			System.out.println("\n=====Sisa Stack=====");
			x.printdata();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}}
