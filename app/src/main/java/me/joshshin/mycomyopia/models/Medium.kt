package me.joshshin.mycomyopia.models

/**
 * Created by Josh Shin on 2019-11-25
 */

typealias Numerator = Int
typealias Denominator = Int
typealias Ratio = Pair<Numerator, Denominator>
typealias Proportion = Pair<Ingredient, Ratio>

data class Medium(
    val id: Int,
    val name: String,
    val materials: List<Proportion>
)
