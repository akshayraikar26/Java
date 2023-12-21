package upcast_downcast;
class Cool{
	void add() {
		System.out.println("Cool");
	}
}
class Goolata extends Cool{
	void dispu() {
		System.out.println("Goolata");
	}
}
public class Classtype_4 {
	public static void main(String[] args) {
		System.out.println("****UpCasting");
		Cool c1=new Goolata();
		c1.add();
		System.out.println("****DownCasting");
		Goolata c2=(Goolata)c1;
		c2.add();
		c2.dispu();
	}
}
