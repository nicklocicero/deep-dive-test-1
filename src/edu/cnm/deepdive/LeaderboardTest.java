package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeaderboardTest {

  static final int[] LEADERBOARD = {100, 100, 50, 40, 40, 20, 10};
  static final int[] SCORES = {5, 25, 50, 120};

  static Leaderboard leaderboard = new Leaderboard();

  @Test
  void getCompetitionRanking() {
    assertArrayEquals(new int[] {8, 6, 3, 1}, leaderboard.getCompetitionRanking(LEADERBOARD, SCORES));
  }

  @Test
  void getDenseRanking() {
    assertArrayEquals(new int[] {6, 4, 2, 1}, leaderboard.getDenseRanking(LEADERBOARD, SCORES));
  }
}