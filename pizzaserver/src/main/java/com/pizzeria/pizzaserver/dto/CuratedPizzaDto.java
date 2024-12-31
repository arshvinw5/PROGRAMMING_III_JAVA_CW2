package com.pizzeria.pizzaserver.dto;

public record CuratedPizzaDto(
    int id,
    String name,
    String ingredients,
    String description,
    double price
) {}
