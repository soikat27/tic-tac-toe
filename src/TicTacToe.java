import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * A simple console-based Tic-Tac-Toe game.
 * Supports a human player vs a computer opponent.
 */
public class TicTacToe {
    
	/**
     * Entry point for the Tic-Tac-Toe game.
     * Initializes the board and alternates moves between player and computer.
     *
     * @param args Command-line arguments (not used)
     */
	public static void main(String[] args)
	{
        char[][] board = {{' ', ' ', ' '}, 
				    	  {' ', ' ', ' '}, 
				    	  {' ', ' ', ' '}};
		
		printBoard(board);
	}

	/**
     * Prints the current Tic-Tac-Toe board to the console.
     *
     * @param board 3x3 character array representing the board
     */
	private static void printBoard(char[][] board)
	{
        System.out.println (board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println ("-+-+-");
		System.out.println (board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println ("-+-+-");
		System.out.println (board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

	/**
     * Places a move on the board for a given symbol at a user-specified position.
     *
     * @param board     3x3 character array representing the board
     * @param userInput The position (1-9) where the player wants to move
     * @param symbol    'x' for player or 'o' for computer
     */
	private static void placeMove(char[][] board, String userInput, char symbol) 
	{
		switch (userInput) 
		{
			case "1":
				board[0][0] = symbol;
				break;
			case "2":
				board[0][1] = symbol;
				break;
			case "3":
				board[0][2] = symbol;
				break;
			case "4":
				board[1][0] = symbol;
				break;
			case "5":
				board[1][1] = symbol;
				break;
			case "6":
				board[1][2] = symbol;
				break;
			case "7":
				board[2][0] = symbol;
				break;
			case "8":
				board[2][1] = symbol;
				break;
			case "9":
				board[2][2] = symbol;
				break;
			default:
				break;
		}
	}

	/**
     * Checks if a given move is valid (the cell is empty).
     *
     * @param board     3x3 character array representing the board
     * @param userInput The position (1-9) to check
     * @return true if the cell is empty, false otherwise
     */
	private static boolean isValidMove(char[][] board, String userInput) 
	{
		switch (userInput) 
		{
			case "1":
				return board[0][0] == ' ';
			case "2":
				return board[0][1] == ' ';
			case "3":
				return board[0][2] == ' ';
			case "4":
				return board[1][0] == ' ';
			case "5":
				return board[1][1] == ' ';
			case "6":
				return board[1][2] == ' ';
			case "7":
				return board[2][0] == ' ';
			case "8":
				return board[2][1] == ' ';
			case "9":
				return board[2][2] == ' ';
			default:
				return false;
		}
	}

	/**
     * Handles the human player's move by prompting for input until a valid move is made.
     *
     * @param board   3x3 character array representing the board
     * @param scanner Scanner object for reading user input
     * @throws InterruptedException if thread sleep is interrupted
     */
	private static void playerMove(char[][] board, Scanner scanner) throws InterruptedException
	{	
		String userInput;
		while (true)
		{
			System.out.print ("Where would you like to play?(0-9): ");
			
			userInput = scanner.nextLine();
			
			if (isValidMove(board, userInput))
			{
				break;
			}
			
			System.out.println ("Invalid Move! Please try another move.");
			
			TimeUnit.MILLISECONDS.sleep (2000);
		}
		
		
		placeMove(board, userInput, 'x');
	}

	/**
     * Handles the computer's move by selecting a random valid position.
     *
     * @param board 3x3 character array representing the board
     * @throws InterruptedException if thread sleep is interrupted
     */
	private static void computerMove(char[][] board) throws InterruptedException 
	{
		String message = "Computer is thinking";
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print (message + "\r");
			
			message += ".";
			
			TimeUnit.MILLISECONDS.sleep(500);
		}
		
		String computerInput;
		Random random = new Random ();
		
		while (true)
		{
			computerInput = Integer.toString(random.nextInt(9) + 1);
			
			if (isValidMove (board, computerInput))
			{
				break;
			}
		}
		
		System.out.println ("\rComputer moved: " + computerInput + "      ");
		
		placeMove (board, computerInput, 'o');
	}
}