package encap;

class Apple
{
	private String faceid="Akshay";
	public String getid()
	{
		return faceid;
	}
	public void setid(String faceid)
	{
		this.faceid=faceid;
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		Apple a=new Apple();
		System.out.println(a.getid());
		a.setid("Aks");
		System.out.println(a.getid());
	}

}
