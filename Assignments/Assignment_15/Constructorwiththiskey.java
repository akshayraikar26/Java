class Constructorwiththiskey
{
	int empid;
	String empname;
	double empsal;
	Constructorwiththiskey(int empid,String empname,double empsal)
	{
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
	}
	int mobilecost;
	String modelname;
	String color;
	Constructorwiththiskey(int mobilecost, String modelname, String color)
	{
		this.mobilecost=mobilecost;
		this.modelname=modelname;
		this.color=color;
	}
	String model;
	int carcost;
	String type;
	Constructorwiththiskey(String model,int carcost,String type)
	{
		this.carcost=carcost;
		this.model=model;
		this.type=type;
	}
	String schlname;
	char grade;
	int strength;
	Constructorwiththiskey(String schlname,char grade,int strength)
	{
		this.schlname=schlname;
		this.grade=grade;
		this.strength=strength;
	}
	String brand;
	String displaytype;
	int cost;
	Constructorwiththiskey(String brand,String displaytype,int cost)
	{
		this.brand=brand;
		this.type=type;
		this.cost=cost;
	}
	String bikebrand;
	String bikecolour;
	double bikecost;
	Constructorwiththiskey(String bikebrand,String bikecolour,double bikecost)
	{
		this.bikebrand=bikebrand;
		this.bikecolour=bikecolour;
		this.bikecost=bikecost;
	}
	String course;
	String uniname;
	float fee;
	Constructorwiththiskey(String course,String uniname,float fee)
	{
		this.course=course;
		this.uniname=uniname;
		this.fee=fee;
	}
	String cloth;
	int clothcost;
	char size;
	Constructorwiththiskey(String cloth,int clothcost,char size)
	{
		this.cloth=cloth;
		this.clothcost=clothcost;
		this.size=size;
	}
	String lapbrand;
	float lapcost;
	String lapname;
	Constructorwiththiskey(String lapbrand,float lapcost,String lapname)
	{
		this.lapbrand=lapbrand;
		this.lapcost=lapcost;
		this.lapname=lapname;
	}
	double homecost;
	String homename;
	String homecolour;
	Constructorwiththiskey(double homecost,String homename,String homecolour)
	{
		this.homecost=homecost;
		this.homename=homename;
		this.homecolour=homecolour;
	}
	public static void main(String[] args)
	{
		System.out.println("Employee Details");
		Constructorwiththiskey Emp=new Constructorwiththiskey(95174846,"Akshay",400000.236);
		System.out.println("Employee ID is "+Emp.empid);
		System.out.println("Employee Name is "+Emp.empname);
		System.out.println("Employee Salary is "+Emp.empsal);
		System.out.println(" ");
		System.out.println("Mobile Phone");
		Constructorwiththiskey Mob=new Constructorwiththiskey(80000,"I Phone 14","Midnight Black");
		System.out.println("Mobile Cost is "+Mob.mobilecost);
		System.out.println("Model name is "+Mob.modelname);
		System.out.println("Colour is "+Mob.color);
		System.out.println("");
		System.out.println("Car");
		Constructorwiththiskey Car=new Constructorwiththiskey("Hycross",6500000,"Petrol");
		System.out.println("Car Model name is "+Car.model);
		System.out.println("Car Price is "+Car.carcost);
		System.out.println("Fuel type is "+Car.type);
		System.out.println(" ");
		System.out.println("School Details");
		Constructorwiththiskey Schl=new Constructorwiththiskey("Assumption English School",'A',2500);
		System.out.println("School Name is "+Schl.schlname);
		System.out.println("School Grade is "+Schl.grade);
		System.out.println("School Strength is "+Schl.strength);
		System.out.println(" ");
		System.out.println("Tv Details");
		Constructorwiththiskey Tv=new Constructorwiththiskey("One Plus","LED",65000);
		System.out.println("Tv Brand Name is "+Tv.brand);
		System.out.println("Tv Display Type is "+Tv.type);
		System.out.println("Price is "+Tv.cost);
		System.out.println(" ");
		System.out.println("Bike Details");
		Constructorwiththiskey Bike=new Constructorwiththiskey("Hero","Sporty Red",195628.99);
		System.out.println("Bike Name is "+Bike.bikebrand);
		System.out.println("Bike Colour is "+Bike.bikecolour);
		System.out.println("Price is "+Bike.bikecost);
		System.out.println(" ");
		System.out.println("College Details");
		Constructorwiththiskey Uni=new Constructorwiththiskey("BE","VTU",1560.59f);
		System.out.println("Course Name is "+Uni.course);
		System.out.println("University Name is "+Uni.uniname);
		System.out.println("Exam fee is "+Uni.fee);
		System.out.println(" ");
		System.out.println("US polo");
		Constructorwiththiskey Cloth=new Constructorwiththiskey("Cotton",1000,'L');
		System.out.println("Cloth type "+Cloth.cloth);
		System.out.println("Cloth Cost is "+Cloth.clothcost);
		System.out.println("Cloth Size is "+Cloth.size);
		System.out.println(" ");
		System.out.println("Laptop Details");
		Constructorwiththiskey Laptop=new Constructorwiththiskey("Lenovo",85999.99f,"Yoga Slim 7");
		System.out.println("Laptop Brand is "+Laptop.lapbrand);
		System.out.println("Model Name is "+Laptop.lapcost);
		System.out.println("Laptop Cost is "+Laptop.lapname);
		System.out.println(" ");
		System.out.println("Home");
		Constructorwiththiskey Home=new Constructorwiththiskey(60000000.98,"Shakunthala Mahabaleshwara","Smokey Grey");
		System.out.println("Home Price is "+Home.homecost);
		System.out.println("Home Name is "+Home.homename);
		System.out.println("Home Colour is "+Home.homecolour);
	}
}