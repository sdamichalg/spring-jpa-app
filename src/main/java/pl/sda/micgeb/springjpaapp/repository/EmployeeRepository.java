package pl.sda.micgeb.springjpaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.micgeb.springjpaapp.entity.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findEmployeeBySalaryBetween(BigDecimal min, BigDecimal max);
}
