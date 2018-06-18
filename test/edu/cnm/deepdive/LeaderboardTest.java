package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeaderboardTest {

  static final int[][] LEADERBOARD = {
      {100, 100, 50, 40, 40, 20, 10},
      {100, 90, 80, 80, 80, 20},
      {105, 100, 100, 100, 100, 100, 90},
  };
  static final int[][] SCORES = {
      {5, 25, 50, 120},
      {10, 50, 80, 90},
      {90, 105, 105},
  };
  static final int[][] COMPETITION_RANKING_EXPECTED = {
      {8, 6, 3, 1},
      {7, 6, 3, 2},
      {7, 1, 1},
  };
  static final int[][] DENSE_RANKING_EXPECTED = {
      {6, 4, 2, 1},
      {5, 4, 3, 2},
      {3, 1, 1},
  };

  static Leaderboard leaderboard = new Leaderboard();

  @Test
  void getCompetitionRanking() {
    for (int i = 0; i < COMPETITION_RANKING_EXPECTED.length; i++) {
      assertArrayEquals(COMPETITION_RANKING_EXPECTED[i], leaderboard.getCompetitionRanking(LEADERBOARD[i], SCORES[i]));
    }
  }

  @Test
  void getDenseRanking() {
    for (int i = 0; i < DENSE_RANKING_EXPECTED.length; i++) {
      assertArrayEquals(DENSE_RANKING_EXPECTED[i], leaderboard.getDenseRanking(LEADERBOARD[i], SCORES[i]));
    }
  }
}