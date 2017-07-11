package com.TreeSet;

import java.util.*;       //importing all classes from java's util library.. Because it has Collection Class needed for this Assignment.

/*
 * This Assignment helped me to master the concepts of Comparator class and treeset.
 */

public class EmployeeMain    //Class declaration containing main function.  
{
	public static void main(String[] args)     //main function declaration. and because it is static, program execution starts from main function. 
	{
		//Creating the object of TreeSet and in the constructor, we are passing the object of the SortEmployees class.
		TreeSet<Employee> treeSetObject = new TreeSet<Employee>(new EmployeeSort());
		
		//Now we will add the objects of Employee class into treeSetObject.
		treeSetObject.add(new Employee("Aschita", 3, 200000));
		treeSetObject.add(new Employee("Manasa", 1, 400000));
		treeSetObject.add(new Employee("Sindhu", 2, 120000));
		treeSetObject.add(new Employee("Keerthana", 2, 400000));
		treeSetObject.add(new Employee("Siana", 1, 100000));
		treeSetObject.add(new Employee("Saanvi", 2, 200000));
		
		//Now , it is the property of TreeSet that objects inside it will be in sorted automatically.
		//Now we will print the objects inside treeSetObject.
		//We will use for each loop for that.
		for(Employee tempObject : treeSetObject)
			System.out.println(tempObject.empName+" "+tempObject.empDesignation+" "+tempObject.empSalary);     //Printing the information about Employee.
	}   //End of main function.

}    //End of class.

