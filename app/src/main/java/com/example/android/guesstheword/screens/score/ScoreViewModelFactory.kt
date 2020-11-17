package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ScoreViewModelFactory (private val finalScore: Int) : ViewModelProvider.Factory {
    // Harus mengimplementasikan semua method membernya

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        // T maksudnya tipe generic, bisa berupa tipe viewModel apa saja
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java))
            // Untuk memasikan bahwa model class ini merupakan ScoreViewModel
        {
            return ScoreViewModel(finalScore) as T
            // as ini alias, mengubah class menjadi sebuah suatu class
        }
        throw IllegalAccessException("Unknown ViewModel Class")
        // menunjukkan sendiri exception yang akan ditampilkan
        // mengembalikan hasil walaupun bukan tipe T
    }

}