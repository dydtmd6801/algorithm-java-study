package solution250137;

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
    @DisplayName("마지막 공격이 언제인지 확인하는 기능")
    void checkLastAttackTime() {
        int[][] attacks = {{2, 5},{4, 10},{5, 8},{9, 4}};
        int result = 9;

        assertThat(solution.checkLastAttackTime(attacks)).isEqualTo(result);
    }

    @Test
    @DisplayName("피해량만큼 체력 차감하는 기능")
    void attack() {
        int health = 23;
        int damage = 10;
        int result = 13;

        assertThat(solution.attack(health, damage)).isEqualTo(result);
    }

    @Test
    @DisplayName("회복량만큼 체력 회복하는 기능")
    void bandage() {
        int health = 6;
        int bandage = 5;
        int result = 11;

        assertThat(solution.bandage(health, bandage)).isEqualTo(result);
    }

    @Test
    @DisplayName("체력이 0인지 확인하는 기능")
    void isDie() {
        int health = -3;

        assertThat(solution.isDie(health)).isTrue();
    }

    @Test
    @DisplayName("프로그래머스에서 제공하는 테스트 케이스")
    void test() {
        int[][] bandage = {{5,1,5},{3,2,7},{4,2,7},{1,1,1}};
        int[] health = {30, 20, 20, 5};
        int[][][] attacks = {
                {{2,10},{9,15},{10,5},{11,5}},
                {{1,15},{5,16},{8,6}},
                {{1,15},{5,16},{8,6}},
                {{1,2},{3,2}}};
        int[] result = {5, -1, -1, 3};

        assertAll(
                () -> assertThat(solution.solution(bandage[0], health[0], attacks[0])).isEqualTo(result[0]),
                () -> assertThat(solution.solution(bandage[1], health[1], attacks[1])).isEqualTo(result[1]),
                () -> assertThat(solution.solution(bandage[2], health[2], attacks[2])).isEqualTo(result[2]),
                () -> assertThat(solution.solution(bandage[3], health[3], attacks[3])).isEqualTo(result[3])
        );
    }

}
