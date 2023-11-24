## Overview
GatorEngine is a simple yet versatile Java-based game engine, designed for creating 2D games and interactive applications. It utilizes the Swing framework for the graphical user interface, providing a robust platform for rendering and handling user inputs.

## Features
2D Rendering: Utilizes Java's Graphics2D for drawing shapes, images, and text.
Input Handling: Keyboard and mouse input handling using Swing event listeners.
Game Object Management: Supports creation, deletion, and management of game objects within a scene.
Flexible Update Loop: Customizable frame rate and update loop using Java Threads and Timer.
Setup
Java Installation: Ensure you have Java installed on your machine.
IDE Setup: Import the project into your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
Usage
Main Components
GatorEngine class: Main class of the engine. Contains the primary game loop and setup methods.
GameObject class: Base class for game objects in the scene. Extend this class to create custom game objects.
Creating a Game Window
The CreateEngineWindow method initializes the game window and sets up the rendering context.
Game Loop
Update: Main update loop of the engine. Redraws the background and updates all game objects.
Start: Method called at the beginning of the game. Ideal for initializing game objects.
Input Handling
Key and mouse event listeners are added to the main display container for handling user inputs.
Example Usage
To create a new game, extend the GameObject class and override its methods for custom behavior. Use the Create method to add new objects to the scene and Delete to remove them.

## Notes
This engine is a basic implementation and may require further optimization for complex games.
The UI and engine components are tightly coupled; consider refactoring for larger projects.
Contribution
Contributions to the engine are welcome. Please follow standard coding practices and document your changes.
