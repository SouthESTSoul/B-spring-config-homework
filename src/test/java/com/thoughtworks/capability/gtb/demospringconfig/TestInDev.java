package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("dev")
public class TestInDev {
    @Autowired
    private LevelController levelController;

    @Test
    public void testGetLevelWhenEqual0() throws Exception {
        Assertions.assertEquals("basic",levelController.getLevel());

    }
}
