package com.zecuse.template.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zecuse.template.model.SettingsData

@Database(entities = [SettingsData::class],
          version = 1)
abstract class SettingsDatabase: RoomDatabase()
{
	abstract val dao: SettingsDao
}