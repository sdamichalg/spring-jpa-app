package pl.sda.micgeb.springjpaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.micgeb.springjpaapp.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
