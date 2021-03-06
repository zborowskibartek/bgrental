package com.boardgamesworld.bgrental.boardgame.domain;

import java.util.List;
import java.util.Set;

public interface BoardGameSort {

    List<BoardGame> getAllBoardGames(BoardGameSortType sort, Set<BoardGameType> types, Set<BoardGameCategory> categories, int offset, int limit);

}
