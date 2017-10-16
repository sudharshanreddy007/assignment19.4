package employee;


import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Employee{
  //created class employee
	   
	    private String name; //created variables
//private is only accessible to the same class we declared
	    //String means set of characters
	    private long salary;
//long is data type with 64 bit 2's complement
	    public String getName() {
	    	//public keyword is used in the declaration of a class,method or 
	    	//field;public classes,method and fields can be accessed by the 
	    	//members of any class.
	    	return name;
	        //return the values
	    }
//Get methods provide access to the value a variable holds while set methods assign values to the variables of the objects.
	
	    public long getSalary() {
	        return salary;
	    }

	    public Employee( int salary,  String name) {
	        
	        this.name = name;
	       //this refers to the current object
	        this.salary = salary;
	    }

	    
	    public String toString()
	    //it look over string itself
	    {
	        return   " name=" + this.name +  " salary =" + this.salary;
	    }
     


	  public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
		  //Comparator interface is used to order the user-defined class objects, compare() method, collection class
	      //creating the object which refers to employee  
		  @Override
	        public int compare(Employee e1, Employee e2)
		  //compares the employee's value
		  {
			  
	            return (int) (e1.getSalary() - e2.getSalary());
	        }
	    
	        };
	    
}
class EmployeeComparator implements Comparator<Employee>
//Comparator interface is used to order the objects of user-defined class.
{
	  public int compare (Employee o1,Employee o2){
		  if (o1.getSalary()> o2.getSalary())
	//if they are greater then return 1
			  return 1;
		  else return 1;
		  }
	  }


          public class EmployeeDemo{
        	

        	  public static void main (String []args){
        		//static is used for memory management
        		//void is used to define the return type of the method
        		//String[] args is actually an array of java.lang.String type and it's name is args here
        						
		
            PriorityQueue<Employee> queuelist = new PriorityQueue<Employee>();
//created priority queue object list and implemented objects in the class
//here add the elemnts into queuelist
            queuelist.add(new Employee(50000,"sabnam")); 
        	queuelist.add(new Employee(70000,"rahul eswar"));
        	queuelist.add(new Employee(60000,"shina"));
        	queuelist.add(new Employee(46000,"nupur"));
        	queuelist.add(new Employee(80000,"waris"));
        	queuelist.add(new Employee(30000,"sanju"));
        	
//we are using the ternary operator to compare 
        	for (Employee employee : queuelist){
        		System.out.println(employee);
        	 
      	   
        	}

	}
          }