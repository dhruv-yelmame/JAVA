/*Q18. Create a Student class with constructor :
roll, name, attendance (out of 100), marks of 5 subjects
Menu options:
1. Add student
2. Calculate final result:
	Avg ≥ 60 AND attendance ≥ 75 → Pass
	Else → Fail
3. Display students with “Short Attendance” (attendance < 60)
4. Highest and lowest scoring student
5. Show student rank list (sort by average)

*/

import java.util.*;
class Student
{
	private int rno;
	private String name;
	private int attendance;
	private int[] marks;
	Student(int rno, String name, int attendance, int[] marks)
	{
		this.rno=rno;
		this.name=name;
		this.attendance=attendance;
		this.marks=marks;
	}
	
	int getRNO()
	{
		return rno;
	}
	int getAttendance()
	{
		return attendance;
	}
	
	int getTotalMarks()
    {
        int total = 0;
        for(int i=0; i<marks.length; i++)
            total += marks[i];
        return total;
    }

	int getAverage()
    {
        return getTotalMarks() / marks.length;
    }
	
	void display()
	{
		System.out.println("Roll No: "+rno+"\t"+"  Name: "+name+"\t"+"  Attendance: "+attendance+"\t"+"  Average: "+getAverage());
	}
}

public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[2];
		int count=0;
		char ch;
		
		do
		{
			System.out.println("1. Add student");
			System.out.println("2. Calculate final result");
			System.out.println("3. Display students with Short Attendance (attendance < 60)");
			System.out.println("4. Highest and lowest scoring student");
			System.out.println("5. Show student rank list (sort by average)");
			System.out.println("6. Exit");
			
			System.out.println("enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					if(count == s.length)
					{
						System.out.println("Student list is full!");
						break;
					}
					System.out.print("enter roll no: ");
					int rno = sc.nextInt();
					System.out.print("enter name: ");
					String name = sc.next();
					System.out.print("enter attendance (out of 100): ");
					int attendance = sc.nextInt();
					System.out.print("enter the marks of 5 subjects: ");
					int marks[] = new int[5];
					for(int j=0; j<marks.length; j++)
					{
						marks[j]=sc.nextInt();
					}
				s[count++] = new Student(rno,name,attendance,marks);
				break;
				
				case 2:
					System.out.println("Final Result:");
                    for(int i=0; i<count; i++)
                    {
                        int avg = s[i].getAverage();

                        if(avg >= 60 && s[i].getAttendance() >= 75)
                            System.out.println("Roll No: "+s[i].getRNO()+"  Average: "+avg+"  Result: Pass");

                        else
                            System.out.println("Roll No: "+s[i].getRNO()+"  Average: "+avg+"  Result: Fail");                   
                    }
                    break;
					
				case 3:
					System.out.println("Display Student with Short Attendance:");
					for(int i=0; i<count; i++)
					{
						if(s[i].getAttendance() < 60)
							s[i].display();
					}
					break;
					
				case 4:
					if(count == 0)
                    {
                        System.out.println("No students available.");
                        break;
                    }

                    Student high = s[0];
                    Student low  = s[0];

                    for(int i=1; i<count; i++)
                    {
                        if(s[i].getAverage() > high.getAverage())
                            high = s[i];
                        if(s[i].getAverage() < low.getAverage())
                            low = s[i];
                    }

                    System.out.println("Highest Scoring Student:");
                    high.display();

                    System.out.println("Lowest Scoring Student:");
                    low.display();
                    break;
					
				case 5:
					System.out.println("Display Student Rank List (sort by average):");
					
					for(int i=0; i<count; i++)
                    {
                        for(int j=i+1; j<count; j++)
                        {
                            if(s[i].getAverage() < s[j].getAverage())
                            {
                                Student temp = s[i];
                                s[i] = s[j];
                                s[j] = temp;
                            }
                        }
                    }
					
					System.out.println("Rank List:");
                    for(int i=0; i<count; i++)
                        s[i].display();
                    break;
				
				case 6:
					System.exit(0);
					
				default:
					System.out.println("Invalid choice!!!");	
			}
				
			System.out.print("Do you want to continue(y/n): ");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
	}
}