# chess-application

## Overview
* This application suggests the possible moves of a piece on an empty chess board.
* It supports three pieces - Pawn, King, Queen

## Features
* Given an input like : **Pawn, A1**, the application will provide an output which will list all the possible cells the given piece can move. Here the first argument is the Piece(Pawn, King, Queen) and the second argument is its cell number. The current chess board is a 8 x 8 chess board where columns range from A to H and rows range from 1 to 8. Hence A1 represents the first row of first column.

## Technologies Used
- Java
- Gradle
- Junit

## What you need to run it
- Java 22

## Build the application
./gradlew clean build

## Run tests
./gradlew test

## Run the application
./gradlew clean build -x test
java -jar build/libs/chess-application-1.0-SNAPSHOT.jar 
