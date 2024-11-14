package lab3;

public class p47 {
	public static void main(String[]args) {
		Carab car1;
		car1=new Carab();
		car1.show();
		int number=1234;
		double gasoline=20.5;
		String str ="一號車";
		car1.setCarab(number,gasoline);
		car1.setName(str);
		car1.show();
	}
}
class Carab{
	private int num;
	private double gas;
	private String name;
	public Carab() {
		num=0;
		gas=0.0;
		name="沒有名稱";
		System.out.println("生產了車子");
	}
	public void setCarab(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號是"+num+"汽油量是"+gas+"的車子");
	}
	public void setName(String nm) {
		name=nm;
		System.out.println("車子名子設為"+name);
	}
	public void show(){
		System.out.println("車號是"+this.num);
		System.out.println("汽油量"+this.gas);
		System.out.println("車名是"+this.name);
	}
}