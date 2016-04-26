/*
 * File: University.java
 */

package project;

import java.util.*;

/**
 * A class representing a university in the CMC system.
 * 
 * @author Ardent Developers
 * @version March, 2016
 */
public class University implements Comparable<University> {

	/** the name of the University*/
	private String name;
	/** the state the University is in*/
	private String state;
	/** the location of the University, i.e. urban, suburban*/
	private String location;
	/** the control on the University, i.e. private, public*/
	private String control;
	/** the number of students attending the University*/
	private int numberStudents;
	/** the percent of students that are female*/
	private double pctFemale;
	/** the average SAT verbal score*/
	private double satVerbal;
	/** the average SAT math score*/
	private double satMath;
	/** the average expenses in a typical year for a student*/
	private double expenses;
	/** the percent of students receiving financial aid*/
	private double pctFinancialAid;
	/** the number of applicants per year*/
	private int numberOfApplicants;
	/** the percent of students admitted of the applicants*/
	private double pctAdmitted;
	/** the percent of admitted students that end up enrolling*/
	private double pctEnrolled;
	/** a 1 to 5 scale of academic quality of the University*/
	private int academicScale;
	/** a 1 to 5 scale of social life quality of the University*/
	private int socialScale;
	/** a 1 to 5 scale of quality of life of the University*/
	private int qualityOfLifeScale;
	/** a list of emphases that the college is admired for*/
	private ArrayList<String> emphases;
	/** a list of Universities with similar qualities*/
	private List<University> similarUniversities;
	private double distance;

	/**
	 * Constructor
	 * 
	 * @param name the name to set
	 * @param state the state to set
	 * @param location the location to set
	 * @param numberStudents the numberStudents to set
	 * @param pctFemale the pctFemale to set
	 * @param satVerbal the satVerbal to set
	 * @param satMath the satMath to set
	 * @param expenses the expenses to set
	 * @param pctFinancialAid the pctFinancialAid to set
	 * @param numberOfApplicants the numberOfApplicants to set
	 * @param pctAdmitted the pctAdmitted to set
	 * @param pctEnrolled the pctEnrolled to set
	 * @param academicScale the academicScale to set
	 * @param socialScale the socialScale to set
	 * @param qualityOfLifeScale the qualityOfLifeScale to set
	 * @param control the control to set
	 * @param emphases the emphases to set
	 * @param similarUniversities the similarUniversities to set
	 */
	public University(String name, String state, String location, String control ,int numberStudents, double pctFemale,
			double satVerbal, double satMath, double expenses, double pctFinancialAid, int numberOfApplicants,
			double pctAdmitted, double pctEnrolled, int academicScale, int socialScale, int qualityOfLifeScale,ArrayList<String>emphases) {
		super();
		this.name = name;
		this.state = state;
		this.location = location;
		this.control = control;
		this.numberStudents = numberStudents;
		this.pctFemale = pctFemale;
		this.satVerbal = satVerbal;
		this.satMath = satMath;
		this.expenses = expenses;
		this.pctFinancialAid = pctFinancialAid;
		this.numberOfApplicants = numberOfApplicants;
		this.pctAdmitted = pctAdmitted;
		this.pctEnrolled = pctEnrolled;
		this.academicScale = academicScale;
		this.socialScale = socialScale;
		this.qualityOfLifeScale = qualityOfLifeScale;
		this.emphases = emphases;
		distance =0;
	}
	/**
	 * Method to set the university for each parameter.
	 * @param name the name to set
	 * @param state the state to set
	 * @param location the location to set
	 * @param numberStudents the numberStudents to set
	 * @param pctFemale the pctFemale to set
	 * @param satVerbal the satVerbal to set
	 * @param satMath the satMath to set
	 * @param expenses the expenses to set
	 * @param pctFinancialAid the pctFinancialAid to set
	 * @param numberOfApplicants the numberOfApplicants to set
	 * @param pctAdmitted the pctAdmitted to set
	 * @param pctEnrolled the pctEnrolled to set
	 * @param academicScale the academicScale to set
	 * @param socialScale the socialScale to set
	 * @param qualityOfLifeScale the qualityOfLifeScale to set
	 * @param control the control to set
	 * @param emphases the emphases to set
	 * @param similarUniversities the similarUniversities to set
	 */
	public void setUniversity(String name, String state, String location, String control ,int numberStudents, double pctFemale,
			double satVerbal,double satMath, double expenses, double pctFinancialAid, int numberOfApplicants,
			double pctAdmitted, double pctEnrolled, int academicScale, int socialScale, int qualityOfLifeScale, ArrayList<String> emphases) {		
		this.name = name;
		this.state = state;
		this.location = location;
		this.control = control;
		this.numberStudents = numberStudents;
		this.pctFemale = pctFemale;
		this.satVerbal = satVerbal;
		this.satMath = satMath;
		this.expenses = expenses;
		this.pctFinancialAid = pctFinancialAid;
		this.numberOfApplicants = numberOfApplicants;
		this.pctAdmitted = pctAdmitted;
		this.pctEnrolled = pctEnrolled;
		this.academicScale = academicScale;
		this.socialScale = socialScale;
		this.qualityOfLifeScale = qualityOfLifeScale;
		this.emphases = emphases;
		  this.distance =0;
	}
	public void setDistance(double value)
	{
	this.distance = value;
	}
	
