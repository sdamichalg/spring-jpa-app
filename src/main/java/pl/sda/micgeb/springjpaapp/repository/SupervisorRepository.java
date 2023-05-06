package pl.sda.micgeb.springjpaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.micgeb.springjpaapp.entity.Supervisor;

public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {
}
