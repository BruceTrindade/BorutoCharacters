package com.example.borutocharacters.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.borutocharacters.data.local.dao.HeroDao
import com.example.borutocharacters.domain.model.Hero

@Database(entities = [Hero::class], version = 1)
abstract class BorutoDataServer : RoomDatabase() {

    abstract fun heroDa(): HeroDao

}
