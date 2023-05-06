package pl.sda.micgeb.springjpaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.micgeb.springjpaapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
