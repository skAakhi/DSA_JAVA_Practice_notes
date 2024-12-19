package Constructor;

public class Constructor_chaining {
	
// Copy constructors , took other reference object as parameter copying (d) object values into lava (l)
	public static void main(String[] args) {
		
		dell d= new dell();
		d.model_no=7765;
		d.name="delli10gen";
		
		lava l=new lava(d);
//		l.model_no=1234;
//		l.name="Lavai10gen";
//		
		
		
		System.out.println(l.model_no);
		System.out.println(l.name);
	}

}


class lava{
	String name;
	int model_no;
	
	lava(dell d) // Copy constructors , took other reference object as parameter copying (d) object values into lava (l) object value
	{
		System.out.println("Lava constructors");
		this.model_no=d.model_no;
		this.name=d.name;
	}
	
	public  void printName()
	{
		System.out.println(this.name);
	}
	
	public void PrintModel() {
		System.out.println(this.model_no);
	}
	
	
	
}


class dell{
	String name;
	int model_no;
	
	dell()
	{
		System.out.println("dell constructors");
		
	}
	
	public  void printName()
	{
		System.out.println(this.name);
	}
	
	public void PrintModel() {
		System.out.println(this.model_no);
	}
	
	
}
