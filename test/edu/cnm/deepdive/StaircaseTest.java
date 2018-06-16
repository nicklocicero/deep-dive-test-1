package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaircaseTest {

  static final int[] HEIGHTS = {2, 5};
  static final String[][] LINEAR_STAIRS_EXPECTED = {
      new String[] {
          " *",
          "**"
      },
      new String[] {
          "    *",
          "   **",
          "  ***",
          " ****",
          "*****"
      }
  };
  static final String[][] FIBONACCI_STAIRS_EXPECTED = {
      new String[] {
          "*",
          "*"
      },
      new String[] {
          "    *",
          "    *",
          "   **",
          "  ***",
          "*****"
      }
  };

  static Staircase staircase = new Staircase();

  @Test
  void buildLinearStaircase() {
    for (int i = 0; i < HEIGHTS.length; i++) {
      assertArrayEquals(LINEAR_STAIRS_EXPECTED[i], staircase.buildLinearStaircase(HEIGHTS[i]));
    }
  }

  @Test
  void buildFibonacciStaircase() {
    for (int i = 0; i < HEIGHTS.length; i++) {
      assertArrayEquals(FIBONACCI_STAIRS_EXPECTED[i], staircase.buildFibonacciStaircase(HEIGHTS[i]));
    }
  }
}