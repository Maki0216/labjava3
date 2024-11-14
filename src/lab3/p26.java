package lab3;

public class p26 {
	public static void main(String[]args) {
		Carm car1;
		car1=new Carm();
		
		car1.show();
	}
}
class Carm{
	private int num;
	private double gas;
	public Carm() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	public void show(){
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}
