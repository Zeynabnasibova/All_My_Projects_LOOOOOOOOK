package saimDayByDay.day45_Constructors;

public class Employee {


    /*
	create a class called Employee
		- data:
			name, id, job title, salary
	*/

    String name;
    int id;
    String jobTitle;
    double salary;

    /*
		- constructor
			should have 4 parameters, one for each instance variable
			parameter names need to be unique
				name -> inputName
				WRONG X con(name, id, title, salary)
				DO it -> con(inputName, inputId, inputTitle, inputSalary)
			initialize the instance variables
     */

    public Employee( String inputName, int inputId, String inputTitle, double inputSalary){
        name = inputName;
        id = inputId;
        jobTitle = inputTitle;
        salary = inputSalary;
    }

    /*
		- method:
			goToMeeting()
				when this method is called print:
					$name is going to a meeting
			toString()
				print all the employees information
     */

    public void goToMeeting(){
        System.out.println(name + " is going to a meeting");
    }

    @Override
    public String toString() {
        return "Employee | " +
                "name: " + name  +
                ", id: " + id +
                ", jobTitle: " + jobTitle +
                ", salary: " + salary +
                '|';
    }
}