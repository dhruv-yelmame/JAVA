/*Q8. Exam Result Evaluation
Concept: Abstract class + decision making
Rules:
1. Abstract class Student
2. Fields: marks[], total, percentage
3. Abstract method calculateResult()
4. Conditions:
	Any subject < 35 → Fail
	Percentage ≥ 75 → Distinction
	60–74 → First Class
	50–59 → Second Class
	Else → Pass
*/


abstract class Student
{
	protected int[] marks;
	protected int total;
	protected double percentage;
	
	Student(int[] marks)
	{
		this.marks=marks;
	}
	
	abstract String calculateResult();
}

class Information extends Student
{
	
	Information(int[] marks)
	{
		super(marks);
	}
	
	String calculateResult()
	{
		
		for(int i=0; i<marks.length; i++)
		{
			if(marks[i] < 35)
			{
				return "fail";
			}
			
			total+=marks[i];
		}
		
		percentage = (double) total / marks.length;
		
		if(percentage >=75)
			return "Distinction";
		else if(percentage >=60 && percentage <75)
			return "First Class";
		else if(percentage >=50 && percentage <60)
			return "Second Class";
		else
			return "Pass";
	}

}

public class ExamResultEvaluation
{
	public static void main(String x[])
	{
		int marks[] = {78, 65, 82, 70, 60};
		
		Student s = new Information(marks);
		String result = s.calculateResult();
		
		System.out.println("Total: "+s.total);
		System.out.println("Percentage: "+s.percentage);
		System.out.println("Result: "+result);
		
	}
}
