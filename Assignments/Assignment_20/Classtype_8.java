package upcast_downcast;
class Tester1{
	void disp(int x) {
		System.out.println(x);
	}
}
class Huliyacha extends Tester1{
	void ho() {
		System.out.println("Ho");
	}
}
public class Classtype_8 {
	public static void main(String[] args) {
		System.out.println("****Upcasting****");
		Tester1 t1=new Huliyacha();
		t1.disp(20);
		System.out.println("****Downcasting****");
		Huliyacha t2=(Huliyacha)t1;
		t2.ho();
		t2.disp(20);
	}

}
