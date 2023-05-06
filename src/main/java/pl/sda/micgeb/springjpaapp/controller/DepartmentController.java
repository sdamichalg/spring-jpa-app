package pl.sda.micgeb.springjpaapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.micgeb.springjpaapp.model.dtos.DepartmentDto;
import pl.sda.micgeb.springjpaapp.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("/{id}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable Long id) {
        DepartmentDto departmentById = departmentService.getDepartmentById(id);

        return ResponseEntity.ok(departmentById);
    }

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getDepartmentByCity(@RequestParam String city) {
        List<DepartmentDto> departmentsByCity = departmentService.getDepartmentsByCity(city);

        return ResponseEntity.ok(departmentsByCity);
    }

    @GetMapping("/v1")
    public ResponseEntity<List<DepartmentDto>> getDepartmentByName(@RequestParam String name) {
        List<DepartmentDto> departmentsByName = departmentService.getDepartmentsByName(name);
        return ResponseEntity.ok(departmentsByName);
    }

    @PostMapping("/new")
    public ResponseEntity<Void> addNewDepartment(@RequestBody DepartmentDto dto) {
        departmentService.addDepartment(dto);

        return ResponseEntity.ok().build();
    }


}
