package me.joshshin.mycomyopia.models

/**
 * Created by Josh Shin on 2019-11-24
 */

data class Colony(
    val id: Int,
    val name: String,
    val nickname: String? = null,
    val strain: Strain,
    val generation: Int,
    val parent: Colony?
)