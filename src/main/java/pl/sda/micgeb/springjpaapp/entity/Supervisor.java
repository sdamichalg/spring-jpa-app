package pl.sda.micgeb.springjpaapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.sda.micgeb.springjpaapp.model.EmployeeType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Supervisor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private EmployeeType employeeType;
    @OneToMany(mappedBy = "supervisor")
    private Set<Employee> employees;
}
