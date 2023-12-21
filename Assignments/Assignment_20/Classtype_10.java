package upcast_downcast;
class Tester3{
	void disp(int r) {
		System.out.println(r);
	}
}
class Tista1 extends Tester3{
	void uliya() {
		System.out.println("Uliya");
	}
}
public class Classtype_10 {
	public static void main(String[] args) {
		System.out.println("****UpCasting****");
		Tester3 t1=new Tista1();
		t1.disp(6);
		System.out.println("****DownCasting****");
		Tista1 t2=(Tista1)t1;
		t2.uliya();
		t2.disp(6);
	}
}
