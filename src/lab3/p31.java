package lab3;

public class p31 {
	public static void main(String[]args) {
		Carp.showSum();
		Carp car1;
		car1=new Carp();
		car1.setCarp(1234,20.5);
		car1.showSum();
		
		Carp car2;
		car2=new Carp();
		car2.setCarp(4567,30.5);
		car2.showSum();
	}
}
class Carp{
	public static int sum=0;
	private int num;
	private double gas;
	public Carp() {
		num=0;
		gas=0.0;
		sum++;
		System.out.println("生產了車子");
	}
	public void setCarp(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號是"+num+"汽油量是"+gas+"的車子");
	}
	public static void showSum() {
		System.out.println("車子有"+sum+"台");
	}
	public void show(){
		System.out.println("車號是"+this.num);
		System.out.println("汽油量"+this.gas);
	}
}