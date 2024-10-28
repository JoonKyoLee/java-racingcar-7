package racingcar.domain;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import racingcar.Application;

public class GameBoardTest extends NsTest {
    private final GameBoard gameBoard = GameBoard.from("우테코,프리코스,화이팅");

    @Test
    void 자동차_경주_결과판이_제대로_만들어지는지_확인하는_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    String output = gameBoard.makeCarPositions();
                    assertThat(output).isEqualTo("우테코 : -\n프리코스 : -\n화이팅 : ");
                },
                4, 4, 0
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}