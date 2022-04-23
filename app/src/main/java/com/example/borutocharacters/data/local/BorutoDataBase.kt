package com.example.borutocharacters.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.borutocharacters.data.local.dao.HeroDao
import com.example.borutocharacters.data.local.dao.HeroRemoteKeyDao
import com.example.borutocharacters.domain.model.Hero
import com.example.borutocharacters.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
abstract class BorutoDataBase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}
