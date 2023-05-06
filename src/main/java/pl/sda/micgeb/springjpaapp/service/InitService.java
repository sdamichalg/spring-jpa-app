package pl.sda.micgeb.springjpaapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.micgeb.springjpaapp.entity.Department;
import pl.sda.micgeb.springjpaapp.entity.Employee;
import pl.sda.micgeb.springjpaapp.entity.EntryCard;
import pl.sda.micgeb.springjpaapp.entity.Supervisor;
import pl.sda.micgeb.springjpaapp.model.Address;
import pl.sda.micgeb.springjpaapp.model.EmployeeType;
import pl.sda.micgeb.springjpaapp.repository.DepartmentRepository;
import pl.sda.micgeb.springjpaapp.repository.EmployeeRepository;
import pl.sda.micgeb.springjpaapp.repository.EntryCardRepository;
import pl.sda.micgeb.springjpaapp.repository.SupervisorRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class InitService {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final EntryCardRepository entryCardRepository;
    private final SupervisorRepository supervisorRepository;

    public void createSimpleData() {
        Random random = new Random();

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

        EntryCard entryCard1 = new EntryCard();
        entryCard1.setUuid(random.nextInt(Integer.MAX_VALUE));
        entryCardRepository.save(entryCard1);

        EntryCard entryCard2 = new EntryCard();
        entryCard2.setUuid(random.nextInt(Integer.MAX_VALUE));
        entryCardRepository.save(entryCard2);

        EntryCard entryCard3 = new EntryCard();
        entryCard3.setUuid(random.nextInt(Integer.MAX_VALUE));
        entryCardRepository.save(entryCard3);

        EntryCard entryCard4 = new EntryCard();
        entryCard4.setUuid(random.nextInt(Integer.MAX_VALUE));
        entryCardRepository.save(entryCard4);

        EntryCard entryCard5 = new EntryCard();
        entryCard5.setUuid(random.nextInt(Integer.MAX_VALUE));
        entryCardRepository.save(entryCard5);

        EntryCard entryCard6 = new EntryCard();
        entryCard6.setUuid(random.nextInt(Integer.MAX_VALUE));
        entryCardRepository.save(entryCard6);

        EntryCard entryCard7 = new EntryCard();
        entryCard7.setUuid(random.nextInt(Integer.MAX_VALUE));
        entryCardRepository.save(entryCard7);

        EntryCard entryCard8 = new EntryCard();
        entryCard8.setUuid(random.nextInt(Integer.MAX_VALUE));
        entryCardRepository.save(entryCard8);

        Employee employee1 = new Employee();
        employee1.setFirstName("Tom");
        employee1.setLastName("Smith");
        employee1.setSalary(new BigDecimal("5000"));
        employee1.setContractEnd(LocalDate.of(2025, 12, 31));
        employee1.setEntryCard(entryCard1);
        employee1.setSupervisor(supervisor1);
        employee1.setDepartment(department1);
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Mary");
        employee2.setLastName("Johnson");
        employee2.setSalary(new BigDecimal("7500"));
        employee2.setDepartment(department1);
        employee2.setSupervisor(supervisor1);
        employee2.setContractEnd(LocalDate.of(2024, 6, 30));
        employee2.setEntryCard(entryCard2);
        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setFirstName("John");
        employee3.setLastName("Doe");
        employee3.setSalary(new BigDecimal("6500.00"));
        employee3.setDepartment(department2);
        employee3.setSupervisor(supervisor2);
        employee3.setContractEnd(LocalDate.of(2025, 1, 15));
        employee3.setEntryCard(entryCard3);
        employeeRepository.save(employee3);

        Employee employee4 = new Employee();
        employee4.setFirstName("Jane");
        employee4.setLastName("Smith");
        employee4.setSalary(new BigDecimal("7500.25"));
        employee4.setDepartment(department3);
        employee4.setSupervisor(supervisor3);
        employee4.setContractEnd(LocalDate.of(2023, 12, 31));
        employee4.setEntryCard(entryCard4);
        employeeRepository.save(employee4);

        Employee employee5 = new Employee();
        employee5.setFirstName("Robert");
        employee5.setLastName("Brown");
        employee5.setSalary(new BigDecimal("4500.75"));
        employee5.setDepartment(department4);
        employee5.setSupervisor(supervisor4);
        employee5.setContractEnd(LocalDate.of(2022, 11, 1));
        employee5.setEntryCard(entryCard5);
        employeeRepository.save(employee5);

        Employee employee6 = new Employee();
        employee6.setFirstName("Samantha");
        employee6.setLastName("Lee");
        employee6.setSalary(new BigDecimal("8000.00"));
        employee6.setDepartment(department5);
        employee6.setSupervisor(supervisor5);
        employee6.setContractEnd(LocalDate.of(2026, 7, 31));
        employee6.setEntryCard(entryCard6);
        employeeRepository.save(employee6);

        Employee employee7 = new Employee();
        employee7.setFirstName("Michael");
        employee7.setLastName("Wang");
        employee7.setSalary(new BigDecimal("6200.50"));
        employee7.setDepartment(department1);
        employee7.setSupervisor(supervisor1);
        employee7.setContractEnd(LocalDate.of(2024, 9, 30));
        employee7.setEntryCard(entryCard7);
        employeeRepository.save(employee7);

        Employee employee8 = new Employee();
        employee8.setFirstName("Emily");
        employee8.setLastName("Jones");
        employee8.setSalary(new BigDecimal("7100.25"));
        employee8.setDepartment(department3);
        employee8.setSupervisor(supervisor3);
        employee8.setContractEnd(LocalDate.of(2023, 6, 30));
        employee8.setEntryCard(entryCard8);
        employeeRepository.save(employee8);
    }

}
