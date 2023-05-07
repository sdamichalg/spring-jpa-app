package pl.sda.micgeb.springjpaapp.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

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

//    {
//        "name": "IT",
//            "address": {
//                 "country": "Poland",
//                "city": "Warsaw",
//                "street": "Nowy Świat",
//                "zipCode": "00-001"
//    }
//    }

    @Test
    void getDepartmentById() throws Exception {
        //given
        //when and //then
        mockMvc.perform(get("/department/1"))
                .andExpect(MockMvcResultMatchers.status().isOk()) //sprawdzony status http
                .andExpect(content().contentType(MediaType.APPLICATION_JSON)) //sprawdzony media type odpowiedzi
                .andExpect(jsonPath("$.name").value("IT")) //sprawdzamy response body (poszczególne wartości)
        ;
    }
}