package pl.sda.micgeb.springjpaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.micgeb.springjpaapp.entity.EntryCard;

public interface EntryCardRepository extends JpaRepository<EntryCard, Long> {
}
