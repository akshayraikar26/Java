class Chat
{
	static void send(String text)
	{
		System.out.println("Sending textmsg "+text);
	}
	static void send(int no)
	{ 
		System.out.println("Sending Number "+no);
	}
	static void send(String msg,int num)
	{
		System.out.println("Sending txtmsg "+msg+" Number "+num);
	}
}
class Whatsapp
{
	public static void main(String[] args)
	{
		Chat.send("Hi");
		Chat.send(74);
		Chat.send("Ok",11);
	}
}