package com.example.questfirebase_031.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.questfirebase_031.MahasiswaApplications
import com.example.questfirebase_031.ui.home.viewmodel.HomeViewModel
import com.example.questfirebase_031.ui.insert.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                mahasiswaApp().container.repositoryMhs
            )
        }
        initializer {
            InsertViewModel(
                mahasiswaApp().container.repositoryMhs
            )
        }
    }
}

fun CreationExtras.mahasiswaApp(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)