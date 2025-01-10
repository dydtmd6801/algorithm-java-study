package solution340198;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int solution(int[] mats, String[][] park) {
        Integer[] arr3 = Arrays.stream(mats).boxed().toArray(Integer[]::new);
        Arrays.sort(arr3, Collections.reverseOrder());
        for (int mat : arr3) {
            for (int i = 0; i < park.length - mat + 1; i++) {
                for (int j = 0; j < park[0].length - mat + 1; j++) {
                    if (searchMats(park, i, j, mat)) {
                        return mat;
                    }
                }
            }
        }
        return -1;
    }

    public boolean searchMats(String[][] park ,int x, int y, int mat) {
        for (int i = 0; i < mat; i++) {
            for (int j = 0; j < mat; j++) {
                if (!park[x+i][y+j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}