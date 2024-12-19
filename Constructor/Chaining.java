package Constructor;

public class Chaining {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Aakhib","Developer");
		System.out.println(s1);
		

	}

}


class Student{
	 private int id;
	 private String name;
	 private String dept;
	
	
	Student(int id){  //Constructor 1
		this.id=id;
	}
	
	
	Student(int id,String name,String dept){
		this(id);//This can be used at first line itself but can make it use of after 26 or 27 line
		this.name=name;
		this.dept=dept;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
