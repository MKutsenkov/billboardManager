package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class List {


    private int id;
    private int filmId;
    private String filmName;
    private int filmPrice;
    private int count;
}



