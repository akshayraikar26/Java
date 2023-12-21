package upcast_downcast;
class Tester{
	int r;
}
class Tista extends Tester{
	void uliya() {
		System.out.println("Howdu Uliya");
	}
}
public class Classtype_3 {
	public static void main(String[] args) {
		System.out.println("****UpCasting");
		Tester t1=new Tista();
		System.out.println(t1.r);
		System.out.println("****DownCasting");
		Tista w1=(Tista)t1;
		System.out.println(w1.r);
		w1.uliya();
	}

}
