package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel (finalScore: Int) : ViewModel() {
    // parameter pada Primary Constructor bisa diisi dengan ViewModelFactory
    var score = finalScore

    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val evenPlayAgain : LiveData<Boolean>
        get() = _eventPlayAgain

    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }

    fun onPlayAgainCompleted() {
        _eventPlayAgain.value = false
    }
}