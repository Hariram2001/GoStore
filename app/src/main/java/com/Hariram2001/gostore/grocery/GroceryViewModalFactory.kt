package com.Hariram2001.gostore.grocery

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.Hariram2001.gostore.database.GroceryRepository

class GroceryViewModalFactory(private val repository: GroceryRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return GroceryViewModal(repository) as T
    }
}
