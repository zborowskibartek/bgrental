package com.boardgamesworld.bgrental.repositories;

import com.boardgamesworld.bgrental.model.RentHistory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class RentHistoryInMemoryRepository implements RentHistoryRepository {

    private List<RentHistory> rentHistory;

    @Autowired
    public RentHistoryInMemoryRepository(List<RentHistory> rentHistory) {
        this.rentHistory = rentHistory;
    }

    @Override
    public List<Long> getAllBoardGameRentHistoryByUser(long userId) {
        return rentHistory.stream()
                .filter(rentHistory -> rentHistory.getUserId() == userId)
                .map(RentHistory::getGameId)
                .collect(Collectors.toList());
    }
}

