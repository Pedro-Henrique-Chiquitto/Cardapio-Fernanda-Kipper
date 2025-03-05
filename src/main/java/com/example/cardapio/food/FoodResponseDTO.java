package com.example.cardapio.food;

public record FoodResponseDTO(Long id, Integer price, String image, String title) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getPrice(), food.getImage(), food.getTitle());

    }
}
