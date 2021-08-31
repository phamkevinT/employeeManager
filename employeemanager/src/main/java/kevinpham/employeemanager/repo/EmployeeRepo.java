package kevinpham.employeemanager.repo;

import kevinpham.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    // Extending JpaRepository gives us access to CRUD functions
    // CTRL + CLICK on JpaRepository to see available functions
}
