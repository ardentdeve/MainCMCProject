/*
 * File: StudentHome.java
 */
package project;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * This class functions as a home for all Students. The Students are stored in a list 
 * and are able to use the methods defined here
 * 
 * @author Ardent Developers
 * @version March, 2016
 */

public class StudentHome {
	/** An arrayList containing all of the students*/
	private ArrayList<Student>allStudents;
	/** Reference to the DBController*/
	private DBController dbl = new DBController();
	/** Reference to Student object */
	private Student stu;
	/** Reference to the StudentUI */
	private StudentUI studentUI;
	private boolean loggedOn= false;



	/**
	 * Takes a Student's username and password and confirms they are a Student. Then finds the Student
	 * in the allStudents list and confirms they exist. Finally sets the loginStatus of the confirmed student
	 * to true, logging in the user
	 * 
	 * @param username username of the student that logs in
	 * @param password password of the student that logs in
	 * @return the student that is logged in
	 */

	public int login(String username, String password)
	{

		int status = -1;
		try{
			if(this.isUserStudent(username))
			{
				status = -2; 
				stu= this.findByUsername(username);
				if(stu.getPassword().equals(password))
				{
					status = 0;

					this.setLoggedOn(true);

				}

			}
			return status;
		}
		catch(Exception e)
		{
			return -3;
		}
	}
	public int deleteStudent(Student s)
	{
		return dbl.deleteStudent(s.getUsername());
	}

	public Student getUser()
	{
		return this.stu;
	}

	/**
	 * @return the loggedIn
	 */
	public boolean isLoggedOn() {
		return loggedOn;
	}

	/**
	 * searches the allStudents list in this class for a student of the specified 
	 * username and returns it if found.
	 * 
	 * @param username the username of the student to search for
	 * @return the student corresponding to the username specified
	 */

	public Student findByUsername(String username) {
		allStudents = dbl.getStudents();
		for(Student s: allStudents)
		{
			if(s.getUsername().equals(username))
			{
				stu = s;
			}
		}
		return stu;
	}


	/**
	 * @param loggedIn
	 *            the loggedIn to set
	 */
	public void setLoggedOn(boolean loggedOn) {
		this.loggedOn = loggedOn;
	}

	/**
	 * Changes this.student's loginStatus to false and clears the current student from this home
	 * 
	 * catches NullPointerException if logOff fails.
	 */
	public void logoff() {
		this.setLoggedOn(false);
	}


	/**
	 * Adds a student to the allStudents list
	 * 
	 * @param student
	 */
	public int addStudent(Student student) {
		return dbl.addStudent(student);
	}

	/**
	 * Removes the specified University name from the current Student's list of schools
	 * 
	 * @param school the name of the school to remove
	 * @return 1 if the remove succeeded and -1 otherwise
	 */

	public int removeUniversity(String school)
	{
		return dbl.removeSchool(stu.getUsername(), school);

	}

	/**
	 * Saves the the University correpsonding to the specified school name to the specified 
	 * Student's saved schools
	 */
	public int saveUniversity(String school) {
		return dbl.saveSchool(stu,school);
	}

	/**
	 * prints the saved schools of the current students saved schools list
	 */
	public ArrayList<University> getSavedUniversity() {
		ArrayList<University> savedSchool= dbl.getSavedSchool(stu.getUsername());
		stu.setSavedUni(savedSchool);
		ArrayList<University> uniLists = stu.getSavedUniversity();
		return uniLists;
	}

	public University uniInfo(String uni)
	{
		University university = null;
		for(University u: this.getSavedUniversity())
		{
			if(u.getName().equals(uni))
			{
				university = u;

			}
		}
		return university;
	}
	/**
	 * Creates a Student with the specified information and calls editStudent from 
	 * the DBController class
	 * 
	 * @param firstname the firstname of the new Student
	 * @param lastname the lastname of the new Student
	 * @param password the password of the new Student
	 * 
	 * @return the result of the editStudent method from the DBController
	 */
	public int editProfile(Student s) {
		return dbl.editStudent(s.getUsername(), s.getFirstName(),s.getLastName(),s.getPassword(),s.getType(), s.getStatus());
	}
	/**
	 * Check if the Student corresponding to the specified username is a student by
	 * calling the similar method in the DBController class
	 */
	public boolean isUserStudent(String username){
		return dbl.isUserStudent(username);
	}
}