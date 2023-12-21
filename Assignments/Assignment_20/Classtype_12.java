package upcast_downcast;
class Demo10{
	double z;
	int r;
}
class Dumtaka3 extends Demo10{
	int x;
}
public class Classtype_12 {
	public static void main(String[] args) {
		System.out.println("****UpCasting****");
		Demo10 d1=new Dumtaka3();
		System.out.println(d1.z);
		System.out.println(d1.r);
		System.out.println("****DownCasting****");
		Dumtaka3 d2=(Dumtaka3)d1;
		System.out.println(d2.x);
		System.out.println(d2.z);
		System.out.println(d2.r);
	}

}
