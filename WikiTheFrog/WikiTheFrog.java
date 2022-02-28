
import java.util.Scanner;
public class WikiTheFrog{
 private int[][] wikiJump;
	public WikiTheFrog(int[][] wikiJump){
		this.wikiJump = wikiJump;
	}
	
	public int calculateJumpTime(int distance){
		int totalTime = 0;
		while(distance >= 0){
			 for(int jump = 0; jump < wikiJump.length; jump ++){				
				distance -= wikiJump[jump][0];
				if(distance <= 0)
					break;
				totalTime += wikiJump[jump][1];
			}
		}
	return totalTime;
	}
	

public static void main(String args[]){
		int[][] data = {{5,1},{3,2},{1,3}};
		WikiTheFrog wiki=  new WikiTheFrog(data);
		try{

		Scanner scanner  = new Scanner(System.in);
		System.out.print("How far do you need wiki to jump? ");
		int distance = scanner.nextInt();
		scanner.close();
		
		System.out.println("Wiki took "+" "+wiki.calculateJumpTime(distance)+" seconds to cover the distance");
		
		}catch(Exception e){
			System.out.println("Please enter as a number");
		}
		}

}
