package encap;
class Meesho
{
	private char ch='A';
	public char getcharacter()
	{
		return ch;
	}
	public void setcharacter(char ch)
	{
		this.ch=ch;
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		Meesho m=new Meesho();
		System.out.println(m.getcharacter());
		m.setcharacter('B');
		System.out.println(m.getcharacter());
	}

}
