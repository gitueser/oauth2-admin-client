package com.tacocloud.oauth2adminclient.service;

import com.tacocloud.oauth2adminclient.entity.Ingredient;

public interface IngredientService {

    Iterable<Ingredient> findAll();

    Ingredient addIngredient(Ingredient ingredient);

}
