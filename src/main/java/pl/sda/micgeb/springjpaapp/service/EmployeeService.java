package pl.sda.micgeb.springjpaapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.micgeb.springjpaapp.entity.Employee;
import pl.sda.micgeb.springjpaapp.model.dtos.EmployeeDto;
import pl.sda.micgeb.springjpaapp.repository.EmployeeRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public List<EmployeeDto> getEmployeesBySalary(BigDecimal min, BigDecimal max) {
        List<Employee> employees = employeeRepository.findEmployeeBySalaryBetween(min, max);
        List<EmployeeDto> dtos = employees.stream()
                .map(empl -> employeeMapper.toDto(empl))
                .collect(Collectors.toList());

        return dtos;
    }
}
