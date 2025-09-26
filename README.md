# TicTacToe Game 

A simple Java program that implements the classic TicTacToe game in the command line.

This program lets you play TicTacToe against the computer. It handles user input, validates moves, checks for wins or ties, and provides a simple “thinking” animation for the computer’s turn. It’s easy to run and super fun to play.

This Java implementation of TicTacToe was originally created as a learning exercise. Players can now enjoy the game in the command line, while developers can explore the code for educational purposes.

## Getting Started

Follow these steps below to get the project running on your computer:

### Prerequisites

You’ll need:

* Java JDK (11 or above recommended), which includes both:
    - **Compiler (`javac`)** – to compile Java source files
    - **Runtime (`java`)** – to run compiled programs

* A terminal or command prompt (macOS/Linux or Command Prompt/PowerShell on Windows)

Check that Java JDK is installed:

```
java -version   # checks the Java runtime
```
and
```
javac -version  # checks the Java compiler
```

### Installing

#### 1. Clone this repository and Navigate to the project directory:

```
git clone https://github.com/your-username/tic-tac-toe.git
```

```
cd tic-tac-toe
```

#### 2. Compile the program:

* Create a folder for compiled bytecode:

```
mkdir bin
```

* Compile the source code into .class files:

```
javac -d bin src/TicTacToe.java
```

## Running the program

Run the compiled program from the bin directory:

```
java -cp bin TicTacToe
```

#### Gameplay:

* The program alternates turns between the player **(`X`)** and the computer **(`O`)**.
* Enter numbers 1-9 to place your move according to the following layout:

```
1 | 2 | 3
- + - + -
4 | 5 | 6
- + - + -
7 | 8 | 9
```

* The game ends when either the player or computer wins, or if the board is full (tie).

#### `Upcoming Features:`

* Add a smarter computer opponent (AI) that plays strategically instead of random moves.
* Build a graphical interface (JavaFX or Swing) for a better gameplay experience.

## Deployment

There’s no special deployment needed. Compile the program with Java and run it locally from the terminal.

## Built With

* Java 11+ – core programming language
* Command-line interface – simple text-based UI
* `JavaDoc` comments included in source code (see doc/index.html directory)

## Contributing

Contributions are welcome! Open an issue or submit a pull request if you want to add features or improve the project.

## Author

* Soikat Saha – initial work


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* Inspired by the classic TicTacToe game, implemented as a simple command-line project for learning and fun.