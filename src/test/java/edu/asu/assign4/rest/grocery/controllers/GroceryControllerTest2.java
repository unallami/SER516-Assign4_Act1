package edu.asu.assign4.rest.grocery.controllers;

import edu.asu.assign4.rest.grocery.services.GroceryServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@AutoConfigureMockMvc
@SpringBootTest
public class GroceryControllerTest2 {

    @Autowired
    MockMvc mvc;

    @MockBean
    GroceryServices groceryServices;

    @Test
    void getGroceryItemByIdTest() throws Exception {
        mvc.perform(get("/api/groceries/MLK"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'item':'milk'}"))
                .andExpect(content().json("{'id':'MLK'}"));
    }

    // @Test
    // void getGroceryItemByIdExceptionTest() throws Exception {
    //     mvc.perform(get("/api/groceries/MLK1")).andExpect(status().is5xxServerError());
    // }
}
