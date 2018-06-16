package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

class ClockAnglesTest {

  static final int[] HOURS = {0, 3, 12, 19};
  static final double[] MINUTES = {0, 15, 30, 42};
  static final double[] HOUR_HAND_DEGREES_TEST = {0, 97.5, 15, 231};
  static final double[] MINUTE_HAND_DEGREES_TEST = {0, 90, 180, 252};
  static final double[] HOUR_HAND_RADIANS_TEST = {1.57079632679, 6.152285613280012, 1.3089969389957474, 3.822271061867582};
  static final double[] MINUTE_HAND_RADIANS_TEST = {1.57079632679, 0, 4.71238898038, 3.4557519189487724};

  static ClockAngles clock = new ClockAngles();
  static DecimalFormat df = new DecimalFormat("#.##");

  @org.junit.jupiter.api.Test
  void hourHandDegrees() {
    for (int i = 0; i < HOUR_HAND_DEGREES_TEST.length; i++) {
      assertEquals(HOUR_HAND_DEGREES_TEST[i], clock.hourHandDegrees(HOURS[i], MINUTES[i]));
    }
  }

  @org.junit.jupiter.api.Test
  void minuteHandDegrees() {
    for (int i = 0; i < MINUTE_HAND_DEGREES_TEST.length; i++) {
      assertEquals(MINUTE_HAND_DEGREES_TEST[i], clock.minuteHandDegrees(MINUTES[i]));
    }
  }

  @org.junit.jupiter.api.Test
  void hourHandRadians() {
    for (int i = 0; i < HOUR_HAND_RADIANS_TEST.length; i++) {
      assertEquals(df.format(HOUR_HAND_RADIANS_TEST[i]), df.format(clock.hourHandRadians(HOURS[i], MINUTES[i])));
    }
  }

  @org.junit.jupiter.api.Test
  void minuteHandRadians() {
    for (int i = 0; i < MINUTE_HAND_RADIANS_TEST.length; i++) {
      assertEquals(df.format(MINUTE_HAND_RADIANS_TEST[i]), df.format(clock.minuteHandRadians(MINUTES[i])));
    }
  }
}