package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
@SpringBootTest
@ActiveProfiles("pro")
public class TestInQa {
    @Autowired
    private LevelController levelController;

    @Test
    public void testGetLevelWhenEqual2() throws Exception {
        Assertions.assertEquals("advanced", levelController.getLevel());

    }
}