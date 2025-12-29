import com.sdetqa.app.EmployeeDetails;

import java.util.*;

public class EmployeeDetailsTest {


    public static void main(String[] args) {


        EmployeeDetails employeeDetails = new EmployeeDetails("jon","doe","jondoe@email.com");



        List<EmployeeDetails> employeeDetailsList = new ArrayList<>();


        TreeSet<EmployeeDetails> treeSetEmployeeDetails =
                new TreeSet<>(
                        Comparator.comparing(EmployeeDetails::getFirstName)
                                .thenComparing(EmployeeDetails::getLastName)
                                .thenComparing(EmployeeDetails::getEmail)
                );

        LinkedHashSet<EmployeeDetails> linkedHashSet = new LinkedHashSet<>(employeeDetailsList);

        employeeDetailsList.add(employeeDetails);
        employeeDetailsList.add(new EmployeeDetails("Ashish","Jaiswal","ashjai@email.com"));
        employeeDetailsList.add(new EmployeeDetails("Aneesh","Gajare","anegaj@email.com"));
        employeeDetailsList.add(new EmployeeDetails("Raxit","Patel","raxpat@email.com"));


        employeeDetailsList.stream().forEach( emp->System.out.println(emp.getFirstName()+" "+emp.getLastName()+" "+emp.getEmail()));

        treeSetEmployeeDetails.addAll(employeeDetailsList);


        System.out.println("///TreeSet");

        treeSetEmployeeDetails.parallelStream().forEach(emp->System.out.println(emp.getFirstName()+" "+emp.getLastName()+" "+emp.getEmail()));

        System.out.println("///LinkedHashSet");
        linkedHashSet.forEach(emp->System.out.println(emp.getFirstName()+" "+emp.getLastName()+" "+emp.getEmail()));


    }
}