	public double getDistance()
	{
		return distance;
	}
	/**
	 * returns the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public int compareTo(University o)
	{
		if(this.distance> o.getDistance())
		{
			return 1;
		}
		else if(this.distance<o.getDistance())
		{
		return -1;	
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * returns the state
	 * 
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * returns the location
	 * 
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	
	/**
	 * returns the control
	 * 
	 * @return the control
	 */
	public String getControl() {
		return control;
	}
	
	/**
	 * returns the numberStudents
	 * 
	 * @return the numberStudents
	 */
	public int getNumberStudents() {
		return numberStudents;
	}
	
	/**
	 * returns the pctFemale
	 * 
	 * @return the pctFemale
	 */
	public double getPctFemale() {
		return pctFemale;
	}
	
	/**
	 * returns the satVerbal
	 * 
	 * @return the satVerbal
	 */
	public double getSatVerbal() {
		return satVerbal;
	}
	
	/**
	 * returns the satMath
	 * 
	 * @return the satMath
	 */
	public double getSatMath() {
		return satMath;
	}
	
	/**
	 * returns the expenses
	 * 
	 * @return the expenses
	 */
	public double getExpenses() {
		return expenses;
	}
	
	/**
	 * returns pctFinancialAid
	 * 
	 * @return the pctFinancialAid
	 */
	public double getPctFinancialAid() {
		return pctFinancialAid;
	}
	
	/**
	 * returns numberOfAplicants
	 * 
	 * @return the numberOfApplicants
	 */
	public int getNumberOfApplicants() {
		return numberOfApplicants;
	}
	
	/**
	 * returns pctAdmitted
	 * 
	 * @return the pctAdmitted
	 */
	public double getPctAdmitted() {
		return pctAdmitted;
	}
	
	/**
	 * returns pctEnrolled
	 * 
	 * @return the pctEnrolled
	 */
	public double getPctEnrolled() {
		return pctEnrolled;
	}
	
	/**
	 * returns academicScale
	 * 
	 * @return the academicScale
	 */
	public int getAcademicScale() {
		return academicScale;
	}
	
	/**
	 * returns socialScale
	 * 
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return socialScale;
	}
	
	/**
	 * returns qualityOfLifeScale
	 * 
	 * @return the qualityOfLifeScale
	 */
	public int getQualityOfLifeScale() {
		return qualityOfLifeScale;
	}
	
	/**
	 * return emphases
	 * 
	 * @return the emphases
	 */
	public ArrayList<String >getEmphases() {
		return emphases;
	}
	
	/**
	 * returns similarUniversities
	 * 
	 * @return the similarUniversities
	 */
	public List<University> getSimilarUniversities() {
		return similarUniversities;
	}

	/**
	 * returns a string description of this University
	 * 
	 * @return a string description of the university
	 */
	@Override
	public String toString() {

		return "University [name=" + name + ", state=" + state + ", location=" + location + ", control=" + control
				+ ", numberStudents=" + numberStudents + ", pctFemale=" + pctFemale + ", satVerbal=" + satVerbal
				+ ", satMath=" + satMath + ", expenses=" + expenses + ", pctFinancialAid=" + pctFinancialAid
				+ ", numberOfApplicants=" + numberOfApplicants + ", pctAdmitted=" + pctAdmitted + ", pctEnrolled="
				+ pctEnrolled + ", academicScale=" + academicScale + ", socialScale=" + socialScale
				+ ", qualityOfLifeScale=" + qualityOfLifeScale + ", emphases=" + emphases + ", similarUniversities="
				+ similarUniversities + ", getName()=" + getName() + ", getState()=" + getState() + ", getLocation()="
				+ getLocation() + ", getControl()=" + getControl() + ", getNumberStudents()=" + getNumberStudents()
				+ ", getPctFemale()=" + getPctFemale() + ", getSatVerbal()=" + getSatVerbal() + ", getSatMath()="
				+ getSatMath() + ", getExpenses()=" + getExpenses() + ", getPctFinancialAid()=" + getPctFinancialAid()
				+ ", getNumberOfApplicants()=" + getNumberOfApplicants() + ", getPctAdmitted()=" + getPctAdmitted()
				+ ", getPctEnrolled()=" + getPctEnrolled() + ", getAcademicScale()=" + getAcademicScale()
				+ ", getSocialScale()=" + getSocialScale() + ", getQualityOfLifeScale()=" + getQualityOfLifeScale()
				+ ", getEmphases()=" + getEmphases() + ", getSimilarUniversities()=" + getSimilarUniversities() + "]";
	}
}
