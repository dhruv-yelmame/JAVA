/*Q4. Problem:
 Create a POJO class Player with fields: playerId, name, runs, and matches. Store details of 5 players using an array of objects. Perform the following operations:
Calculate the average runs per match for each player.
Find and display the player with the highest batting average.
Print the details of players whose batting average is above the team average.
Why?
 This teaches ratio calculations, finding max averages, and filtering players — same aggregation + comparison style.
*/


import java.util.*;
class Player
{
	private int id;
	private String name;
	private int runs;
	private int match;
	public void StorePlayer(int id,String name,int runs,int match)
	{
		this.id=id;
		this.name=name;
		this.runs=runs;
		this.match=match;
	}
	
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	int getRuns()
	{
		return runs;
	}
	int getMatch()
	{
		return match;
	}
}

class DisplayPlayer
{
	private Player p[];
	public void setPlayer(Player p[])
	{
		this.p=p;
	}
	
	void show()
	{
		//operations 1
		System.out.println("--------------------------------------");
		System.out.println("average runs per match for each player");
		System.out.println("--------------------------------------");
		System.out.println("ID----Name----Average");
		float avg = 0;
		float ap[] = new float[p.length];
		for(int i=0; i<p.length; i++)
		{
			avg = p[i].getRuns() / p[i].getMatch();
			ap[i]=avg;
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+avg);
		}
		
		
		//operations 2
		System.out.println("---------------------------------------------------");
		System.out.println("display the player with the highest batting average");
		System.out.println("---------------------------------------------------");
		System.out.println("ID----Name----MaxAverage");
		float max = ap[0];
		int index=0;
		for(int i=0; i<p.length; i++)
		{
			if(ap[i] > max)
			{
				max=ap[i];
				index=i;
			}
		}
		System.out.println(p[index].getId()+"\t"+p[index].getName()+"\t"+max);
		
		
		//operations 3
		System.out.println("-------------------------------------------------------");
		System.out.println("players whose batting average is above the team average");
		System.out.println("-------------------------------------------------------");
		System.out.println("ID----Name----Average");
		int totalAvg=0;
		for(int i=0; i<ap.length; i++)
		{
			totalAvg+=ap[i];
		}
		avg = totalAvg / ap.length;
		for(int i=0; i<p.length; i++)
		{
			if(ap[i] > avg)
			{
				System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+ap[i]);
			}
		}
	}
}

public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DisplayPlayer dp = new DisplayPlayer();
		Player p[] = new Player[5];
		for(int i=0; i<p.length; i++)
		{
			p[i] = new Player();
			System.out.print("enter the player id: ");
			int id = sc.nextInt();
			System.out.print("enter the name of player: ");
			String name = sc.next();
			System.out.print("enter the runs: ");
			int runs = sc.nextInt();
			System.out.print("enter the no of matches: ");
			int match = sc.nextInt();
			
			p[i].StorePlayer(id,name,runs,match);
		}
		
		dp.setPlayer(p);
		dp.show();
	}
}