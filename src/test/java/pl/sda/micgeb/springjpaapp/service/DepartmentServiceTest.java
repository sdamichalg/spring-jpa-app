package pl.sda.micgeb.springjpaapp.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.sda.micgeb.springjpaapp.model.dtos.DepartmentDto;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    DepartmentService departmentService;

    @Test
    void getDepartmentById() {
        //given
        //when
        DepartmentDto departmentById = departmentService.getDepartmentById(1L);
        //then
        assertEquals("IT", departmentById.getName());
        assertEquals("Poland", departmentById.getAddress().getCountry());
        assertEquals("Warsaw", departmentById.getAddress().getCity());
        assertEquals("Nowy Świat", departmentById.getAddress().getStreet());
        assertEquals("00-001", departmentById.getAddress().getZipCode());
    }
}