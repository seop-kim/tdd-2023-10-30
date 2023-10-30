package org.example;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalcTest {

    @Test
    @DisplayName("() 를 찾는 방법")
    void find() {
        String str = "3 * 1 + (1 - (4 * 1 - (1 - 1)))";
        System.out.println("( : "+ str.indexOf("("));
        System.out.println(") : "+ str.lastIndexOf(")"));

        System.out.println(str.substring(str.indexOf("(")+1, str.lastIndexOf(")")));
    }

    @Test
    @DisplayName("()가 있는 계산식 재귀 호출을 통한 테스트")
    void test1() {
        int run = Calc.run("3 + (1 - (4 + 1 - (1 - 1)))");

        assertThat(run)
                .isEqualTo(-1);
    }

    @Test
    @DisplayName("Calc의 run 메서드는 int를 리턴한다.")
    void t1() {
        int run = Calc.run("10 + 1");
        assertThat(run)
                .isEqualTo(11);
    }

    @Test
    @DisplayName("10 + 10 = 20 이다.")
    void t2() {
        int run = Calc.run("10 + 10");
        assertThat(run)
                .isEqualTo(20);
    }

    @Test
    @DisplayName("10 + 20 = 30")
    void t3() {
        int run = Calc.run("10 + 20");
        assertThat(run)
                .isEqualTo(30);
    }

    @Test
    @DisplayName("10 / 10 = 1")
    void t4() {
        int run = Calc.run("10 / 10");
        assertThat(run)
                .isEqualTo(1);
    }

    @Test
    @DisplayName("10 + 40 = 50")
    void t5() {
        int run = Calc.run("10 + 40");
        assertThat(run)
                .isEqualTo(50);
    }
}