package pl.sda.micgeb.springjpaapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.micgeb.springjpaapp.model.dtos.EmployeeDto;
import pl.sda.micgeb.springjpaapp.service.EmployeeService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/salary")
    public ResponseEntity<List<EmployeeDto>> getEmployees(@RequestParam BigDecimal max, @RequestParam BigDecimal min) {
        List<EmployeeDto> employeesBySalary = employeeService.getEmployeesBySalary(min, max);
        return ResponseEntity.ok(employeesBySalary);
    }
}
