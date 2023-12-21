package upcast_downcast;
class Demo1{
	double z;
}
class Dumtaka extends Demo1{
	int x;
}
public class Classtype_5 {
	public static void main(String[] args) {
		System.out.println("****UpCasting****");
		Demo1 d1=new Dumtaka();
		System.out.println(d1.z);
		System.out.println("****DownCasting****");
		Dumtaka d2=(Dumtaka)d1;
		System.out.println(d2.z);
		System.out.println(d2.x);
	}
}
