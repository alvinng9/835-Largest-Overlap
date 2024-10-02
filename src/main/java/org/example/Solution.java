package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int row = img1.length, col = img2.length;
        List<int[]> listOne = new ArrayList<>();
        List<int[]> listTwo = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (img1[i][j] == 1) listOne.add(new int[]{i, j});
                if (img2[i][j] == 1) listTwo.add(new int[]{i, j});
            }
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (int[] one : listOne) {
            for (int[] two : listTwo) {
                map.put((one[0] - two[0]) + " " + (one[1] - two[1]) ,
                        map.getOrDefault((one[0] - two[0]) + " " + (one[1] - two[1]), 0) + 1);
            }
        }
        int result = 0;
        for (int count : map.values()) {
            result = Math.max(result, count);
        }
        return result;
    }
}
