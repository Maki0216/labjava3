package lab3;

public class p45 {
	public static void main(String[]args) {
		System.out.println("宣告car1");
		Caraa car1;
		car1=new Caraa();
		car1.setCaraa(1234,20.5);
		System.out.println("宣告car2");
		Caraa car2;
		System.out.println("car1指定給car2");
		car2=car1;
		System.out.println("car1的");
		car1.show();
		System.out.println("car2的");
		car2.show();
		System.out.println("改變car1的相關資料");
		car1.setCaraa(2345,30.5);
		System.out.println("car1的");
		car1.show();
		System.out.println("car2的");
		car2.show();
	}
}
class Caraa{
	private int num;
	private double gas;
	public Caraa() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCaraa(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號是"+num+"汽油量是"+gas+"的車子");
	}
	public void show(){
		System.out.println("車號是"+this.num);
		System.out.println("汽油量"+this.gas);
	}
}