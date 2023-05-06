package pl.sda.micgeb.springjpaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.sda.micgeb.springjpaapp.entity.Department;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findAllByAddress_City(String city);
    @Query(value = "SELECT d from Department d WHERE d.name = :name")
    List<Department> findAllByName(@Param("name") String name);
}
