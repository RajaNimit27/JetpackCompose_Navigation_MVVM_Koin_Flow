package com.app.compose_navigation_mvvm_flow.data

data class Receipes(
    val limit: Int? = null,
    val recipes: List<Recipe>? = null,
    val skip: Int? = null,
    val total: Int? = null
) {
    data class Recipe(
        val caloriesPerServing: Int? = null,
        val cookTimeMinutes: Int? = null,
        val cuisine: String? = null,
        val difficulty: String? = null,
        val id: Int? = null,
        val image: String? = null,
        val ingredients: List<String?>? = null,
        val instructions: List<String?>? = null,
        val mealType: List<String?>? = null,
        val name: String? = null,
        val prepTimeMinutes: Int? = null,
        val rating: Double? = null,
        val reviewCount: Int? = null,
        val servings: Int? = null,
        val tags: List<String?>? = null,
        val userId: Int? = null
    )
}