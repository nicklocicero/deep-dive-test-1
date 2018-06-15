package edu.cnm.deepdive;

/**
 * The static methods of this class compute rankings of an input array of scores
 * against a leaderboard of scores.
 */
public class Leaderboard {

  /**
   * Computes and returns an array of rankings, corresponding to the values in
   * the <code>scores</code> array. These should use the common "competition"
   * ranking scheme &ndash; for example, if 2 players are tied for
   * 1<sup>st</sup> place, the player with the next lower score is assumed to
   * in 3<sup>rd</sup> place. Another way of thinking about this scheme is that
   * if a player is in <i>n</i><sup>th</sup> place, according to this scheme,
   * then there are exactly (<i>n</i> - 1) players with a higher score.
   *
   * @param leaderboard scores on the leaderboard, in non-ascending order.
   * @param scores      scores to be ranked against leaderboard scores.
   * @return            resulting ranks.
   */
  public static int[] getCompetitionRanking(int[] leaderboard, int[] scores) {
    // TODO Implement method.
  }

  /**
   * Computes and returns an array of rankings, corresponding to the values in
   * the <code>scores</code> array. These should use the dense ranking scheme
   * &ndash; for example, if 2 players are tied for 1<sup>st</sup> place, the
   * player with the next lower score is assumed to be in 2<sup>rd</sup> place.
   * Another way of thinking about this scheme is that if a player is in
   * <i>n</i><sup>th</sup> place, according to this scheme, then there are
   * exactly (<i>n</i> - 1) higher score values, some of which may have been
   * scored by more than one player.
   *
   * @param leaderboard scores on the leaderboard, in non-ascending order.
   * @param scores      scores to be ranked against leaderboard scores.
   * @return            resulting ranks.
   */
  public static int[] getDenseRanking(int[] leaderboard, int[] scores) {
    // TODO Implement method for EXTRA CREDIT!
  }

}
