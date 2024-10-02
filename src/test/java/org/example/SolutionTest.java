package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void largestOverlapTest() {
        Solution solution = new Solution();
        int[][] img1One = new int[][] {
                {1,1,0},
                {0,1,0},
                {0,1,0}
        };
        int[][] img1Two = new int[][] {
                {0,0,0},
                {0,1,1},
                {0,0,1}
        };
        assertEquals(3, solution.largestOverlap(img1One, img1Two));
        int[][] img2One = new int[][] {
                {1}
        };
        int[][] img2Two = new int[][] {
                {1}
        };
        assertEquals(1, solution.largestOverlap(img2One, img2Two));
        int[][] img3One = new int[][] {
                {0}
        };
        int[][] img3Two = new int[][] {
                {0}
        };
        assertEquals(0, solution.largestOverlap(img3One, img3Two));
    }
}