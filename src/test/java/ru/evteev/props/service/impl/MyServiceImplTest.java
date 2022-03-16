package ru.evteev.props.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.evteev.props.service.MyService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles({
//        "TEST",
        "INTERNAL",
        "DEV",
        "EXTERNAL_DEV",
        "TEST"
})
class MyServiceImplTest {

    @Autowired
    private MyService myService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void lodProps() {
        myService.lodProps();
    }
}
