/*
* This program will tell the user the height of a board-foot
* based on the length and width entered by the user.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-11-30
*/

import java.util.Scanner;  // Import the Scanner class

public class BoardFoot {
  /**
   * This function will find the height of a board-foot
   * based on the length and width entered by the user.
   */
  static float findBoardHeight(float length, float width) {
    // Assigning and specifying the volume of a board-foot
    final int volume = 144;

    // Calculating the height of the board
    float height = volume / (length * width);

    // Returning the height of the board
    return height;
  }

  /**
   * This function allow the user to input the length and width
   * of a board-foot and have the program output the height.
   */
  public static void main(String[] args) {
    try {
      // Input for the length of the board-foot
      Scanner lengthInput = new Scanner(System.in);
      System.out.println("Enter the length of the board:");
      float userLength = lengthInput.nextFloat();
      System.out.println();

      // Input for the width of the board-foot
      Scanner widthInput = new Scanner(System.in);
      System.out.println("Enter the width of the board:");
      float userWidth = widthInput.nextFloat();
      System.out.println();

      // Process
      float heightOfBoard = findBoardHeight(userLength, userWidth);

      // Output
      System.out.println("The height of the board in one board-foot is "
                         + heightOfBoard + " inches.");
      
      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    }
  }
}
