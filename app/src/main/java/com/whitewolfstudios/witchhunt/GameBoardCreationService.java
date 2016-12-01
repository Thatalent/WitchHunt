package com.whitewolfstudios.witchhunt;

/**
 * Created by Thatalent on 11/30/2016.
 */

public interface GameBoardCreationService {

    GameBoard getNewGameBoard();

    void populateGameBoard(GameBoard gameBoard);

    void generateResources(GameBoard  gameBoard);

    void placePlayers(GameBoard gameBoard);


}
