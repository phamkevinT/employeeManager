package kevinpham.employeemanager.repo;

import kevinpham.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    // Extending JpaRepository gives us access to CRUD functions
    // and Spring takes care of Query Methods
    // CTRL + CLICK on JpaRepository to see available functions

    void deleteEmployeeById(Long id);

    Optional findEmployeeById(Long id);
}
