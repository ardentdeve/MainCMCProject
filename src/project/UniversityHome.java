/*
 * File: UniversityHome.java
 */

package project;

import java.util.*;
import dblibrary.project.csci230.UniversityDBLibrary;

/**
 * A class that functions as a home for all Universities. The implemented methods 
 * are used to edit the list of Universities
 * 
 * @author Ardent Developers
 * @version March, 2016
 */
public class UniversityHome {

	/** an ArrayList of University objects*/
	private ArrayList<University> universities;
	/** an instance of DBController used to retrieve information about Universities*/
	private DBController dbl = new DBController();


	/**
	 * Adds the specified University to the list universities using the database controller
	 * 
	 * @param u the University to add
	 */
	public int addUniversityToList(University u){
		return dbl.addUniversity(u);
	}

	/** 
	 * Returns a list of all Universitites in the database
	 */
	public ArrayList<University> getUniversities(){ 
		return dbl.getUniversities();
	}
	
	public University getUniInfo(String uni)
	{
		University university = null;
		for(University u: dbl.getUniversities())
		{
			if(u.getName().equals(uni))
			{
				university = u;
			}
		}
		return university;
	}
	

	/**
	 * Edits the specified Universities information using the DBController class
	 */
	public int editUniversities(University u) {
		return dbl.editUniversity(u);
	}

	/**
	 * Deletes the specified University from the home
	 * 
	 * @param u the University to delete
	 */
	public int deleteUniversities(University u) {
		return dbl.deleteUniversity(u);
	}
	/**
	 * Adds the specified emphasis to the specified University 
	 * using the DBController class method
	 */
	public int addUniversityEmphasis(University u, String emphasis) {
		return dbl.addUniversityEmphasis(u, emphasis);
	}
	/**
	 * Method to delete a University emphasis.
	 * @param u the university to edit
	 * @param emphasis the emphasis to delete
	 * @return
	 */
	public int deleteUniversityEmphasis(University u,String emphasis)
	{
		return dbl.removeUniversityEmphasis(u.getName(),emphasis);
	}
}
