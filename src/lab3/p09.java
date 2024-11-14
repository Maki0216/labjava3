package lab3;

public class p09 {
	public static void main(String[]args) {
		Card car1;
		car1=new Card();
		
		car1.num=1234;
		car1.gas=20.5;
	}
}
class Card{
	int num;
	double gas;
	void show1() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	void show2() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}