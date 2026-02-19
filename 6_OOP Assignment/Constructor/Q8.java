/*Q8. Create a Student class with 3 subject marks:
 m1, m2, m3 (initialize via constructor)
Write a method:
calculateResult()
Total = m1 + m2 + m3
Percentage = total / 3
If any subject < 35 → print “Fail”
Else print Percentage and Grade:

≥ 75 → Distinction
≥ 60 → First Class
≥ 50 → Second Class
Else → Pass

Explanation:
 This requires combined logic:
OR logic for fail
Else-if ladder for grading
Arithmetic + constructor initialization
*/

class Student
{
	private int m1, m2, m3;
	Student(int m1, int m2, int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	void calculateResult()
	{
		int total = m1+m2+m3;
		float p = (float)total / 3;
		
		System.out.printf("Percentage: %.2f\t", p);
		
		if(m1 < 35 || m2 < 35 || m3 < 35)
			System.out.print("Fail");
		else if(p >= 75)
			System.out.println("Grade: Distinction");
		else if(p >= 60)
			System.out.println("Grade: First Class");
		else if(p >= 50)
			System.out.println("Grade: Second Class");
		else 
			System.out.println("Grade: Pass");
	}
}

public class Q8
{
	public static void main(String x[])
	{
		Student s1 = new Student(60,48,88);
		Student s2 = new Student(30,58,44);
		
		s1.calculateResult();
		s2.calculateResult();
	}
}