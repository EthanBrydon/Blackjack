Date: 10/08/2022
Author: Ethan Brydon

Title: Ethan's BlackJack Text App

Purpose: I made this project to refresh my Java skills and have some fun programming in my spare time.

Description: This program allows a user to play Blackjack against a dealer which is programmed with basic dealer stratedgy. The player can then practice playing Blackjack and evaluate their play based on how many wins and losses they accumalate as the program tracks this for them. I plan to also add different ways to play, like with simluated money.

Files:

 - Main.java (contains logic to process user requests and runs the Blackjack rounds)

 - Participator.java (Participator class which is the super class of Dealer and Player, Participator establishes variables and methods that are shared among Dealer and Player)

 - Dealer.java (Dealer class which is a subclass of Participator which operates and manges the dealers actions and results)

 - Player.java (Player class which is a subclass of Participator which operates and manges the player actions and results)

 - Deck.java (Deck class which simulates the cards used for the rounds of Blackjack and represents a chosen amount decks)

 - Game.java (Game class which operates, manages and processes a round of Blackjack)