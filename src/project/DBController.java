/*
 *File: DBController.java 
 */
package project;
import dblibrary.project.csci230.*;
import java.util.*;

/** 
 * To run, issue: java DBLibraryDriver "ardentdev", "ardentdev", "ajjw4:".
 * Output will be saved to a comman-separated file called output.csv which you may open using a text editor or
 * a spreadsheet
 * 
 * @author Imad Rahal, Ardent Developers
 * @version February 17, 2016
 */ 

public class DBController {
	/** A variable of type UniversityDBLibrary */
	private UniversityDBLibrary univDBlib;
	/** A reference to University object */
	private University University;
	/** an ArrayList of all the students */
	private ArrayList<Student>allStudents;
	/** an ArrayList of all admins */
	private ArrayList<Admin>allAdmins;

	/** 
	 * Constructor.
	 * 
	 * @param db database 
	 * @param username username to access database
	 * @param password password to access database
	 */
	public DBController() {
		univDBlib = new UniversityDBLibrary("ardentdeve", "ardentdeve", "ajjw4");
	}

	/**
	 * Returns the database library object 
	 * 
	 * @return the database
	 */
	public UniversityDBLibrary getUnivDBlib() {
		return univDBlib;
	}

	/**
	 * This method returns an arrayList of Strings containing all universities in the database.
	 * 
	 * @return a 2-D array of Strings containing all universities in the database.
	 *         null is returned if there are no universities in the database or if a database error is encountered
	 */
	public ArrayList<University> getUniversities() {
		String arrayUni [][] = univDBlib.university_getUniversities();
		ArrayList<University> listUniversities = new ArrayList<University>();
		for(int i=0;i< arrayUni.length;i++) {
			listUniversities.add(new University(arrayUni[i][0],arrayUni[i][1],arrayUni[i][2],arrayUni[i][3], 
					Integer.parseInt(arrayUni[i][4]),Double.parseDouble(arrayUni[i][5]), 
					Integer.parseInt(arrayUni[i][6]),Integer.parseInt(arrayUni[i][7]),
					Integer.parseInt(arrayUni[i][8]),Integer.parseInt(arrayUni[i][9]), 
					Integer.parseInt(arrayUni[i][10]),Double.parseDouble(arrayUni[i][11]),
					Double.parseDouble(arrayUni[i][12]),Integer.parseInt(arrayUni[i][13]),
					Integer.parseInt(arrayUni[i][14]), Integer.parseInt(arrayUni[i][15]),this.getEmphasis(arrayUni[i][0])));
		}
		return listUniversities;
	}

	/**
	 * Adds the information of the specified University to the database library
	 * 
	 * @param u University that is going to be added
	 * @return true if the school is successfully added
	 */
	public int addUniversity(University u){
		return univDBlib.university_addUniversity(u.getName(),u.getState(),u.getLocation(),u.getControl(), 
				u.getNumberStudents(), u.getPctFemale(), u.getSatVerbal(), u.getSatMath(), 
				u.getExpenses(), u.getPctFinancialAid(), u.getNumberOfApplicants(),u.getPctAdmitted(), 
				u.getPctEnrolled(),u.getAcademicScale() , u.getSocialScale(), u.getQualityOfLifeScale());
	}
	
	/**
	 * Updates the university record for the University specified as a parameter
	 * 
	 * @param u University to be edited
	 * @return 1 if the school is successfully edited, -1 otherwise
	 */
	public int editUniversity(University u) {
		
		return univDBlib.university_editUniversity(u.getName(), u.getState(),u.getLocation(),u.getControl(),u.getNumberStudents(),u.getPctFemale(), u.getSatVerbal(),u.getSatMath(), 
			 u.getExpenses(), u.getPctFinancialAid(), u.getNumberOfApplicants(),u.getPctAdmitted(), u.getPctEnrolled(), u.getAcademicScale(),u.getSocialScale(),u.getQualityOfLifeScale());
	}

	/**
	 * Removes the specified University from the DB Library
	 * 
	 * @param u the University to be deleted
	 * @return 1 if the University was successfully deleted, -1 otherwise
	 */
	public int deleteUniversity(University u) {
		return univDBlib.university_deleteUniversity(u.getName());
	}

