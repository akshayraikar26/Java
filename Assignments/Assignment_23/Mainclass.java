package encap;
class Amazon
{
	private String password="abc";
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
public class Mainclass {
	public static void main(String[] args) {
		Amazon a=new Amazon();
		System.out.println(a.getPassword());
		a.setPassword("ab");
		System.out.println(a.getPassword());
	}

}
