package upcast_downcast;
class Sample {
	void disp(){
		System.out.println("Hello");
	}
}
class Ampules extends Sample {
	void tata() {
		System.out.println("Bye");
	}
}
public class Classtype_2 {
	public static void main(String[] args) {
		System.out.println("****UpCasting");
		Sample s1=new Ampules();
		s1.disp();
		System.out.println("****DownCasting****");
		Ampules a1=(Ampules)s1;
		a1.tata();
		a1.disp();
	}
}
