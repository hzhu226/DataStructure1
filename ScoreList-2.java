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
 * The class is used to create a new list to store the score items 
 * which are created in the score class. And set up the method to modify 
 * the score list.
 * @author Haotian Zhu
 */
public class ScoreList implements ScoreListADT{
	private int numItems;
	private Score[] scoreList;

	/**
	 * A method used to create a new ScoreList and set up the size.
	 * also can be used in the test class.
	 */
	public ScoreList(){
		numItems = 0;
		scoreList = new Score[100];
	}

	/** 
	 * Returns the number of Scores in the list or zero
	 * @return the number of scores in this list
	 */
	@Override
	public int size() {
		return numItems;
	}

	/** 
	 * Adds the score to the end of this list.
	 * 
	 * @param s a non-null Score to place as the last item in the list.
	 * @throws IllegalArgumentException
	 */
	@Override
	public void add(Score s) throws IllegalArgumentException {
		if (s == null)
			throw new IllegalArgumentException();
		scoreList[numItems] = s;
		numItems++;
	}

	/**
	 * Removes and returns the item at index position i.
	 * If i is less than zero or greater than size()-1,
	 * will throw an IndexOutOfBoundsException.
	 * @param i must be greater than or equal to zero and less than size()
	 * @return the item at index i
	 * @throws IndexOutOfBoundsException
	 */
	@Override
	public Score remove(int i) throws IndexOutOfBoundsException {
		//when i is less than zero or greater than size()-1
		if (i < 0 || i > size() - 1)
			throw new IndexOutOfBoundsException();
		Score a = scoreList[i];
		for (int j = i; j < numItems - 1; j++) {
			scoreList[j] = scoreList[j + 1];
		}
		numItems--;
		return a;
	}

	/**
	 * Returns (without removing) the item at index position i.
	 * If i is less than zero or greater than size()-1,
	 * will throw an IndexOutOfBoundsException.
	 * @param i must be greater than or equal to zero and less than size()
	 * @return the item at index i
	 * @throws IndexOutOfBoundsException
	 */
	@Override
	public Score get(int i) throws IndexOutOfBoundsException {
		//when i is less than zero or greater than size()-1
		if (i < 0 || i > size() - 1)
			throw new IndexOutOfBoundsException();
		return scoreList[i];
	}


}
