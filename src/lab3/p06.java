package lab3;

public class p06 {
	public static void main(String[]args) {
		Carb car1;
		car1=new Carb();
		
		
		car1.num=1234;
		car1.gas=20.5;
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
	}
}
class Carb{
	int num;
	double gas;
}