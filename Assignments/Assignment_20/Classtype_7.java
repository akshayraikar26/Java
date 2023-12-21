package upcast_downcast;
class Cola1{
	int f;
}
class chungacha extends Cola1{
	int d;
}
public class Classtype_7 {
	public static void main(String[] args) {
		System.out.println("****UpCasting****");
		Cola1 c1=new chungacha();
		System.out.println(c1.f);
		System.out.println("****DownCasting****");
		chungacha c2=(chungacha)c1;
		System.out.println(c2.d);
		System.out.println(c2.f);
	}

}
