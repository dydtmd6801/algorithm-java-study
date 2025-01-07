package solution340213;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    void SetSolution() {solution = new Solution();}

    @Test
    @DisplayName("현재 재생구간 10초 앞으로 이동")
    void moveNext10second() {
        int second = 125;
        int result = 135;

        assertThat(solution.next10Second(second)).isEqualTo(result);
    }

    @Test
    @DisplayName("현재 재생구간 10초 뒤로 이동")
    void movePrev10second() {
        int second = 43;
        int result = 33;

        assertThat(solution.prev10Second(second)).isEqualTo(result);
    }

    @Test
    @DisplayName("현재 재생구간을 영상 안으로 이동")
    void moveVideoLengthMax() {
        int videoLength = 453;
        int currentPosition = 448;
        int result = 453;

        assertThat(solution.moveVideoLength(videoLength, currentPosition)).isEqualTo(result);
    }

    @Test
    @DisplayName("현재 재생구간을 영상 안으로 이동")
    void moveVideoLengthMin() {
        int videoLength = 453;
        int currentPosition = 5;
        int result = 0;

        assertThat(solution.moveVideoLength(videoLength, currentPosition)).isEqualTo(result);
    }

    @Test
    @DisplayName("현재 재생구간을 오프닝 끝으로 이동")
    void moveOpeningEnd() {
        int opStart = 15;
        int opEnd = 132;
        int currentPosition = 127;
        int result = 132;

        assertThat(solution.moveOpeningEnd(opStart, opEnd, currentPosition)).isEqualTo(result);
    }

    @Test
    void case01() {
        String video_len = "34:33";
        String pos = "13:00";
        String op_start = "00:55";
        String op_end = "02:55";
        String[] commands = {"next", "prev"};
        String result = "13:00";

        assertThat(solution.solution(video_len, pos, op_start, op_end, commands)).isEqualTo(result);
    }

    @Test
    void case02() {
        String video_len = "10:55";
        String pos = "00:05";
        String op_start = "00:15";
        String op_end = "06:55";
        String[] commands = {"prev", "next", "next"};
        String result = "06:55";

        assertThat(solution.solution(video_len, pos, op_start, op_end, commands)).isEqualTo(result);
    }

    @Test
    void case03() {
        String video_len = "07:22";
        String pos = "04:05";
        String op_start = "00:15";
        String op_end = "04:07";
        String[] commands = {"next"};
        String result = "04:17";

        assertThat(solution.solution(video_len, pos, op_start, op_end, commands)).isEqualTo(result);
    }
}
