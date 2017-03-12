/**
 * Main class for executing the program for two-dice pig game
 * @author Min
 *
 */
public class TwoDicePig {
  /**
   * Main method for running the game.  
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

      Player [] user = playerNumber();
      for (int i = 0; i < user.length; i++) {
        playerTurn(user);
      if (user[i].getScore() < 100) {
        playerTurn(user);
      }     
      }
  }
  /**
   * a method that creates the array of players with their name
   * @return array of players with their name entered in through TextIO
   */
  public static Player[] playerNumber() {
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
      player[i] = new Player(0, playerName);
    }
    return player; //Will it return the entire array?
  }
  public static boolean checkScore(Player[] player) {
    for (int i = 0; i < player.length; i++) {
      if (player[i].getScore() >= 100) {
        return true;
      }
    }
    return false;
  }
  /**
   * A method for the player to roll their dice and calculate their score
   * @param player array from playerNumber method is used to call this method
   * @return 
   */
 public static int playerTurn(Player[] player) {
    PairOfDice dice = new PairOfDice();
      int turnScore = 0;
      int totalScore = 0;
      boolean turnOver = true;
      String userResponse;
      for (int i = 0; i < player.length; i++) {
      do {
        dice.roll();
        if (dice.getDie1() == 1 && dice.getDie2() == 1) {
          System.out.println("The numbers on dice is " + dice.getDie1() + " and " + dice.getDie2() +".");
          turnScore = 0;
          player[i].setScore(0);
          totalScore = player[i].getScore();
          System.out.println(player[i].getName() + "'s score is " + totalScore);
          System.out.println("Your score is reset to 0.  Your turn ends.");
          turnOver = false;
        }
        else if (dice.getDie1() == 1 || dice.getDie2() == 1) {
          System.out.println("The numbers on dice is " + dice.getDie1() + " and " + dice.getDie2() +".");
          turnScore = 0;
          player[i].setScore(player[i].getScore() + turnScore);
          System.out.println("Your turn ends, and you will receive 0 for turn score.");
          totalScore = player[i].getScore();
          System.out.println(player[i].getName() + "'s score is " + totalScore);
          turnOver = false;
        }
        else if (dice.getDie1() > 1 && dice.getDie2() > 1 && dice.getDie1() != dice.getDie2()) {
          System.out.println("The numbers on dice is " + dice.getDie1() + " and " + dice.getDie2() +".");
          turnScore = (dice.getDie1() + dice.getDie2());
          totalScore = player[i].getScore() + turnScore;
          player[i].setScore(totalScore);
          System.out.println(player[i].getName() + "'s score is " + totalScore);
          System.out.println("Would you like to hold your turn? Yes or No?");
          userResponse = TextIO.getln();
          if (userResponse == "Yes" || userResponse == "yes") {
            turnOver = false;
          }
          else if (userResponse == "No" || userResponse == "no") {
            dice.roll();
            System.out.println("The numbers on dice is " + dice.getDie1() + " and " + dice.getDie2() +".");
            turnScore = (dice.getDie1() + dice.getDie2());
            totalScore = player[i].getScore() + turnScore;
            player[i].setScore(totalScore);
            System.out.println(player[i].getName() + "'s score is " + totalScore);
            turnOver = true;
          }
        }
        else if (dice.getDie1() == dice.getDie2() && dice.getDie1() > 1) {
          turnScore = (dice.getDie1() + dice.getDie2());
          totalScore = player[i].getScore() + turnScore;
          player[i].setScore(totalScore);
          System.out.println("The numbers on dice is " + dice.getDie1() + " and " + dice.getDie2() +".");
          System.out.println(player[i].getName() + "'s score is " + totalScore);
          System.out.println("You have to roll again");
          dice.roll();
          System.out.println("The numbers on dice is " + dice.getDie1() + " and " + dice.getDie2() +".");
          turnScore = (dice.getDie1() + dice.getDie2());
          totalScore = player[i].getScore() + turnScore;
          player[i].setScore(totalScore);
          System.out.println(player[i].getName() + "'s score is " + totalScore);
          System.out.println("Would you like to hold your turn? Yes or No?");
          userResponse = TextIO.getln();
          if (userResponse == "Yes" || userResponse == "yes") {
            turnOver = false;
          }
          else if (userResponse == "No" || userResponse == "no") {
            dice.roll();
            System.out.println("The numbers on dice is " + dice.getDie1() + " and " + dice.getDie2() +".");
            turnScore = (dice.getDie1() + dice.getDie2());
            totalScore = player[i].getScore() + turnScore;
            player[i].setScore(totalScore);
            System.out.println(player[i].getName() + "'s score is " + totalScore);
            turnOver = true;
          }
          turnOver = false;
        } 
      } while (turnOver == true);
      }
      return totalScore;
  }
 }