	/**
	 * Returns a list of all students in the DBLibrary
	 * 
	 * @return the list of all students in the DBLibrary
	 */
	public ArrayList<Student> getStudents() { 
		String arrayStudent[][]= univDBlib.user_getUsers();
		ArrayList<Student> listStudent= new ArrayList<Student>();
		for(int i=0;i< arrayStudent.length;i++) {
			if(arrayStudent[i][4].charAt(0)== 'u') {
				listStudent.add(new Student(arrayStudent[i][0],arrayStudent[i][1],arrayStudent[i][2],
						arrayStudent[i][3],arrayStudent[i][4].charAt(0),arrayStudent[i][5].charAt(0)));
			}
		}
		return listStudent;
	}
	

	/**
	 * Returns the saved schools of a Student with the specified username
	 * 
	 * @param username the username of the Student to get the saved schools
	 * @return a list of the Students saved schools
	 */
	public ArrayList<University> getSavedSchool(String username) {
		String[][] arrayUni= univDBlib.user_getUsernamesWithSavedSchools();
		ArrayList<University> savedUni= new ArrayList<University>();
		for (int i = 0; i < arrayUni.length; ++i) {
			if(arrayUni[i][0].equals(username)) {
				String univName = arrayUni[i][1];
				for(University u:this.getUniversities()) {
					if(u.getName().equals(univName))
						savedUni.add(u);
				}
			}
		}
		return savedUni;
	}
	
	
	public ArrayList<String> getEmphasis(String university) {
		String[][] arrayUni= univDBlib.university_getNamesWithEmphases();
		ArrayList<String> emphasisList= new ArrayList<String>();
		for (int i = 0; i < arrayUni.length; ++i) {
			if(arrayUni[i][0].equals(university)) {
				String emphasis = arrayUni[i][1];
				emphasisList.add(emphasis);
				}
			}
		return emphasisList;
	}

	/**
	 * Returns a list containing all admins records in the database.
	 * 
	 * @return a list containing all Admins in the database. A null is returned if there are no admins in the database or if a 
	 *         database error is encountered
	 */
	public ArrayList<Admin> getAdmins() { 
		String arrayUser[][]= univDBlib.user_getUsers();
		ArrayList<Admin> listAdmin= new ArrayList<Admin>();
		for(int i=0;i< arrayUser.length;i++) {
			if(arrayUser[i][4].charAt(0)== 'a') {
				listAdmin.add(new Admin(arrayUser[i][0],arrayUser[i][1],arrayUser[i][2],
						arrayUser[i][3],arrayUser[i][4].charAt(0),arrayUser[i][5].charAt(0)));
			}
		}
		return listAdmin;
	}
	
	public ArrayList<User> getUsers() { 
		String arrayUser[][]= univDBlib.user_getUsers();
		ArrayList<User> listUser= new ArrayList<User>();
		for(int i=0;i< arrayUser.length;i++) {
			{
				listUser.add(new Admin(arrayUser[i][0],arrayUser[i][1],arrayUser[i][2],
						arrayUser[i][3],arrayUser[i][4].charAt(0),arrayUser[i][5].charAt(0)));
			}
		}
		return listUser;
	}


	/**
	 * Returns a list containing all usernames along with their saved schools in the database.
	 * @return a list containing all (username, school) pairs in the database.
	 *         A null is returned if no users have saved schools in the database or if a database error is encountered
	 */
	public ArrayList<ArrayList<String>> getSavedSchool() {
		String[][] arrayUni= univDBlib.user_getUsernamesWithSavedSchools();
		ArrayList<ArrayList<String>> schoolLists = new ArrayList<ArrayList<String>>();
		for (int i = 0; i < arrayUni.length; ++i) {
			ArrayList<String> list = new ArrayList<String>();
			schoolLists.add(list);
			for (int j = 0; j < arrayUni[0].length; ++j) {
				list.add(arrayUni[i][j]);
			}
		}
		return schoolLists;
	}

