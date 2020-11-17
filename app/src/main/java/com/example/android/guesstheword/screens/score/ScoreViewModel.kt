package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel

class ScoreViewModel (finalScore: Int) : ViewModel() {
    // parameter pada Primary Constructor bisa diisi dengan ViewModelFactory
    var score = finalScore
}