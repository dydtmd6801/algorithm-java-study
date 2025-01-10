package solution340198;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    void setSolution() {
        solution = new Solution();
    }

    @Test
    void test() {
        int[] mats = {5, 3, 2};
        String[][] park = {{"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};
        int result = 3;

        assertThat(solution.solution(mats, park)).isEqualTo(result);
    }

    @Test
    @DisplayName("매트가 park에 들어가는지 체크하는 기능")
    void checkMatInParkTrue() {
        String[][] park = {
                {"A", "A", "-1", "B","-1"},
                {"A", "A", "-1", "B","-1"},
                {"-1", "-1", "-1", "B","-1"},
                {"-1", "-1", "-1", "-1","-1"},
                {"-1", "-1", "-1", "C","C"}};
        int x = 2;
        int y = 0;
        int mat = 3;

        assertThat(solution.searchMats(park, x, y, mat)).isTrue();
    }

    @Test
    @DisplayName("매트가 park에 들어가는지 체크하는 기능")
    void checkMatInParkFalse() {
        String[][] park = {
                {"A", "A", "-1", "B","-1"},
                {"A", "A", "-1", "B","-1"},
                {"-1", "-1", "-1", "B","-1"},
                {"-1", "-1", "-1", "-1","-1"},
                {"-1", "-1", "-1", "C","C"}};
        int x = 2;
        int y = 1;
        int mat = 3;

        assertThat(solution.searchMats(park, x, y, mat)).isFalse();
    }
}
