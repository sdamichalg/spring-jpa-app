package pl.sda.micgeb.springjpaapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import pl.sda.micgeb.springjpaapp.model.Address;
import pl.sda.micgeb.springjpaapp.model.dtos.DepartmentDto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@WebAppConfiguration
class DepartmentControllerTest {

    @Autowired
    WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    void getDepartmentById() throws Exception {
        //given
        //when and //then
        mockMvc.perform(get("/department/1"))
                .andExpect(MockMvcResultMatchers.status().isOk()) //sprawdzony status http
                .andExpect(content().contentType(MediaType.APPLICATION_JSON)) //sprawdzony media type odpowiedzi
                .andExpect(jsonPath("$.name").value("IT")) //sprawdzamy response body (poszczególne wartości)
                .andExpect(jsonPath("$.address.country").value("Poland"))
                .andExpect(jsonPath("$.address.city").value("Warsaw"))
                .andExpect(jsonPath("$.address.street").value("Nowy Świat"))
                .andExpect(jsonPath("$.address.zipCode").value("00-001"))
        ;
    }

    @Test
    void getDepartmentsByCity() throws Exception {

        mockMvc.perform(get("/department/v1?name=Sales"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$", Matchers.hasSize(1)))
                .andExpect(jsonPath("$[0].name").value("Sales"))
                .andExpect(jsonPath("$[0].address.country").value("Poland"))
                .andExpect(jsonPath("$[0].address.city").value("Krakow"))
                .andExpect(jsonPath("$[0].address.street").value("Rynek Główny"))
                .andExpect(jsonPath("$[0].address.zipCode").value("31-042"))

        ;
    }

    @Test
    void addNewDepartment() throws Exception {
        //given
        DepartmentDto dto = new DepartmentDto();
        dto.setName("new_department");
        dto.setAddress(new Address());

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(dto);//zamieniamy obiekt na json

        //when         //then
        mockMvc.perform(MockMvcRequestBuilders.post("/department/new")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}