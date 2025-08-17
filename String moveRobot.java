import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode {
    public String moveRobot(int input1, int input2, String input3, String input4) {
        int gridX = input1;
        int gridY = input2;

        String[] parts = input3.split("-");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        String direction = parts[2];

        String[] directions = {"N", "E", "S", "W"};
        int dirIndex = 0;
        for (int i = 0; i < directions.length; i++) {
            if (directions[i].equals(direction)) {
                dirIndex = i;
                break;
            }
        }

        boolean errorOccurred = false;

        for (char instruction : input4.toCharArray()) {
            if (instruction == 'R') {
                dirIndex = (dirIndex + 1) % 4;
            } else if (instruction == 'L') {
                dirIndex = (dirIndex - 1 + 4) % 4;
            } else if (instruction == 'M') {
                int nextX = x;
                int nextY = y;

                if (dirIndex == 0) { // N
                    nextY++;
                } else if (dirIndex == 1) { // E
                    nextX++;
                } else if (dirIndex == 2) { // S
                    nextY--;
                } else if (dirIndex == 3) { // W
                    nextX--;
                }

                
                if (nextX >= 0 && nextX <= gridX && nextY >= 0 && nextY <= gridY) {
                    x = nextX;
                    y = nextY;
                } else {
                    errorOccurred = true;
                    break;
                }
            }
        }

        String finalDirection = directions[dirIndex];
        String result = x + "-" + y + "-" + finalDirection;
        if (errorOccurred) {
            result += "-ER";
        }

        return result;
    }
}