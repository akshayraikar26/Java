package upcast_downcast;
class Cola13{
	void disp(int f) {
		System.out.println(f);
	}
}
class chungacha1 extends Cola13{
	int d;
}
public class Classtype_14 {
	public static void main(String[] args) {
		System.out.println("****UpCasting");
		Cola13 c1=new chungacha1();
		c1.disp(7);
		System.out.println("****DownCasting");
		chungacha1 c2=(chungacha1)c1;
		System.out.println(c2.d);
		c2.disp(7);
	}
}
