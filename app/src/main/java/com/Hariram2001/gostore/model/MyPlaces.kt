package com.Hariram2001.gostore.model

data class MyPlaces(
    var html_attributions: Array<String>? = null,
    var status: String? = null,
    var results: Array<Results>? = null
)
