package solution340213;

public class Solution {

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = Integer.parseInt(video_len.substring(0,2)) * 60 + Integer.parseInt(video_len.substring(3,5));
        int position = Integer.parseInt(pos.substring(0,2)) * 60 + Integer.parseInt(pos.substring(3,5));
        int opStart = Integer.parseInt(op_start.substring(0,2)) * 60 + Integer.parseInt(op_start.substring(3,5));
        int opEnd = Integer.parseInt(op_end.substring(0,2)) * 60 + Integer.parseInt(op_end.substring(3,5));

        for (String command:commands) {
            position = moveOpeningEnd(opStart, opEnd, position);
            if (command.equals("next")) {
                position = next10Second(position);
            } else {
                position = prev10Second(position);
            }
            position = moveVideoLength(videoLen, position);
            position = moveOpeningEnd(opStart, opEnd, position);
        }

        int hour = position / 60;
        int minute = position % 60;
        String answer = "";
        if (hour < 10) {
            answer = answer + "0" + hour;
        } else {
            answer = answer + hour;
        }

        if (minute < 10) {
            answer = answer + ":0" + minute;
        } else {
            answer = answer + ":" + minute;
        }

        return answer;
    }

    public int next10Second(int second) {
        second += 10;
        return second;
    }

    public int prev10Second(int second) {
        second -= 10;
        return second;
    }

    public int moveVideoLength(int videoLength, int currentPosition) {
        if (currentPosition < 0) {
            currentPosition = 0;
        } else if (currentPosition > videoLength) {
            currentPosition = videoLength;
        }
        return currentPosition;
    }

    public int moveOpeningEnd(int opStart, int opEnd, int currentPosition) {
        if (currentPosition >= opStart && currentPosition < opEnd) {
            currentPosition = opEnd;
        }
        return currentPosition;
    }
}
