import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ScrabbleTest {

  @Test
  public void getScore_forUserInputA_returnsScore1() {
    Scrabble scrabble = new Scrabble();
    assertEquals(1, scrabble.letters.get('A'));
  }

}