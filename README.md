## Overview
GatorEngine is a Java-based game engine for creating 2D games and interactive applications using the Swing framework. It focuses on ease of use for rendering and handling user inputs.

## Features
- **2D Rendering**: Employs Java's Graphics2D.
- **Input Handling**: Implements Swing event listeners for keyboard and mouse inputs.
- **Game Object Management**: Facilitates the creation, updating, and deletion of game objects.
- **Update Loop**: Customizable frame rate and update loop with Java Threads and Timer.

## Setup
1. **Java Installation**: Ensure Java is installed.
2. **IDE Setup**: Import the project into a Java IDE (e.g., IntelliJ, Eclipse).

## Usage
### Main Components
- `GatorEngine`: Main class containing the game loop and setup methods.
- `GameObject`: Base class for game objects. Extend for custom objects.

### Creating a Game Window
- `CreateEngineWindow` initializes the game window and rendering context.

### Game Loop
- `Update`: Main update loop for redrawing the background and updating game objects.
- `Start`: Called at the beginning for initializing objects.

### Input Handling
- Key and mouse listeners are added to the display container.

## Example Usage
Extend `GameObject` for custom behavior. Use `Create` and `Delete` for managing objects.

## Notes
- Basic implementation suitable for simple games.
- UI and engine components are closely coupled.

## Contribution
Contributions are welcome. Adhere to standard coding practices.
