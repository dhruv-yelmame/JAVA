/*Q5.Create a Box class with fields length, width, height.
Initialize them with a constructor.
Write a method isValidVolume() that checks volume:
If volume > 0 → Print “Valid box”
 Else → Print “Invalid dimensions”
Concepts Used:
 ✔ Constructor
 ✔ Logical condition (volume > 0)
 ✔ Multiplication operation
Explanation:
 A box is valid only if all dimensions are positive, so the volume remains > 0.
*/

class Box
{
	private int length;
	private int width;
	private int height;
	Box(int length,int width,int height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	String isValidVolume()
	{
		double volume = length*width*height;
		
		if(volume > 0)
			return "Valid box";
		else 
			return "Invalid dimensions";
	}
}

public class Q5
{
	public static void main(String x[])
	{
		Box b1 = new Box(12,5,4);
		Box b2 = new Box(5,-5,7);
		
		System.out.println(b1.isValidVolume());
		System.out.println(b2.isValidVolume());
	}
}