package lab3;

public class p28 {
	public static void main(String[]args) {
		Caro car1;
		car1=new Caro();
		car1.show();
		
		Caro car2;
		car2=new Caro(1234,25.0);
		car2.show();
	}
}
class Caro{
	private int num;
	private double gas;
	public Caro() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public Caro(int n,double g) {
		this();
		num=n;
		gas=g;
		System.out.println("生產了車號是"+num+"汽油量是"+gas+"的車子");
	}
	public void show(){
		System.out.println("車號是"+this.num);
		System.out.println("汽油量"+this.gas);
	}
}