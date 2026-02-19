/*Q31. WAP to create POJO class names to find similar run player records.
*/


class Player
{
	private int id;
	private String name;
	private int run;
	
	public void setPlayer(int id,String name,int run)
	{
		this.id=id;
		this.name=name;
		this.run=run;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getRun()
	{
		return run;
	}
}

public class Q31
{
	public static void main(String x[])
	{
		Player p[] = new Player[5];
		
		p[0] = new Player();
		p[0].setPlayer(1,"Dhruv",40);
		
		p[1] = new Player();
		p[1].setPlayer(2,"Harshad",40);
		
		p[2] = new Player();
		p[2].setPlayer(3,"Mayur",66);
		
		p[3] = new Player();
		p[3].setPlayer(4,"Shriram",55);
		
		p[4] = new Player();
		p[4].setPlayer(5,"Ganesh",40);
		
		boolean printed[] = new boolean[p.length];
		
		for(int i=0; i<p.length; i++)
		{
			if(printed[i])
				continue;
			
			boolean groupFound = false;
			
			for(int j=i+1; j<p.length; j++)
			{
				if(p[i].getRun() == p[j].getRun())
				{
					 if(!groupFound)
					 {
						System.out.println("Players with similar run = " + p[i].getRun());
						System.out.println(p[i].getId() + "\t" + p[i].getName());
						groupFound = true;
					 }
					System.out.println(p[j].getId() + "\t" + p[j].getName());
					printed[j]=true;
				}
			}
				
		}     
		
	}
}