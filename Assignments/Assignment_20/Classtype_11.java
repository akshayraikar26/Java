package upcast_downcast;
class Cool4{
	void add() {
		System.out.println("Add");
	}
}
class Goolata2 extends Cool4{
	void dispu(int r) {
		System.out.println(r);
	}
}
public class Classtype_11 {
	public static void main(String[] args) {
		System.out.println("****UpCasting");
		Cool4 c1=new Goolata2();
		c1.add();
		System.out.println("****DownCasting");
		Goolata2 c2=(Goolata2)c1;
		c2.dispu(2);
		c2.add();
		
	}

}
