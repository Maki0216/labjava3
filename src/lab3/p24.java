package lab3;

public class p24 {
	public static void main(String[]args) {
		Carl car1;
		car1=new Carl();
		
		car1.setCarl(1234,20.5);
		car1.show();
		System.out.println("只變更車號");
		car1.setCarl(2345);
		car1.show();
		System.out.println("變更汽油量");
		car1.setCarl(30.5);
		car1.show();
	}
}
class Carl{
	private int num;
	private double gas;
	public void setCarl(int n) {
		num=n;
		System.out.println("車號設為"+this.num);
	}
	public void setCarl(double g) {
		gas=g;
		System.out.println("汽油量設為"+this.gas);
	}
	public void setCarl(int n,double g) {
		gas=g;
		num=n;
		System.out.println("車號設為"+this.num+"汽油量設為"+this.gas);
	}
	public void show(){
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}
