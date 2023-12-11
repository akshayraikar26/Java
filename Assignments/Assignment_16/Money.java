class Sbi
{
	void account()
	{
		System.out.println("Amount Debited");
	}
}
class Phonepe
{
	static void upi(Sbi s2)
	{
		s2.account();
	}
}
class Money
{
	public static void main(String[] args)
	{
		Sbi s1=new Sbi();
		Phonepe.upi(s1);
	}
}