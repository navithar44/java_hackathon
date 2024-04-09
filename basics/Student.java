package basics;

public class Student {

	String name;
	int roll_no;
	int phone;
	String address;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		s.name="john";
		s.roll_no=2;
		System.out.print(s.name+","+ s.roll_no);
		System.out.println();
		//Assign values to 2 students
		s1.name="sam";
		s1.phone=985612345;
		s1.address="102 cross files street,hyderabad-500070";
		System.out.print(s1.name+","+ s1.phone+","+s1.address);
		System.out.println();
		s2.name="johny";
		s2.phone=985674345;
		s2.address="104 cross files street,hyderabad-500070";
		System.out.print(s2.name+","+ s2.phone+","+s2.address);
		
		
	}

}
