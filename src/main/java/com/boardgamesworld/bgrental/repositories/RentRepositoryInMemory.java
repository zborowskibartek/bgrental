package com.boardgamesworld.bgrental.repositories;

import com.boardgamesworld.bgrental.model.Rent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Primary
@Repository
public class RentRepositoryInMemory implements RentRepository {

    private List<Rent> rents;

    @Autowired
    public RentRepositoryInMemory(List<Rent> rents) {
        this.rents = rents;
    }

    @Override
    public void addRent(Rent newRent){
        rents.add(newRent);
    }

    @Override
    public List<Long> getAllBoardGameIdsRentAtPresent() {
        return rents.stream()
                .filter(Rent::isRented)
                .map(Rent::getGameId)
                .collect(Collectors.toList());
    }

    @Override
    public List<Long> getAllBoardGameIdsRentAtPresentByUser(long userId) {
        return rents.stream()
                .filter(rent -> rent.getUserId() == userId && rent.isRented())
                .map(Rent::getGameId)
                .collect(Collectors.toList());
    }
}