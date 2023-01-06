package com.example.practiceaction.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestModel {

    /**
     * car color
     */
    private String color;

    /**
     * car speed
     */
    private Double speed;

    /**
     * car owner
     */
    private String owner;

}
