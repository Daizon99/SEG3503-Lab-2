import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.lang.IllegalArgumentException;

class DateTest {

  @Test
  void nextDate_sample_1() {
    Date date = new Date(1700, 6, 20);
    assertEquals(new Date(1700, 6, 21) , date.nextDate());
  }

  @Test
  void nextDate_sample_2() {
    Date date = new Date(2005, 4, 15);
    assertEquals(new Date(2005, 4, 16) , date.nextDate());
  }

  @Test
  void nextDate_sample_3() {
    Date date = new Date(1901, 7, 20);
    assertEquals(new Date(1901, 7, 21) , date.nextDate());
  }

  @Test
  void nextDate_sample_4() {
    Date date = new Date(3456, 3, 27);
    assertEquals(new Date(3456, 3, 28) , date.nextDate());
  }

  @Test
  void nextDate_sample_5() {
    Date date = new Date(1500, 2, 17);
    assertEquals(new Date(1500, 2, 18) , date.nextDate());
  }

  @Test
  void nextDate_sample_6() {
    Date date = new Date(1700, 6, 29);
    assertEquals(new Date(1700, 6, 30) , date.nextDate());
  }

  @Test
  void nextDate_sample_7() {
    Date date = new Date(1800, 11, 29);
    assertEquals(new Date(1800, 11, 30) , date.nextDate());
  }

  @Test
  void nextDate_sample_8() {
    Date date = new Date(3453, 1, 29);
    assertEquals(new Date(3453, 1, 30) , date.nextDate());
  }

  @Test
  void nextDate_sample_9() {
    Date date = new Date(444, 2, 29);
    assertEquals(new Date(444, 3, 1) , date.nextDate());
  }

  @Test
  void nextDate_sample_10() {
    Date date = new Date(2005, 4, 30);
    assertEquals(new Date(2005, 5, 1) , date.nextDate());
  }

  @Test
  void nextDate_sample_11() {
    Date date = new Date(3453, 1, 30);
    assertEquals(new Date(3453, 1, 31) , date.nextDate());
  }

  @Test
  void nextDate_sample_12() {
    Date date = new Date(3456, 3, 30);
    assertEquals(new Date(3456, 3, 31) , date.nextDate());
  }

  @Test
  void nextDate_sample_13() {
    Date date = new Date(1901, 7, 31);
    assertEquals(new Date(1901, 8, 1) , date.nextDate());
  }

  @Test
  void nextDate_sample_14() {
    Date date = new Date(3453, 1, 31);
    assertEquals(new Date(3453, 2, 1) , date.nextDate());
  }

  @Test
  void nextDate_sample_15() {
    Date date = new Date(3456, 12, 31);
    assertEquals(new Date(3457, 1, 1) , date.nextDate());
  }

  @Test
  void nextDate_sample_16() {
    assertThrows(IllegalArgumentException.class, () -> {new Date(1500, 2, 31);});
  }

  @Test
  void nextDate_sample_17() {
    assertThrows(IllegalArgumentException.class, () -> {new Date(1500, 2, 29);});
  }

  @Test
  void nextDate_sample_18() {
    assertThrows(IllegalArgumentException.class, () -> {new Date(-1, 10, 20);});
  }

  @Test
  void nextDate_sample_19() {
    assertThrows(IllegalArgumentException.class, () -> {new Date(1458, 15, 12);});
  }

  @Test
  void nextDate_sample_20() {
    assertThrows(IllegalArgumentException.class, () -> {new Date(1975, 6, -50);});
  }
}
