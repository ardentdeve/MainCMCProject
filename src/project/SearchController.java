package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
package project;

import java.util.ArrayList;

/**
 * @author aonneji
 *
 */
public class SearchController{
	DBController dbl;

	public  SearchController(){
		dbl = new DBController();
	}

	public ArrayList<University> search(String name, String state, String location, String control,int numberStudentsMin, int numberStudentsMax, 
			double pctFemaleMin, double pctFemaleMax, double satVerbalMin, double satVerbalMax, double satMathMin, double satMathMax, 
			double expensesMin, double expensesMax, double pctFinancialAidMin, double pctFinancialAidMax, int numberOfApplicantsMin, 
			int numberOfApplicantsMax, double pctAdmittedMin, double pctAdmittedMax, double pctEnrolledMin, double pctEnrolledMax, 
			int AcademicScaleMin, int AcademicScaleMax, int socialScaleMin, int socialScaleMax, int QualityOfLifeScaleMin, int QualityOfLifeScaleMax,ArrayList<String>emphasis) {

		ArrayList<University > universityList = dbl.getUniversities();
		ArrayList<University> searchResult = new ArrayList<University>();
		
		
		
		for(University u: universityList) {
			boolean includeUni = true;

			if(name!=null) {
				if(!(u.getName().equals(name)))
				{
					includeUni = false;
				}

			}

			if(state!=null) {
				String uniN= u.getState();
				if(!(uniN.equals(state)))
				{
					includeUni = false;
				}

			}

			if(location!=null) {
				String uniN= u.getLocation();
				if(!(uniN.equals(location)))
				{
					includeUni = false;
				}

			}

			if(control!=null) {
				String uniN= u.getControl();
				if(!(uniN.equals(control)))
				{
					includeUni = false;
				}

			}
		
			
			if(numberStudentsMin!=-1) {
				int uniN= u.getNumberStudents();
				if(uniN< numberStudentsMin)
				{
					includeUni = false;
				}

			}
			
			if(numberStudentsMax!=-1) {
				int uniN= u.getNumberStudents();
				if(uniN> numberStudentsMax)
				{
					includeUni = false;
				}

			}

			if(pctFemaleMin!=-1.0) {
				double uniN= u.getPctFemale();
				if(uniN< pctFemaleMin )
				{
					includeUni = false;
				}

			}
			if(pctFemaleMax!=-1.0) {
				double uniN= u.getPctFemale();
				if(uniN> pctFemaleMax )
				{
					includeUni = false;
				}

			}

			if(satVerbalMin!=-1.0) {
				double uniN= u.getSatVerbal();
				if(uniN < satVerbalMin)
				{
					includeUni = false;
				}

			}
			
			if(satVerbalMax!=-1.0) {
				double uniN= u.getSatVerbal();
				if(uniN > satVerbalMax)
				{
					includeUni = false;
				}

			}
			
			

			if(satMathMin!=-1) {
				double uniN= u.getSatMath();
				if(uniN < satMathMin)
				{
					includeUni = false;
				}

			}
			
			if(satMathMax!=-1) {
				double uniN= u.getSatMath();
				if(uniN > satMathMax)
				{
					includeUni = false;
				}

			}

			if(expensesMin!=-1.0) {
				double uniN= u.getExpenses();
				if(uniN < expensesMin)
				{
					includeUni = false;
				}

			}
			
			if(expensesMax!=-1.0) {
				double uniN= u.getExpenses();
				if(uniN > expensesMax)
				{
					includeUni = false;
				}

			}

			if(pctFinancialAidMin!=-1.0) {
				double uniN= u.getPctFinancialAid();
				if(uniN < pctFinancialAidMin)
				{
					includeUni = false;
				}

			}
			
			if(pctFinancialAidMax!=-1.0) {
				double uniN= u.getPctFinancialAid();
				if(uniN > pctFinancialAidMax)
				{
					includeUni = false;
				}

			}
			if(pctEnrolledMin!=-1.0) {
				double uniN= u.getPctEnrolled();
				if(uniN < pctEnrolledMin)
				{
					includeUni = false;
				}

			}
			
			if(pctEnrolledMax!=-1.0) {
				double uniN= u.getPctEnrolled();
				if(uniN > pctEnrolledMax)
				{
					includeUni = false;
				}

			}
			
			if(AcademicScaleMin!=-1.0) {
				double uniN= u.getAcademicScale();
				if(uniN < AcademicScaleMin)
				{
					includeUni = false;
				}

			}
			
			if(AcademicScaleMax!=-1.0) {
				double uniN= u.getAcademicScale();
				if(uniN > AcademicScaleMax)
				{
					includeUni = false;
				}

			}
			
			if(socialScaleMin!=-1){
				int uniN= u.getSocialScale();
				if(uniN < socialScaleMin)
				{
					includeUni = false;
				}
			}
			
			if(socialScaleMax!=-1){
				int uniN= u.getSocialScale();
				if(uniN > socialScaleMax)
				{
					includeUni = false;
				}
			}
			
			if(QualityOfLifeScaleMax!=-1) {
				int uniN= u.getQualityOfLifeScale();
				if(uniN > QualityOfLifeScaleMax)
				{
					includeUni = false;
				}
			}
			if(QualityOfLifeScaleMin!=-1){
				int uniN= u.getQualityOfLifeScale();
				if(uniN < QualityOfLifeScaleMin)
				{
					includeUni = false;
				}
			}

			
			if(emphasis !=null)
			{
			  for(String s : emphasis)
			  {
				  if(!(u.getEmphases().contains(s)))
				  {
					 includeUni = false; 
				  }
			  }
			}

			if(includeUni) {
				searchResult.add(u);
			}
			


		}
		return searchResult;
	}
	public ArrayList<University> viewSchool(University school)
	{
		int numStudentsMax = Integer.MAX_VALUE; 
	    int numStudentsMin = Integer.MIN_VALUE;
	    double PctFemaleMax = Double.MAX_VALUE; 
	    double PctFemaleMin= Double.MIN_VALUE;
	    double satVerbalMax = Double.MAX_VALUE; 
	    double satVerbalMin= Double.MIN_VALUE;
	    double satMathMax = Double.MAX_VALUE; 
	    double satMathMin= Double.MIN_VALUE;
	    double expensesMax= Double.MAX_VALUE; 
	    double expensesMin= Double.MIN_VALUE;
	    double pctAidMax = Double.MAX_VALUE; 
	    double pctAidMin= Double.MIN_VALUE;
	    int numApplicantsMax= Integer.MAX_VALUE; 
	   int numApplicantsMin= Integer.MIN_VALUE;
	    double pctAdmittedMax= Double.MAX_VALUE; 
	    double pctAdmittedMin= Double.MIN_VALUE;
	    double pctEnrolledMax= Double.MAX_VALUE; 
	    double pctEnrolledMin= Double.MIN_VALUE;
	    int academicScaleMax= Integer.MAX_VALUE; 
		int academicScaleMin= Integer.MIN_VALUE;
		int socialScaleMax= Integer.MAX_VALUE; 
		int socialScaleMin= Integer.MIN_VALUE;
		int qualityScaleMax= Integer.MAX_VALUE; 
		int qualityScaleMin= Integer.MIN_VALUE;
	    ArrayList<University>all = dbl.getUniversities();
	    for (University u : all) {
	        if (u.getNumberStudents() < numStudentsMin)
	            numStudentsMin = u.getNumberStudents();
	        else if (u.getNumberStudents() > numStudentsMax)
	            numStudentsMax = u.getNumberStudents();
	        if (u.getPctFemale() < PctFemaleMin)
	           PctFemaleMin = u.getPctFemale();
	        else if (u.getPctFemale() > PctFemaleMax)
	           PctFemaleMax= u.getPctFemale();
	        if (u.getSatVerbal() < satVerbalMin)
		           satVerbalMin = u.getSatVerbal();
		    else if (u.getSatVerbal() > satVerbalMax)
		           satVerbalMax= u.getSatVerbal();
	        if (u.getSatMath() < satMathMin)
		           satMathMin = u.getSatMath();
		    else if (u.getSatMath() > satMathMax)
		           satMathMax= u.getSatMath();
	        if (u.getExpenses() < expensesMin)
		           expensesMin = u.getExpenses();
		    else if (u.getExpenses() > expensesMax)
		          expensesMax= u.getExpenses();
	        if (u.getPctFinancialAid() < pctAidMin)
		           pctAidMin = u.getPctFinancialAid();
		    else if (u.getPctFinancialAid()> pctAidMax)
		         pctAidMax= u.getPctFinancialAid();
	        if (u.getNumberOfApplicants() <  numApplicantsMin)
	        	 numApplicantsMin = u.getNumberOfApplicants();
		    else if (u.getNumberOfApplicants()>  numApplicantsMax)
		    	 numApplicantsMax= u.getNumberOfApplicants();
	        if (u.getPctAdmitted() < pctAdmittedMin)
	        	pctAdmittedMin = u.getNumberOfApplicants();
		    else if (u.getPctAdmitted()>  pctAdmittedMax)
		    	pctAdmittedMax= u.getNumberOfApplicants();
	        if (u.getPctEnrolled() < pctEnrolledMin)
	        	pctEnrolledMin=u.getPctEnrolled();
		    else if (u.getPctEnrolled()> pctEnrolledMax)
		    	pctEnrolledMax= u.getPctEnrolled();
	        if (u.getAcademicScale() < academicScaleMin)
	        	academicScaleMin=u.getAcademicScale();
		    else if (u.getAcademicScale()> academicScaleMax)
		    	academicScaleMax= u.getAcademicScale();
	        if (u.getSocialScale() < socialScaleMin)
	        	socialScaleMin=u.getSocialScale();
		    else if (u.getSocialScale()> socialScaleMax)
		    	socialScaleMax= u.getSocialScale();
	        if (u.getQualityOfLifeScale() < qualityScaleMin)
	        	qualityScaleMin=u.getQualityOfLifeScale();
		    else if (u.getQualityOfLifeScale()> qualityScaleMax)
		    	qualityScaleMax= u.getQualityOfLifeScale();
	       
	       
	 
	    }
	    
	    ArrayList<University> allSort = new ArrayList<University>();
	    for (University u : all) {
	       int dist = 0;
	        dist += Math.abs(school.getNumberStudents() - u.getNumberStudents()) / (numStudentsMax - numStudentsMin);
	        dist += Math.abs(school.getPctFemale() - u.getPctFemale()) / (PctFemaleMax - PctFemaleMin);
	        dist += Math.abs(school.getSatVerbal() - u.getSatVerbal()) / (satVerbalMax - satVerbalMin);
	        dist += Math.abs(school.getSatMath() - u.getSatMath()) / (satMathMax - satMathMin);
	        dist += Math.abs(school.getExpenses() - u.getExpenses()) / (expensesMax - expensesMin);
	        dist += Math.abs(school.getPctFinancialAid() - u.getPctFinancialAid()) / (pctAidMax - pctAidMin);
	        dist += Math.abs(school.getNumberOfApplicants() - u.getNumberOfApplicants()) / (numApplicantsMax- numApplicantsMin);
	        dist += Math.abs(school.getPctAdmitted() - u.getPctAdmitted()) / (pctAdmittedMax- pctAdmittedMin);
	        dist += Math.abs(school.getPctEnrolled() - u.getPctEnrolled()) / (pctEnrolledMax- pctEnrolledMin);
	        dist += Math.abs(school.getAcademicScale() - u.getAcademicScale()) / (academicScaleMax- academicScaleMin);
	        dist += Math.abs(school.getSocialScale() - u.getSocialScale()) / (socialScaleMax- socialScaleMin);
	        dist += Math.abs(school.getQualityOfLifeScale() - u.getQualityOfLifeScale()) / (qualityScaleMax- qualityScaleMin);
	        u.setDistance(dist);
	        allSort.add(u);
	    }
            ArrayList<University>newList = new ArrayList<University>();
			Collections.sort(allSort);
			University uni = null;
			University uni2= null;
			University uni3= null;
			University uni4 = null;
			University uni5=null;
			for(int i  =0 ; i< allSort.size();i++)
			{
				 uni= allSort.get(0);
				uni2 = allSort.get(1);
				uni3 = allSort.get(2);
				uni4 = allSort.get(3);
				 uni5 = allSort.get(4);
			}
			newList.add(uni);
			newList.add(uni2);
			newList.add(uni3);
			newList.add(uni4);
			newList.add(uni5);
			return newList;
	}
}


