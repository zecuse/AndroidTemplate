package com.zecuse.template.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.zecuse.template.database.SettingsDatabase
import com.zecuse.template.ui.theme.TimepiecesTheme
import com.zecuse.template.viewmodel.SettingsFactory
import com.zecuse.template.viewmodel.SettingsViewModel

class MainActivity: ComponentActivity()
{
	private val db by lazy {
		Room.databaseBuilder(context = applicationContext,
		                     klass = SettingsDatabase::class.java,
		                     name = "settings.db")
			.build()
	}

	private val settingsModel by viewModels<SettingsViewModel>(factoryProducer = {SettingsFactory(db)})

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			TimepiecesTheme {
				Scaffold(modifier = Modifier.fillMaxSize()) {innerPadding ->
					Greeting(name = "Android",
					         modifier = Modifier.padding(innerPadding))
				}
			}
		}
	}
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier)
{
	Text(text = "Hello $name!",
	     modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview()
{
	TimepiecesTheme {
		Greeting("Android")
	}
}