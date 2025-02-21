package exercise1;

import java.util.Comparator;

class NameComparator implements Comparator<Student> {

    public int compare(Student p1, Student p2) {
    	
    	int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
    	
    	if (ageComparison == 0) {
    		return p1.getName().compareTo(p2.getName()); 
    	}
    	
    	return ageComparison;
    }
}
