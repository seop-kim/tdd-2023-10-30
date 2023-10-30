# Day 9

## TDD

### Test 코드 예시
```java
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalcTest {
    @Test
    @DisplayName("Calc에 run 메서드는 int를 리턴한다.")
    void testRun() {
        Integer result = Calc.run("");
    }
}
```
### TDD 단계
- RED : 테스트 케이스 작성 및 수정
- GREEN : 모든 테스트 케이스가 통과하도록
- REFACTORING : 중복을 제거한다.


