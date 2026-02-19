/*Q24. WAP to create class name Player with field name as Player with field id,name and run
and we have class name as Team with following methods
void setPlayer(Player player): this function is used for accept player details
void showPlayer(): this function is used for show the player details.
*/

import java.util.*;
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

class Team
{
	private Player player;
	public void setPlayer(Player player)
	{
		this.player=player;
	}
	
	public void showPlayer()
	{
		System.out.println("ID\tName\tRun");
		System.out.println(player.getId()+"\t"+player.getName()+"\t"+player.getRun());
	}
}

public class Q24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the id: ");
		int id = sc.nextInt();
		System.out.print("enter the name: ");
		String name = sc.next();
		System.out.print("enter the runs: ");
		int run = sc.nextInt();
		
		Player p = new Player();
		p.setPlayer(id,name,run);
		
		Team t = new Team();
		t.setPlayer(p);
		t.showPlayer();
	}
}

