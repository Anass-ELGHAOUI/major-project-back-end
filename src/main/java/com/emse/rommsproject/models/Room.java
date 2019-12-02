package com.emse.rommsproject.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Room {

    @Id
    private String id = "";
    private int lightLevel = 0;
    private int noiseLevel = 0;
    private String lightStatus = "";
    private String noiseStatus = "";

}
