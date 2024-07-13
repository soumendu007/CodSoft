package student_grade_calculator;
import java.util.*;
public class task2 {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 Scanner scan = new Scanner(System.in);	 
		 System.out.print("Enter the number of subjects: ");
		 int numSubjects = sc.nextInt();
		 float marks[]=new float [numSubjects];
		 
		 System.out.print("Enter Marks Obtained in all Subjects: ");
	   
	      for(int i=0; i<numSubjects; i++)
	      {  
	    	  float n=scan.nextFloat();
	    	  if(n>=0 && n<=100)
	    		  marks[i] = n;
	    	  else
	    	  { 
	    		System.out.println("Warning! Please enter numbers within 0 to 100");
	    	  	i--;
	    	  }
	    	  	
	      }
	      
	      float sum=sumOfSubject(marks);
	      float avg=sum/numSubjects;
	      System.out.print("Sum up the marks obtained in all subjects = "+sumOfSubject(marks));
	      System.out.print("\naverage percentage ="+String.format("%.1f", avg)+"%");
	      System.out.print("\nGrade = ");
	      grade(avg);
	      sc.close();
	      scan.close();
	          
	}
	static float sumOfSubject(float[] marks)
	{
		float sum=0;
		for(int j=0; j<marks.length; j++)
	         sum += marks[j];
		return sum;
	}
	
	
	static void grade(float avg)
	{
		if(avg>=95)
            System.out.println("O");
         else if(avg>=90)
            System.out.println("A+");
         else if(avg>=80)
            System.out.println("A");
         else if(avg>=75)
            System.out.println("B");
         else if(avg>=60)
            System.out.println("C");
         else if(avg>=35)
            System.out.println("D");
         
         else 
            System.out.println("F");
	}

}

