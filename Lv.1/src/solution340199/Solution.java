package solution340199;

public class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while (true) {
            if (billInWallet(wallet, bill)) {
                break;
            }
            answer++;
            bill = foldInHalf(bill);
        }
        return answer;
    }

    public int[] foldInHalf(int[] bill) {
        if (bill[0] >= bill[1]) {
            bill[0] = bill[0] / 2;
        } else {
            bill[1] = bill[1] / 2;
        }
        return bill;
    }

    public boolean billInWallet(int[] wallet, int[] bill) {
        if (wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
            return true;
        }
        if (wallet[0] >= bill[1] && wallet[1] >= bill[0]) {
            return true;
        }
        return false;
    }
}
