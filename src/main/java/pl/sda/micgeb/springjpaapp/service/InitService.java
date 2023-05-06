package pl.sda.micgeb.springjpaapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.micgeb.springjpaapp.entity.Department;
import pl.sda.micgeb.springjpaapp.model.Address;
import pl.sda.micgeb.springjpaapp.repository.DepartmentRepository;
import pl.sda.micgeb.springjpaapp.repository.EmployeeRepository;
import pl.sda.micgeb.springjpaapp.repository.EntryCardRepository;
import pl.sda.micgeb.springjpaapp.repository.SupervisorRepository;

@Service
@RequiredArgsConstructor
public class InitService {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final EntryCardRepository entryCardRepository;
    private final SupervisorRepository supervisorRepository;

    public void createSimpleData() {
        Department department1 = new Department();
        department1.setName("IT");
        department1.setAddress(new Address("Poland", "Warsaw", "Nowy Świat", "00-001"));
        departmentRepository.save(department1);

        Department department2 = new Department();
        department2.setName("Sales");
        department2.setAddress(new Address("Poland", "Krakow", "Rynek Główny", "31-042"));
        departmentRepository.save(department2);

        Department department3 = new Department();
        department3.setName("Marketing");
        department3.setAddress(new Address("Poland", "Wroclaw", "Rynek", "50-001"));
        departmentRepository.save(department3);

        Department department4 = new Department();
        department4.setName("Finance");
        department4.setAddress(new Address("Poland", "Gdansk", "Targ Węglowy", "80-827"));
        departmentRepository.save(department4);

        Department department5 = new Department();
        department5.setName("HR");
        department5.setAddress(new Address("Poland", "Poznan", "Stary Rynek", "61-772"));
        departmentRepository.save(department5);
    }

}
