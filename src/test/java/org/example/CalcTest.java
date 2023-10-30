package org.example;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalcTest {


    @Test
    @DisplayName("Calc의 run 메서드는 int를 리턴한다.")
    void t1() {
        int run = Calc.run("");
    }

    @Test
    @DisplayName("10 + 10 = 20 이다.")
    void t2() {
        int run = Calc.run("10 + 10");
        assertThat(run)
                .isEqualTo(20);
    }
}