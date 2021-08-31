package kevinpham.employeemanager.service;

import kevinpham.employeemanager.exception.UserNotFoundException;
import kevinpham.employeemanager.model.Employee;
import kevinpham.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public Employee addEmployee(Employee employee) {
        // Create random employee code
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }


    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }


    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }


    public Employee findEmployeeByIf(Long id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }


    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }
}
