/**
 * Player class for storing players' names and scores
 * @author Min
 *
 */
public class Player {
  /**
   * instance variables for storing the score for players in integer
   */
  private int score;
  /**
   * instance variables for storing the name for players
   */
  private String name;

/**
 * A constructor method to set up instance variables to the parameters
 * @param score: integer parameter that takes in the score of users
 * @param name: String parameter that takes in the name of users
 */
  public Player(int score, String name) {
    this.score = score;
    this.name = name;
  }

/**
 * Getter method that allows the players to get the player's name
 * @return referenced String instance variable for name
 */
  public String getName() {
    return this.name;
  }

/**
 * Setter method that allows the players to set the player's name
 * @param userName takes in name of the players in String from other classes
 */
  public void setName(String userName) {
    this.name = name;
  }

/**
 * Getter method that allows the players to call and get the score for those players
 * @return score stored in instance variable
 */
  public int getScore() {
    return this.score;
  }

/**
 * Setter method that allows reset of score
 * @param number to take in an integer to set the score.  
 */
  public void setScore(int number) {
    this.score = number;
  }
}

  /**public Player[] playerNumber() {
    System.out.println("Please enter the number of players.");
    int userInput = TextIO.getlnInt();
    while (userInput <= 0) {
      System.out.println("Please enter the number above 0");
      userInput = TextIO.getlnInt();
    }
    Player player[] = new Player[userInput];
    for (int i = 0; i < userInput; i++) {
      System.out.println("Please enter player " + (i + 1) + "'s name.");
      String playerName = TextIO.getln();
      player[i] = new Player(0, playerName); //create      
    }
    return player;
  }
}
**/
  
