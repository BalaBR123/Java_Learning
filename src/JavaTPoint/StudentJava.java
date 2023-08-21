package JavaTPoint;

public class StudentJava {
		int rollno;
		String name;
		float fee;
		StudentJava(int rollno,String name,float fee)
		{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		}
		void display()
		{
			System.out.println(rollno+" "+name+" "+fee);
		}
		
		static class TestThis1{
		public static void main(String args[]){
		StudentJava s1=new StudentJava(111,"ankit",5000f);
		StudentJava s2=new StudentJava(112,"sumit",6000f);
		s1.display();
		s2.display();
		}
	}

}
