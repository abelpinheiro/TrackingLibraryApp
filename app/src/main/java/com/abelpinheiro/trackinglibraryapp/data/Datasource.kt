package com.abelpinheiro.trackinglibraryapp.data

import com.abelpinheiro.trackinglibraryapp.R
import com.abelpinheiro.trackinglibraryapp.model.Series
import java.util.*

class Datasource {
    fun loadSeries(): List<Series>{
        return listOf<Series>(
            Series("Love Hina", 13, 13, "Ken Akamatsu", Date(), Date(), R.drawable.love_hina),
            Series("Vagabond", 20, 30, "Takehiko Inoue", Date(), Date(), R.drawable.vagabond),
            Series("Berserk", 18, 35, "Kentarou Miura", Date(), Date(), R.drawable.berserk),
            Series("Monster", 2, 18, "Naoki Urasawa", Date(), Date(), R.drawable.monster),
            Series("Akira", 2, 6, "Katsuhiro Ootomo", Date(), Date(), R.drawable.akira),
            Series("Great Teacher Onizuka", 5, 8, "Tooru Fujisawa", Date(), Date(), R.drawable.gto),
            Series("Fullmetal Alchemist", 10, 23, "Hiromu Arakawa", Date(), Date(), R.drawable.fullmetal),
            Series("Yu Yu Hakusho", 19, 19, "Yoshihiro Togashi", Date(), Date(), R.drawable.yuu_yuu),
            Series("Tokyo Ghoul", 12, 12, "Sui Ishida", Date(), Date(), R.drawable.tokyo_ghoul),
        )
    }
}