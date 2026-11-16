package org.delcom.ifs25008springbootcashflow;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;

class AppMainTest {

    @Test
    void mainMemanggilSpringApplicationRun() throws Exception {
        try (MockedStatic<SpringApplication> spring = mockStatic(SpringApplication.class)) {
            App.main(new String[0]);

            spring.verify(() -> SpringApplication.run(eq(App.class), any(String[].class)), times(1));
        }
    }
}