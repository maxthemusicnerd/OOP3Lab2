package exercise1;

public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	
	public Student( String name, int age )
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age; 
	}
	
	@Override
	public int compareTo(Student that) {
		return this.name.compareTo(that.name);
	}
}
