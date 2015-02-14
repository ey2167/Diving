import java.util.Scanner;
/*Elohe Yonas
 * CSC201
 * 9:00-12:40
 */

public class Diving {
	
	static double Score1,Score2,Score3,Score4,Score5,Score6,Score7,scores, difficulty,sum,total;
	static double diff=0.0;
	static Scanner keyboard = new Scanner(System.in);
	
	public static void inputvalidScore()
	{
		/*
		 * this method will take inputs for scores
		 */
		
		System.out.println("What does Judge 1 say?");
		Score1 = keyboard.nextDouble();
		/*
		 * if statement to keep bare minimum and maximum of scores
		 */
		if(Score1 > 10 || Score1 <0)
		{
			System.out.println("that Score seems out there...try asking the judges again and comeback to me"); System.out.close();
		}
		System.out.println("What does Judge 2 say?");
		Score2 = keyboard.nextDouble();
		if(Score2 > 10 || Score2 <0)
		{
			System.out.println("that Score seems out there...try asking the judges again and comeback to me");System.out.close();
		}
		System.out.println("What does Judge 3 say?");
		Score3 = keyboard.nextDouble();
		if(Score3 > 10 || Score3 <0)
		{
			System.out.println("that Score seems out there...try asking the judges again and comeback to me");System.out.close();
		}
		System.out.println("What does Judge 4 say?");
		Score4 = keyboard.nextDouble();
		if(Score4 > 10 || Score4 <0)
		{
			System.out.println("that Score seems out there...try asking the judges again and comeback to me");System.out.close();
		}
		System.out.println("What does Judge 5 say?");
		Score5 = keyboard.nextDouble();
		if(Score5 > 10 || Score5 <0)
		{
			System.out.println("that Score seems out there...try asking the judges again and comeback to me");System.out.close();
		}
		System.out.println("What does Judge 6 say?");	
		Score6 = keyboard.nextDouble();
		if(Score6 > 10 || Score6 <0)
		{
			System.out.println("that Score seems out there...try asking the judges again and comeback to me");System.out.close();
		}
		System.out.println("What does Judge 7 say?");
		Score7 = keyboard.nextDouble();
		if(Score7 > 10 || Score7 <0)
		{
			System.out.println("that Score seems out there...try asking the judges again and comeback to me");System.out.close();
		}
		
		 
				
		
		
	}
	
	public static double inputallScores()
	{
		/*
		 * this method will use the inputs from inputvalidScores and list the scores as an array. the scores will also be placed into a sum at the end
		 */
		double[]scores = new double[7];
		scores[0] = Score1;
		scores[1] = Score2;
		scores[2] = Score3;
		scores[3] = Score4;
		scores[4] = Score5;
		scores[5] = Score6;
		scores[6] = Score7;
		
		for (int i = 0; i<scores.length; i++)
		{
		System.out.println("Judge " + (i + 1) + "'s Score's " + scores[i]);
		sum += i;
		/*
		 * taking out the smallest and biggest score
		 */
		 if(scores[i] > Score1 && scores[i] > Score2 && scores[i] > Score3 && scores[i] > Score4 && scores[i] > Score5 && scores[i] > Score6)
			{
				sum -= scores[i];
			}
			 else if (scores[i] < Score1 && scores[i] < Score2 && scores[i]< Score3 && scores[i] < Score4 && scores[i]< Score5 && scores[i]< Score6)
			 {
				 sum -= scores[i];
			 }
		
		}
		 System.out.println(("your highest and lowest score will be removed in your final score"));
		
		return sum;
		
		
		}
	
	public static double difficulty()
	{
		/*
		 * setting the difficulty value
		 */
		difficulty = keyboard.nextDouble();
		
		while(difficulty<1.2 || difficulty > 3.8)
		{
		System.out.println("i'm sorry...my hearing's off... what was the difficulty?");	
		difficulty = keyboard.nextDouble();
		}
		System.out.println("So the difficulty was " + difficulty);
			
		
				return difficulty;
	}
	
	public static void calculatescore()
	{
		/*
		 * creating the method of calculating final score 
		 */
	total = (sum * difficulty * 0.6);
		
		
	}
	
public static void main(String[]args)
{ 
	/*
	 * piecing above methods together
	 */
	
	inputvalidScore();
    inputallScores();
    System.out.println("on a scale of 1.2 to 3.8, how difficult was your dive?");
    difficulty();
    calculatescore();
    System.out.println("your Total Score is " + total);
keyboard.close();	
}

}
