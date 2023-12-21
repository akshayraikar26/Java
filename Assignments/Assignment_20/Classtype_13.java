package upcast_downcast;
class Sample21{
	void co(int r) {
		System.out.println(r);
	}
}
class Hahoha extends Sample21{
	void disp() {
		System.out.println("Disp");
	}
}
public class Classtype_13 {
	public static void main(String[] args) {
		System.out.println("****UpCasting****");
		Sample21 s1=new Hahoha();
		s1.co(5);
		System.out.println("****DownCasting****");
		Hahoha s2=(Hahoha)s1;
		s2.disp();
		s2.co(5);
	}

}
