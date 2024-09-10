import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutomatedTests {

  // Begin return tests
  @Test
  public void calcAverageDecimals() {
    double score1 = 3.1;       // The 1st score
    double score2 = 4.5;       // The 2nd score
    double score3 = 5.4;       // The 3rd score
    double score4 = 5.5;       // The 4th score
    double score5 = 8.1;       // The 5th score
    double expectedAverage = (score1 + score2 + score3 + score4 + score5) / 5.0;      // The average score

    GForceTest gForceTest = new GForceTest();
    double actualAverage = gForceTest.calcAverage(score1, score2, score3, score4, score5);

    assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcAverageIntegers() {
    double score1 = 8;       // The 1st score
    double score2 = 7;       // The 2nd score
    double score3 = 8;       // The 3rd score
    double score4 = 8;       // The 4th score
    double score5 = 7;       // The 5th score
    double expectedAverage = (score1 + score2 + score3 + score4 + score5) / 5.0;      // The average score

    GForceTest gForceTest = new GForceTest();
    double actualAverage = gForceTest.calcAverage(score1, score2, score3, score4, score5);

    assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcAverageMixedNumbers() {
    double score1 = 8.8;       // The 1st score
    double score2 = 7.9;       // The 2nd score
    double score3 = 5.3;       // The 3rd score
    double score4 = 8.9;       // The 4th score
    double score5 = 7.2;       // The 5th score
    double expectedAverage = (score1 + score2 + score3 + score4 + score5) / 5.0;      // The average score

    GForceTest gForceTest = new GForceTest();
    double actualAverage = gForceTest.calcAverage(score1, score2, score3, score4, score5);

    assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcAverageWarnings() {
    double score1 = 9.9;       // The 1st score
    double score2 = 9.4;       // The 2nd score
    double score3 = 9.2;       // The 3rd score
    double score4 = 9.4;       // The 4th score
    double score5 = 9.9;       // The 5th score
    double expectedAverage = (score1 + score2 + score3 + score4 + score5) / 5.0;      // The average score

    GForceTest gForceTest = new GForceTest();
    double actualAverage = gForceTest.calcAverage(score1, score2, score3, score4, score5);

    assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcAverageExcel() {
    double score1 = 7.1;       // The 1st score
    double score2 = 7.3;       // The 2nd score
    double score3 = 7.2;       // The 3rd score
    double score4 = 8.1;       // The 4th score
    double score5 = 8.4;       // The 5th score
    double expectedAverage = (score1 + score2 + score3 + score4 + score5) / 5.0;      // The average score

    GForceTest gForceTest = new GForceTest();
    double actualAverage = gForceTest.calcAverage(score1, score2, score3, score4, score5);

    assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcAveragePass() {
    double score1 = 5.2;       // The 1st score
    double score2 = 6.0;       // The 2nd score
    double score3 = 5.9;       // The 3rd score
    double score4 = 5.5;       // The 4th score
    double score5 = 4.1;       // The 5th score
    double expectedAverage = (score1 + score2 + score3 + score4 + score5) / 5.0;      // The average score

    GForceTest gForceTest = new GForceTest();
    double actualAverage = gForceTest.calcAverage(score1, score2, score3, score4, score5);

    assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcAverageFail() {
    double score1 = 2.2;       // The 1st score
    double score2 = 2.4;       // The 2nd score
    double score3 = 2.6;       // The 3rd score
    double score4 = 2.2;       // The 4th score
    double score5 = 2.8;       // The 5th score
    double expectedAverage = (score1 + score2 + score3 + score4 + score5) / 5.0;      // The average score

    GForceTest gForceTest = new GForceTest();
    double actualAverage = gForceTest.calcAverage(score1, score2, score3, score4, score5);

    assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcAverageMixedDecreasing() {
    double score1 = 9.2;       // The 1st score
    double score2 = 9.0;       // The 2nd score
    double score3 = 8.5;       // The 3rd score
    double score4 = 7.0;       // The 4th score
    double score5 = 6.0;       // The 5th score
    double expectedAverage = (score1 + score2 + score3 + score4 + score5) / 5.0;      // The average score

    GForceTest gForceTest = new GForceTest();
    double actualAverage = gForceTest.calcAverage(score1, score2, score3, score4, score5);

    assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcAverageMixedIncreasing() {
    double score1 = 2.3;       // The 1st score
    double score2 = 4.2;       // The 2nd score
    double score3 = 5.8;       // The 3rd score
    double score4 = 6.9;       // The 4th score
    double score5 = 8.3;       // The 5th score
    double expectedAverage = (score1 + score2 + score3 + score4 + score5) / 5.0;      // The average score

    GForceTest gForceTest = new GForceTest();
    double actualAverage = gForceTest.calcAverage(score1, score2, score3, score4, score5);

    assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcAverageMixedRandom() {
    double score1 = 2.7;       // The 1st score
    double score2 = 9.4;       // The 2nd score
    double score3 = 5.2;       // The 3rd score
    double score4 = 7.7;       // The 4th score
    double score5 = 6.4;       // The 5th score
    double expectedAverage = (score1 + score2 + score3 + score4 + score5) / 5.0;      // The average score

    GForceTest gForceTest = new GForceTest();
    double actualAverage = gForceTest.calcAverage(score1, score2, score3, score4, score5);

    assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 is the delta for double comparison precision
  }
  
  @Test
  public void checkForExit() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("GForceTest.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("System.exit(") || line.contains("System.exit (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You forgot to close the program.");
    }
  } 
  @Test
  public void checkForDetermineGrade() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("GForceTest.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("determineGrade(")||line.contains("determineGrade (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You forgot to use a method named determineGrade.");
    }
  }
  @Test
  public void checkForcalcAverage() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("GForceTest.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("calcAverage(")||line.contains("calcAverage (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You forgot to use a method named calcAverage.");
    }
  }
}
