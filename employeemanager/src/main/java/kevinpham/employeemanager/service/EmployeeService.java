package kevinpham.employeemanager.service;

import kevinpham.employeemanager.model.Employee;
import kevinpham.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    /**
     * Save an employee to database
     * @param employee
     * @return
     */
    public Employee addEmployee(Employee employee) {
        // Create random employee code
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
}
