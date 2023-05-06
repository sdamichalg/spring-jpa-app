package pl.sda.micgeb.springjpaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.micgeb.springjpaapp.entity.Department;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findAllByAddress_City(String city);
}
