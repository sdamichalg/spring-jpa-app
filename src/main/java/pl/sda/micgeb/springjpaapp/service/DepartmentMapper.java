package pl.sda.micgeb.springjpaapp.service;

import org.springframework.stereotype.Component;
import pl.sda.micgeb.springjpaapp.entity.Department;
import pl.sda.micgeb.springjpaapp.model.dtos.DepartmentDto;

@Component
public class DepartmentMapper {

    public DepartmentDto toDto(Department entity) {
        DepartmentDto dto = new DepartmentDto();
        dto.setName(entity.getName());
        dto.setAddress(entity.getAddress());

        return dto;
    }

    public Department toEntity(DepartmentDto dto) {
        Department entity = new Department();
        entity.setName(dto.getName());
        entity.setAddress(dto.getAddress());

        return entity;
    }
}
