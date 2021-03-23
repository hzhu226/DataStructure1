/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Spring 2016 
// PROJECT:          ScoreList and Score
// FILE:             P0
//
// Authors: Haotian Zhu
// Author1: Haotian Zhu, hzhu226@wisc,edu, haotian, 001
// Author2: (name2,email2,netID2,lecture number2)
//
// ---------------- OTHER ASSISTANCE CREDITS 
// Persons: Identify persons by name, relationship to you, and email. 
// Describe in detail the the ideas and help they provided. 
// 
// Online sources: avoid web searches to solve your problems, but if you do 
// search, be sure to include Web URLs and description of 
// of any information you find. 
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * This class is used to set up a new item which consists the name, the points earned 
 * and the points possible. This new items can be used to create a new arraylist.
 * @author Haotian Zhu
 */
public class Score {
	private String name;
	private double pointsEarned;
	private double pointsPossible;
	
	/**
	 * A method used to be called in the test class in order to make sure that 
	 * the program can run correctly.
	 * @param name is the name of the new score item
	 * @param pointsEarned is the points which earned by the new item
	 * @param pointsPossible is the possible points which can be earned
	 */
	public Score(String name, double pointsEarned, double pointsPossible) throws IllegalArgumentException {
		if (name == null || pointsEarned < 0 || pointsPossible < 0 || pointsEarned > pointsPossible)
			throw new IllegalArgumentException();
		this.pointsEarned = pointsEarned;
		this.pointsPossible = pointsPossible;
		this.name = name;
	}
	
	/**
	 * Get the name of the new item
	 * @return the assignment name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Get the points earned
	 * @return points earned by the new item
	 */
	public double getPoints(){
		return pointsEarned;
	}
	
	/**
	 * Get the points possible for the assignment
	 * @return the possible points for the assignment
	 */
	public double getMaxPossible(){
		return pointsPossible;
	}
	
	/**
	 * Get the first character of the name
	 * @return the first character of the name
	 */
	public String getCategory(){
		char capital = name.charAt(0);
		String s = String.valueOf(capital);
		return s;
	}
	
	/**
	 * Get the percentage of points/possible times 100.
	 * @return the percentage of points/possible times 100.
	 */
	public double getPercent(){
		double per = pointsEarned/pointsPossible * 100;
		return per;
	}

}
