package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@SpringBootTest
@AutoConfigureMockMvc
@PropertySource("classpath:application-dev.properties")
public class TestInDev {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetLevelWhenEqual0() throws Exception {
        mockMvc.perform(get("/level"))
                .andExpect(content().string("basic"));
    }
}
