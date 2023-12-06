class Constructor
{
	int empid;
	String empname;
	double empsal;
	Constructor(int a,String b,double c)
	{
		empid=a;
		empname=b;
		empsal=c;
		return;
	}
	int mobilecost;
	String modelname;
	String color;
	Constructor(int d, String e, String f)
	{
		mobilecost=d;
		modelname=e;
		color=f;
		return;
	}
	String model;
	int carcost;
	String type;
	Constructor(String g,int h,String i)
	{
		carcost=h;
		model=g;
		type=i;
		return;
	}
	String schlname;
	char grade;
	int strength;
	Constructor(String j,char k,int l)
	{
		schlname=j;
		grade=k;
		strength=l;
		return;
	}
	String brand;
	String displaytype;
	int cost;
	Constructor(String m,String n,int o)
	{
		brand=m;
		type=n;
		cost=o;
		return;
	}
	String bikebrand;
	String bikecolour;
	double bikecost;
	Constructor(String p,String q,double r)
	{
		bikebrand=p;
		bikecolour=q;
		bikecost=r;
		return;
	}
	String course;
	String uniname;
	float fee;
	Constructor(String s,String t,float u)
	{
		course=s;
		uniname=t;
		fee=u;
	}
	String cloth;
	int clothcost;
	char size;
	Constructor(String v,int w,char x)
	{
		cloth=v;
		clothcost=w;
		size=x;
		return;
	}
	String lapbrand;
	String lapname;
	float lapcost;
	Constructor(String y,float z,String za)
	{
		lapbrand=y;
		lapcost=z;
		lapname=za;
		return;
	}
	double homecost;
	String homename;
	String homecolour;
	Constructor(double zb,String zc,String zd)
	{
		homecost=zb;
		homename=zc;
		homecolour=zd;
		return;
	}
	public static void main(String[] args)
	{
		System.out.println("Employee Details");
		Constructor Emp=new Constructor(95174846,"Akshay",400000.236);
		System.out.println("Employee ID is "+Emp.empid);
		System.out.println("Employee Name is "+Emp.empname);
		System.out.println("Employee Salary is "+Emp.empsal);
		System.out.println(" ");
		System.out.println("Mobile Phone");
		Constructor Mob=new Constructor(80000,"I Phone 14","Midnight Black");
		System.out.println("Mobile Cost is "+Mob.mobilecost);
		System.out.println("Model name is "+Mob.modelname);
		System.out.println("Colour is "+Mob.color);
		System.out.println("");
		System.out.println("Car");
		Constructor Car=new Constructor("Hycross",6500000,"Petrol");
		System.out.println("Car Price is "+Car.model);
		System.out.println("Car Model name is "+Car.carcost);
		System.out.println("Fuel type is "+Car.type);
		System.out.println(" ");
		System.out.println("School Details");
		Constructor Schl=new Constructor("Assumption English School",'A',2500);
		System.out.println("School Name is "+Schl.schlname);
		System.out.println("School Grade is "+Schl.grade);
		System.out.println("School Strength is "+Schl.strength);
		System.out.println(" ");
		System.out.println("Tv Details");
		Constructor Tv=new Constructor("One Plus","LED",65000);
		System.out.println("Tv Brand Name is "+Tv.brand);
		System.out.println("Tv Display Type is "+Tv.type);
		System.out.println("Price is "+Tv.cost);
		System.out.println(" ");
		System.out.println("Bike Details");
		Constructor Bike=new Constructor("Hero","Sporty Red",195628.99);
		System.out.println("Bike Name is "+Bike.bikebrand);
		System.out.println("Bike Colour is "+Bike.bikecolour);
		System.out.println("Price is "+Bike.bikecost);
		System.out.println(" ");
		System.out.println("College Details");
		Constructor Uni=new Constructor("BE","VTU",1560.59f);
		System.out.println("Course Name is "+Uni.course);
		System.out.println("University Name is "+Uni.uniname);
		System.out.println("Exam fee is "+Uni.fee);
		System.out.println(" ");
		System.out.println("US polo");
		Constructor Cloth=new Constructor("Cotton",1000,'L');
		System.out.println("Cloth type "+Cloth.cloth);
		System.out.println("Cloth Cost is "+Cloth.clothcost);
		System.out.println("Cloth Size is "+Cloth.size);
		System.out.println(" ");
		System.out.println("Laptop Details");
		Constructor Laptop=new Constructor("Lenovo",85999.99f,"Yoga Slim 7");
		System.out.println("Laptop Brand is "+Laptop.lapbrand);
		System.out.println("Model Name is "+Laptop.lapcost);
		System.out.println("Laptop Cost is "+Laptop.lapname);
		System.out.println(" ");
		System.out.println("Home");
		Constructor Home=new Constructor(60000000.98,"Shakunthala Mahabaleshwara","Smokey Grey");
		System.out.println("Home Price is "+Home.homecost);
		System.out.println("Home Name is "+Home.homename);
		System.out.println("Home Colour is "+Home.homecolour);
	}
}