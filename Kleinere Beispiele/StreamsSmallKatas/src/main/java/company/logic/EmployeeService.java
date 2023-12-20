package company.logic;

import company.data.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    //Erstelle eine Map von Mitarbeiternachnamen zu ihren E-Mail-Adressen.
    public Map<String, String> getNameToEmailAddress(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.toMap(Employee::emailaddress, Employee::name));
    }

    //Zähle, wie viele Angestellte in einer Firma mehr als 5 Jahre Erfahrung haben.
    public long getNumberOfEmployeesWithMoreExpThan(List<Employee> employees, int years) {
        return employees.stream()
                .filter(employee -> employee.yearsOfExp() > years)
                .count();
    }
}
