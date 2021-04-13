package nextstep.laddergame.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LineGeneratorTest {

  @ParameterizedTest
  @CsvSource({"1, [true]",
              "2, '[true, false]'",
              "3, '[true, false, true]'",
              "4, '[true, false, true, false]'",
              "5, '[true, false, true, false, true]'"})
  @DisplayName("랜덤 값이 항상 true일 경우 여러개가 입력되면 제대로 결과대로 그려지는가")
  public void generateCountOfPerson1(int countOfPerson, String result) throws Exception {
    //given
    List<Boolean> line = LineGenerator.createLine(countOfPerson, () -> true);
    //when
    String s = line.toString();
    //then
    assertEquals(s, result);
  }
}