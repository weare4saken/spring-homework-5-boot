package weare4saken.springboothomework.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import weare4saken.springboothomework.dao.EmployeeRepo;
import weare4saken.springboothomework.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {

       /* Employee employee = employeeRepo.getEmployeeById(id);

        if (employee == null) {
            throw new EmployeeException("Employee with id= " + id + "doesn't exist");
        }*/

        return employeeRepo.findById(id).get();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {

      /*  Employee employee = employeeRepo.getEmployeeById(id);

        if (employee == null) {
            throw new EmployeeException("Employee with id= " + id + "doesn't exist");
        }*/

        employeeRepo.deleteById(id);
    }

}
