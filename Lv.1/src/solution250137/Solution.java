package solution250137;

public class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int attackCount = 0;
        int bandageCount = 0;
        int maxHealth = health;
        int lastAttackTime = checkLastAttackTime(attacks);
        for (int time = 1; time <= lastAttackTime; time++) {
            if (attacks[attackCount][0] == time) {
                health = attack(health, attacks[attackCount][1]);
                if (isDie(health)) {
                    return -1;
                }
                attackCount++;
                bandageCount = 0;
            } else {
                health = bandage(health, bandage[1]);
                bandageCount++;
                if (bandageCount == bandage[0]) {
                    health = bandage(health, bandage[2]);
                    bandageCount = 0;
                }
                if (health > maxHealth) {
                    health = maxHealth;
                }
            }
        }
        return health;
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
        if (health <= 0) {
            return true;
        }
        return false;
    }
}
