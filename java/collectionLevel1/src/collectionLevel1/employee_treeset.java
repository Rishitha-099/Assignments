package collectionLevel1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class employee{
	int id,salary;
	String name,dept;
	public employee(int id, String name, String dept, int salary) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getSalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public String getname() {
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getDept() {
		return dept;
	}
	public void setdept(String dept) {
		this.dept=dept;
	}
	public String toString() {
		return "employee [id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
	}
}
class idcomparator implements Comparator<employee>{
	public int compare(employee x, employee y) {
		return x.getid()-y.getid();
	}
}
class Namecomparator implements Comparator<employee>{
	public int compare(employee x, employee y) {
		return x.getname().compareTo(y.getname());
	}
}
class Deptcomparator implements Comparator<employee>{
	public int compare(employee x, employee y) {
		return x.getDept().compareTo(y.getDept());
	}
}
class Salarycomparator implements Comparator<employee>{
	public int compare(employee x, employee y) {
		return x.getSalary()-y.getSalary();
	}
}


public class employee_treeset {
        public static void main(String[] args) {
        	System.out.println("Select an Option");
        	System.out.println("a) Id\nb)Name\nc) Department\nd) Salary");
        	Scanner sr=new Scanner(System.in);
        	String select=sr.nextLine();
        	if(select.equals("a"))
        	{
        		TreeSet<employee> e=new TreeSet<>(new idcomparator());
        		e.add(new employee(1,"Rishitha","CSE",55000));
        		e.add(new employee(2,"Siri","ECE",45000));
        		e.add(new employee(3,"Hasini","CSE",50000));
        		e.add(new employee(4,"Varshitha","ECE",45000));
        		e.add(new employee(5,"Anand","MECH",65000));
        		e.add(new employee(6,"Abhi","MECH",62000));
        		e.add(new employee(7,"Ravi","CIVIL",70000));
        		e.add(new employee(8,"Srikanth","EEE",60000));
        		e.add(new employee(9,"Sumanth","CSE",56000));
        		e.add(new employee(10,"Harsha","EEE",63000));
        		for(employee emp : e) {
        			System.out.println(emp.toString());
        		}
        	}
        	else if(select.equals("b")) {
        		TreeSet<employee> e=new TreeSet<>(new Namecomparator());
           		e.add(new employee(1,"Rishitha","CSE",55000));
        		e.add(new employee(2,"Siri","ECE",45000));
        		e.add(new employee(3,"Hasini","CSE",50000));
        		e.add(new employee(4,"Varshitha","ECE",45000));
        		e.add(new employee(5,"Anand","MECH",65000));
        		e.add(new employee(6,"Abhi","MECH",62000));
        		e.add(new employee(7,"Ravi","CIVIL",70000));
        		e.add(new employee(8,"Srikanth","EEE",60000));
        		e.add(new employee(9,"Sumanth","CSE",56000));
        		e.add(new employee(10,"Harsha","EEE",63000));
        		for(employee emp : e) {
        			System.out.println(emp.toString());
        		}
        	}
        	else if(select.equals("c")) {
        		TreeSet<employee> e=new TreeSet<>(new Deptcomparator());
           		e.add(new employee(1,"Rishitha","CSE",55000));
        		e.add(new employee(2,"Siri","ECE",45000));
        		e.add(new employee(3,"Hasini","CSE",50000));
        		e.add(new employee(4,"Varshitha","ECE",45000));
        		e.add(new employee(5,"Anand","MECH",65000));
        		e.add(new employee(6,"Abhi","MECH",62000));
        		e.add(new employee(7,"Ravi","CIVIL",70000));
        		e.add(new employee(8,"Srikanth","EEE",60000));
        		e.add(new employee(9,"Sumanth","CSE",56000));
        		e.add(new employee(10,"Harsha","EEE",63000));
        		for(employee emp : e) {
        			System.out.println(emp.toString());
        		}
        	}
        	else if(select.equals("d")) {
        		TreeSet<employee> e=new TreeSet<>(new Deptcomparator());
           		e.add(new employee(1,"Rishitha","CSE",55000));
        		e.add(new employee(2,"Siri","ECE",45000));
        		e.add(new employee(3,"Hasini","CSE",50000));
        		e.add(new employee(4,"Varshitha","ECE",45000));
        		e.add(new employee(5,"Anand","MECH",65000));
        		e.add(new employee(6,"Abhi","MECH",62000));
        		e.add(new employee(7,"Ravi","CIVIL",70000));
        		e.add(new employee(8,"Srikanth","EEE",60000));
        		e.add(new employee(9,"Sumanth","CSE",56000));
        		e.add(new employee(10,"Harsha","EEE",63000));
        		for(employee emp : e) {
        			System.out.println(emp.toString());
        		}
        	}
	}

}
