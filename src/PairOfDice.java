/**
 * Pair of dice class to represent roll of dice
 * @author Min
 *
 */
public class PairOfDice {
  /**
   * Instance variable to represent a die
   */
  private int die1;
  /**
   * Instance variable to represent a die
   */
  private int die2;
  /**
   * To represent the dice roll.  
   */
  public void roll() {
    this.die1 = (int)(Math.random() * 6 + 1);
    this.die2 = (int)(Math.random() * 6 + 1);
  }
  /**
   * Getter to call the value of a die
   * @return a random integer between 1 and 6 to represent a roll of a die
   */
  public int getDie1() {
    return this.die1;
  }
  /**
   * Getter to call the value of a second die
   * @return a random integer between 1 and 6 to represent a roll of a second die
   */
  public int getDie2() {
    return this.die2;
  }
}
