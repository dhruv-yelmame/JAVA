/*Q30. WAP to create POJO class name as Player with field id,name and run and find player
detail whose run is second highest 
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

public class Q30
{
	public static void main(String x[])
	{
		Player p[] = new Player[4];
		
		p[0] = new Player();
		p[0].setPlayer(1,"Dhruv",40);
		
		p[1] = new Player();
		p[1].setPlayer(2,"Harshad",60);
		
		p[2] = new Player();
		p[2].setPlayer(3,"Mayur",30);
		
		p[3] = new Player();
		p[3].setPlayer(4,"Shriram",55);
		
		
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		for(int i=0; i<p.length; i++)
		{
			int runs = p[i].getRun();
			if(runs > fmax)
			{
				smax=fmax;
				fmax=runs;
			}
			else
			{
				if(runs!=fmax && runs > smax)
				{
					smax=runs;
				}
			}
		}
		
		for(int i=0; i<p.length; i++)
        {
            if(p[i].getRun() == smax)
            {
                System.out.println("Second Highest:");
                System.out.println(p[i].getId() + "\t" + p[i].getName() + "\t \t" + p[i].getRun());
                break;
            }
        }
		
	}
}