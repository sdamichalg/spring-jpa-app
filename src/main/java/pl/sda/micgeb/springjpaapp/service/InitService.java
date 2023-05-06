package pl.sda.micgeb.springjpaapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.micgeb.springjpaapp.entity.Department;
import pl.sda.micgeb.springjpaapp.entity.Supervisor;
import pl.sda.micgeb.springjpaapp.model.Address;
import pl.sda.micgeb.springjpaapp.model.EmployeeType;
import pl.sda.micgeb.springjpaapp.repository.DepartmentRepository;
import pl.sda.micgeb.springjpaapp.repository.EmployeeRepository;
import pl.sda.micgeb.springjpaapp.repository.EntryCardRepository;
import pl.sda.micgeb.springjpaapp.repository.SupervisorRepository;

import java.math.BigDecimal;

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

        Supervisor supervisor1 = new Supervisor();
        supervisor1.setFirstName("John");
        supervisor1.setLastName("Doe");
        supervisor1.setSalary(new BigDecimal("10000"));
        supervisor1.setEmployeeType(EmployeeType.CONTRACTOR);
        supervisorRepository.save(supervisor1);

        Supervisor supervisor2 = new Supervisor();
        supervisor2.setFirstName("Jane");
        supervisor2.setLastName("Doe");
        supervisor2.setSalary(new BigDecimal("12000"));
        supervisor2.setEmployeeType(EmployeeType.FULL_TIME);
        supervisorRepository.save(supervisor2);

        Supervisor supervisor3 = new Supervisor();
        supervisor3.setFirstName("Mark");
        supervisor3.setLastName("Smith");
        supervisor3.setSalary(new BigDecimal("15000"));
        supervisor3.setEmployeeType(EmployeeType.FULL_TIME);
        supervisorRepository.save(supervisor3);

        Supervisor supervisor4 = new Supervisor();
        supervisor4.setFirstName("Anna");
        supervisor4.setLastName("Jones");
        supervisor4.setSalary(new BigDecimal("11000"));
        supervisor4.setEmployeeType(EmployeeType.CONTRACTOR);
        supervisorRepository.save(supervisor4);

        Supervisor supervisor5 = new Supervisor();
        supervisor5.setFirstName("Peter");
        supervisor5.setLastName("Wilson");
        supervisor5.setSalary(new BigDecimal("14000"));
        supervisor5.setEmployeeType(EmployeeType.CONTRACTOR);
        supervisorRepository.save(supervisor5);
    }

}
