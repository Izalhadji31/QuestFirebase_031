package com.example.questfirebase_031.di

import com.google.firebase.firestore.FirebaseFirestore
import com.example.questfirebase_031.repository.NetworkRepositoryMhs
import com.example.questfirebase_031.repository.RepositoryMhs

interface AppContainer{
    val repositoryMhs: RepositoryMhs
}

class MahasiswaContainer: AppContainer{
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    override val repositoryMhs: RepositoryMhs by lazy {
        NetworkRepositoryMhs(firestore)
    }
}