	/**
	 * Removes the specified school from the Student with the specified username's list of saved schools
	 * 
	 * @param username a String representing the username of the user from whom this school is being removed
	 * @param school a String containing the school to be removed from the user's list of saved schools
	 * @return 1 if the school is successfully removed, -1 otherwise
	 */
	public int  removeSchool(String username,String school) {
		return univDBlib.user_removeSchool(username,school);
	}

	/**
	 * Saves the specified school to the Student with the specified username's list of saved schools
	 * 
	 * @param user  a String representing the username of the user for whom this school is being added
	 * @param uni a String containing the school to be saved to the user's list of schools
	 * @return true if school is successfully saved
	 */
	public int saveSchool(Student user, String uni) {
		return  univDBlib.user_saveSchool(user.getUsername(),uni);
	}

/**
 * Method to delete the specified student.
 * @param s student to be deleted
 * @return s deleted student
 */
	public int deleteStudent(String s)
	{
		return univDBlib.user_deleteUser(s);
	}

	/**
	 * Method to delete the specified admin.
	 * @param a student to be deleted
	 * @return a deleted admin
	 */
	public int deleteAdmin(String a)
	{
		return univDBlib.user_deleteUser(a);
	}

	/**
	 * Adds the specified Student to the BDLibrary using UniversityDBLibrary's user_addUser() method
	 * 
	 * @param student student to be added 
	 * @return true of the student is successfully added
	 */
	public int addStudent(Student student) {
		return univDBlib.user_addUser(student.getFirstName(), student.getLastName(), 
				student.getUsername(), student.getPassword(), student.getType());
	}

	/**
	 * Adds the specified emphasis to the specified University
	 * 
	 * @param u the University to add
	 * @param emphasis the emphasis to add
	 * 
	 * @return 1 is the emphasis was successfully added, -1 otherwise
	 */
	public int addUniversityEmphasis(University u, String emphasis){
		return univDBlib.university_addUniversityEmphasis(u.getName(), emphasis);
	}

	/**
	 * Creates a new admin record using the information provided in the parameters.
	 * 
	 * @param admin admin to be added
	 * @return 1 if the admin is successfully added, -1 otherwise
	 */
	public int addAdmin(Admin admin) {
		return  univDBlib.user_addUser(admin.getFirstName(), admin.getLastName(),admin.getUsername(), 
				admin.getPassword(), admin.getType());
	}

	/**
	 * Updates the record of the user, whose username is specified as 
	 * a parameter, using the information provided in the parameters.
	 * 
	 * @param student Student to be edited
	 * @return true if the student is successfully edited
	 */
	public int editStudent(String username, String firstName, String lastName, String password, char type, char status) {
		return univDBlib.user_editUser(username, firstName, lastName, password, type, status);
	}

	/**
	 * When called, this method updates the record of the user, whose username 
	 * is specified as a parameter, using the information provided in the parameters.
	 * 
	 * @param admin admin to be edited
	 * @return true if the admin is successfully edited
	 */
	public int editAdmin(String username, String firstName, String lastName, String password, char type,char status) {
		return univDBlib.user_editUser(username, firstName, lastName, password, type, status);
	}

	/**
	 * Finds out if the logged in User is and Admin
	 * 
	 * @param username username of the logged in user
	 * @return true if the specified user is an admin
	 */
	public boolean isUserAdmin(String username){
		boolean value =false;
		allAdmins = this.getAdmins();
		for(Admin admin: allAdmins) {
			if(admin.getUsername().equals(username)) {
				value = true;
			}
		}
		return value;
	}

	/**
	 * Finds out if the logged in User is and Student
	 * 
	 * @param username username of the logged in user
	 * @return true if the specified user is an student
	 */
	public boolean isUserStudent(String username){
		boolean value =false;
		allStudents = this.getStudents();
		for(Student student: allStudents) {
			if(student.getUsername().equals(username)) {
				value = true;
			}
		}
		return value;
	}

	public int removeUniversityEmphasis(String uni, String emphasis)
	{
		return univDBlib.university_removeUniversityEmphasis(uni, emphasis);
	}

}
