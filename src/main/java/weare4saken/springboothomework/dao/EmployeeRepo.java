package weare4saken.springboothomework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import weare4saken.springboothomework.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

   /* List<Employee> getEmployees();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);*/



}