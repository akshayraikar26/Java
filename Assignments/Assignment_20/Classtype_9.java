package upcast_downcast;
class Cool2{
	void disp() {
		System.out.println("Cool2");
	}
}
class Dinga extends Cool2{
	void tata(int x) {
		System.out.println(x);
	}
}
public class Classtype_9 {
	public static void main(String[] args) {
		System.out.println("****UpCasting");
		Cool2 c1=new Dinga();
		c1.disp();
		System.out.println("****DownCasting");
		Dinga c2=(Dinga)c1;
		c2.tata(30);
		c2.disp();
	}

}
