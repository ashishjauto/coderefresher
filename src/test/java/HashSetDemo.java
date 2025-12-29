import com.sdetqa.app.EmployeeDetails;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {


    public static void main(String[] args) {
        HashSet<EmployeeDetails> hashSet = new HashSet<EmployeeDetails>();
        hashSet.add(new EmployeeDetails("ashish","jaiswal","aj@email.com"));
        hashSet.add(new EmployeeDetails("ashish","jaiswal","aj@email.com"));
        hashSet.add(new EmployeeDetails("ashish","jaiswal","aj@email.com"));


        hashSet.stream().forEach(emp-> System.out.println(emp.getFirstName()));


        LinkedHashSet set = new LinkedHashSet();

        set.add("add");
        set.add(100);

        set.forEach(set1-> System.out.println(set1));




    }
}
