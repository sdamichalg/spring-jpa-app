package pl.sda.micgeb.springjpaapp.service;

import org.springframework.stereotype.Component;
import pl.sda.micgeb.springjpaapp.entity.Employee;
import pl.sda.micgeb.springjpaapp.model.dtos.EmployeeDto;

@Component
public class EmployeeMapper {

    public EmployeeDto toDto (Employee entity) {
        EmployeeDto dto = new EmployeeDto();
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setContractEnd(entity.getContractEnd());
        dto.setSalary(entity.getSalary());

        return dto;
    }
}
