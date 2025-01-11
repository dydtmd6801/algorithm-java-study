package solution250137;

public class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        return 0;
    }

    public int checkLastAttackTime(int[][] attacks) {
        return attacks[attacks.length - 1][0];
    }

    public int attack(int health, int damage) {
        return health - damage;
    }

    public int bandage(int health, int bandage) {
        return health + bandage;
    }

    public boolean isDie(int health) {
        return false;
    }
}
