package upcast_downcast;
class Demo {
	int x;
}
class PemoCha extends Demo {
	void ho() {
		System.out.println("Hi");
	}
}
public class Classtype_1 {
	public static void main(String[] args) {
		System.out.println("******UpCasting*****");
		Demo p1=new PemoCha();
		System.out.println(p1.x);
		System.out.println("*****DownCasting*****");
		PemoCha t1=(PemoCha)p1;
		System.out.println(t1.x);
		t1.ho();
	}
}
