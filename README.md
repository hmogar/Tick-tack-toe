# Tic-Tac-Toe in Java
<small>(Se ha utilizado un traductor para escribir el texto)</small>

## Overview
This project is a classic, console-based Tic-Tac-Toe game developed in Java. It was created as a practical exercise to review fundamental Object-Oriented Programming (OOP) concepts, focusing on clean structure and separation of concerns.

## Features
* **Two-Player Mode:** Alternating turns between Player 1 (X) and Player 2 (O).
* **Input Validation:** Prevents players from overwriting an already occupied space or inputting out-of-bounds coordinates.
* **Win and Tie Detection:** Automatically evaluates the board state after every turn to declare a winner (by rows, columns, or diagonals) or a tie if the board is full.

## System Architecture
The application logic is divided into distinct classes, keeping the user interface separate from the internal game mechanics:

* **GameManager:** Acts as the controller. It handles the main game loop, tracks the current turn, and coordinates the actions between the board and the screen.
* **Board:** Represents the 3x3 game grid. It manages the internal state, sets user marks, checks if the board is full, and contains the logic to determine if a winning combination has been achieved.
* **Screen:** Handles all standard input and output operations. It displays the menus, renders the board layout in the console, and safely captures player input via the keyboard.

## UML Diagrams
Below you can find the design diagrams detailing the structure and execution flow of the game. Please replace the placeholder paths with your actual image files.

### Class Diagram
<img width="841" height="559" alt="image" src="https://github.com/user-attachments/assets/9732e014-d306-44dc-95d4-f1d481025599" />


### Sequence Diagram

<img width="999" height="897" alt="image" src="https://github.com/user-attachments/assets/38adb827-aefc-42ac-a0d6-9eab059b86f4" />

 ### *Thank you for reading*
