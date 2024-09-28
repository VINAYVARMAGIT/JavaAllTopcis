package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Employee{
     String name;
     double salary;
     int age;

    public Employee(String name, double salary,int age){
        this.name = name;
        this.salary=salary;
        this.age=age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}
public class FilterMethod {
   public static void main(String[] args) {
    
    List<Employee> list = Arrays.asList(
        new Employee("vinay", 20000, 20),
        new Employee("varma", 40000, 23),
        new Employee("vin", 80000, 22),
        new Employee("vinayvarma", 200000, 26)
    );

      List <Employee> l = list.stream().filter(e-> e.salary>50000).filter(e->e.age>25).collect(Collectors.toList());

    for(Employee employee : l) {
        System.out.println(employee);
    }
      
   }
}

class CountingDivisbleNums{
    public static void main (String args[]){
        List<Integer> l = List.of(5,8,9,4,5,7,10,15);

        long count = l.stream().filter(i->i%3==0 ||i%5==0).count();

        System.out.println(count);
    }
}
