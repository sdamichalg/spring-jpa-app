package pl.sda.micgeb.springjpaapp.model.dtos;

import lombok.Data;
import pl.sda.micgeb.springjpaapp.model.Address;

@Data
public class DepartmentDto {
    private String name;
    private Address address;
}
