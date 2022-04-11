package generics;
import java.util.Set;
import java.util.HashSet;
class employees{
	int id,salary;
	String name,dept;
	public employees(int id,String name,int salary, String dept) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	public String toString() {
		return "employees[id=" +id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
		
	}
}

public class employee {

	public static void main(String[] args) {
		employees a=new employees(1,"rishitha",50000,"Finance");
		employees b=new employees(2,"siri",55000,"IT");
		employees c=new employees(3,"hasini",35000,"Sales");
        Set<employees> emp=new HashSet<>();
        emp.add(a);
        emp.add(b);
        emp.add(c);
        for(employees emp2 : emp) {
        	   System.out.println(emp2);
        }
      
	}

}
