package com.venom.myrecipieapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
):Parcelable

data class CategoriesResponse(val categories: List<Category>)

//JSON From MealDB.
//"idCategory": "1",
//"strCategory": "Beef",
//"strCategoryThumb": "https://www.themealdb.com/images/category/beef.png",
//"strCategoryDescription":