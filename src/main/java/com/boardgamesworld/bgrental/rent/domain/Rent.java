package com.boardgamesworld.bgrental.rent.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Rent {

    private long userId;
    private long gameId;
    private LocalDateTime rentedDate;
    private LocalDateTime returnedDate = null;

}