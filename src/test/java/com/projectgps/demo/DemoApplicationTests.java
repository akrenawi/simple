package com.projectgps.demo;

import com.projectgps.demo.controllers.A;
import com.projectgps.demo.gpsdata.RepositoryAdd;
import org.json.JSONException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class DemoApplicationTests {

    public RepositoryAdd repositoryAdd;

    @BeforeEach
    public void setUp() throws IOException, JSONException {
        repositoryAdd = new RepositoryAdd(12,4);
    }


    @Test
    public void testNumber() {
        int num1 = repositoryAdd.getNum1();
        int num2 = repositoryAdd.getNum2();

        Assertions.assertEquals(repositoryAdd.methodAdd(), num1 + num2);
    }
}
