package com.example.borutocharacters.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.borutocharacters.util.Constants.HERO_REMOTE_KEY_DATABASE_TABLE

@Entity(tableName = HERO_REMOTE_KEY_DATABASE_TABLE)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevKey: Int?,
    val nextkey: Int?
)