package com.zecuse.template.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.zecuse.template.model.SettingsData
import kotlinx.coroutines.flow.Flow

@Dao
interface SettingsDao
{
	@Upsert
	suspend fun updateSetting(settings: SettingsData)

	@Query("SELECT * FROM SettingsData")
	fun getSettings(): Flow<SettingsData?>
}