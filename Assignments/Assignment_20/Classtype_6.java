package upcast_downcast;
class Sample2{
	void co() {
		System.out.println("Co");
	}
}
class Guleyluu extends Sample2{
	void disp() {
		System.out.println("Disp");
	}
}
public class Classtype_6 {
	public static void main(String[] args) {
		System.out.println("****UpCasting");
		Sample2 s1=new Guleyluu();
		s1.co();
		System.out.println("****DownCasting");
		Guleyluu s2=(Guleyluu)s1;
		s2.co();
		s2.disp();
	}

}
