
import java.util.*;

public class StudentTest {
	public static void main(String[] args) {
		
		Student[] students = new Student[3]; //Student 타입의 students이름의 배열에 공간을 3개 만들어주었다.
		students[0] = new Student("홍길동", 3.39); //1번째 배열의 저장값
		students[1] = new Student("임꺽정", 4.21); //2번째 배열의 저장값
		students[2] = new Student("황진이", 2.19); //3번째 배열의 저장값
		
	    Arrays.sort(students);
	    for (Student s : students)
	    	System.out.println("이름=" + s.getName() + " 평점=" + s.getGPA());
	    
	}

}

class Student implements Comparable{
	private String name; //
	private double gpa;
	
	public Student(String n, double g) { //생성자 매개변수는 string 타입의 n과 double타입의 g
		name = n;
		gpa = g;
		
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public double getGPA() {return gpa;}

	public void setGpa(double gpa) {this.gpa = gpa;}
	
	public int compareTo(Object obj) {
		Student other = (Student) obj;
		if (gpa < other.gpa)
			return -1;
		else if (gpa > other.gpa)
			return 1;
		else
			return 0;
	}
}