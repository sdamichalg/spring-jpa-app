package pl.sda.micgeb.springjpaapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.micgeb.springjpaapp.entity.Department;
import pl.sda.micgeb.springjpaapp.model.dtos.DepartmentDto;
import pl.sda.micgeb.springjpaapp.repository.DepartmentRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    public DepartmentDto getDepartmentById(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        if (department.isPresent()) {
            return departmentMapper.toDto(department.get());
        }
        return new DepartmentDto();
    }

    public List<DepartmentDto> getDepartmentsByCity(String city) {
        List<Department> allByAddressCity = departmentRepository.findAllByAddress_City(city);

        List<DepartmentDto> departmentDtos = allByAddressCity.stream()
                .map(dep -> departmentMapper.toDto(dep))
                .collect(Collectors.toList());

        return departmentDtos;
    }
}
