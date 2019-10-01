package com.lukesmvc.controller;


import com.lukesmvc.config.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by lyaegel on 09/30/2019
 */

/**
 * NOTE: Integration Tests will only run if using 'mvn verify'.
 * Else the test will need to be renamed with "Test"
 * in the class name for it to run properly.
 * Also, this test will not work unless the MySQL database is running
 * and accessible.
 */


/**
 * THE BELOW ANNOATIONS are interchangeable with @SpringJUnitWebConfig
 */
//@ContextConfiguration(classes = AppConfig.class)
//@WebAppConfiguration("src/main/webapp")
//@ExtendWith({SpringExtension.class})

@SpringJUnitWebConfig(classes = AppConfig.class)
class HelloControllerIT {

   @Autowired
    WebApplicationContext wac;

   private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    void getHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hellotest").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(view().name("hello"))
        ;
    }

    @Test
    void getHello2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk())
                .andExpect(view().name("hello"))
        ;
    }
}
