package solution340199;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


public class SolutionTest {

    Solution solution;

    @BeforeEach
    void setSolution() {
        solution = new Solution();
    }

    @Test
    @DisplayName("긴 쪽을 반틈 접는 기능")
    void foldInHalf() {
        int[] bill = {150,234};
        int[] result = {150, 117};

        assertThat(solution.foldInHalf(bill)).isEqualTo(result);
    }

    @Test
    @DisplayName("지폐가 지갑에 들어가는지 판단 기능")
    void checkBillInWallet() {
        int[] wallet = {32, 45};
        int[] bill = {43, 31};

        assertThat(solution.billInWallet(wallet, bill)).isTrue();
    }

    @Test
    void exam() {
        int[][] wallet = {{30, 15}, {50, 50}};
        int[][] bill = {{26, 17}, {100, 241}};
        int[] result = {1, 4};

        assertAll(
                () -> assertThat(solution.solution(wallet[0], bill[0])).isEqualTo(result[0]),
                () -> assertThat(solution.solution(wallet[1], bill[1])).isEqualTo(result[1])
        );
    }
}
