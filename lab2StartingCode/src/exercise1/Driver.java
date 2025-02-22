package exercise1;

import java.util.ArrayList;
import java.util.Collections;

// BY MAXIM OLESHKO, MAXIM LOPEZ, AISHTE PITPIT

public class Driver
{

	public static void main( String[] args )
	{

		ArrayList<Student> studs = new ArrayList<>();
		studs.add( new Student( "Smith", 34 ) );
		studs.add( new Student( "Johnson", 21 ) );
		studs.add( new Student( "Williams", 67 ) );
		studs.add( new Student( "Brown", 53 ) );
		studs.add( new Student( "Jones", 48 ) );
		studs.add( new Student( "Miller", 36 ) );
		studs.add( new Student( "Davis", 44 ) );
		studs.add( new Student( "Wilson", 52 ) );
		studs.add( new Student( "Anderson", 34 ) );
		studs.add( new Student( "Moore", 33 ) );

		
		studs.forEach(student -> {
			System.out.println("\n" + student.getAge() + " " + student.getName());
		});
		
		
		
		Collections.sort(studs);
		
		System.out.println("Sorted by name");
		studs.forEach(student -> {
			System.out.println("\n" + student.getAge() + " " + student.getName());
		});
		
		
		NameComparator StudentComparer = new NameComparator();
		Collections.sort(studs, StudentComparer);
		
		System.out.println("Sorted by age");
		studs.forEach(student -> {
			System.out.println("\n" + student.getAge() + " " + student.getName());
		});
		
	}

}
