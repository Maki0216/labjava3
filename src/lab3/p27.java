package lab3;

public class p27 {
	public static void main(String[]args) {
		Carn car1;
		car1=new Carn();
		car1.show();
		
		Carn car2;
		car2=new Carn(1234,25.0);
		car2.show();
	}
}
class Carn{
	private int num;
	private double gas;
	public Carn() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public Carn(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號是"+num+"汽油量是"+gas+"的車子");
	}
	public void show(){
		System.out.println("車號是"+this.num);
		System.out.println("汽油量"+this.gas);
	}
}