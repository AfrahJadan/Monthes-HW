package com.example.listrecycle.data

import android.widget.TextView
import com.example.listrecycle.R
import com.example.listrecycle.model.Affirmation

 class Datasource {
    fun loadAffirmations():List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10),
            Affirmation(R.string.affirmation11), //Also here in the return
            Affirmation(R.string.affirmation12)
        )
    }
}