plugins {
	alias(libs.plugins.android.application)
	alias(libs.plugins.jetbrains.kotlin.android)
	alias(libs.plugins.com.google.devtools.ksp)
	alias(libs.plugins.compose.compiler)
	alias(libs.plugins.dokka)
	alias(libs.plugins.junit)
	alias(libs.plugins.room)
}

android {
	namespace = "com.zecuse.template"
	compileSdk = 34

	defaultConfig {
		applicationId = "com.zecuse.template"
		minSdk = 26
		targetSdk = 34
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		vectorDrawables {
			useSupportLibrary = true
		}
	}
	room {
		schemaDirectory("$projectDir/schemas")
	}
	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
			              "proguard-rules.pro")
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}
	buildFeatures {
		compose = true
	}
	composeOptions {
		kotlinCompilerExtensionVersion = "1.5.1"
	}
	packaging {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
	tasks.dokkaHtml {
		moduleName.set("BPM Tapper")
		outputDirectory.set(layout.buildDirectory.dir("docs/html"))
		dokkaSourceSets {
			configureEach {
				includes.from("README.md")
			}
		}
		val dokkaBaseConfig = """
			{
				"customAssets": ["${file("src/main/res/mipmap-hdpi/ic_launcher.webp").path.replace("\\", "/")}"],
				"customStyleSheets": ["${file("css/logo-styles.css").path.replace("\\", "/")}"]
			}
		""".trimIndent()
		pluginsMapConfiguration.set(mapOf("org.jetbrains.dokka.base.DokkaBase" to dokkaBaseConfig))
	}
}

dependencies {
	// Android
	implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.lifecycle.runtime.ktx)
	androidTestImplementation(libs.androidx.junit)
	androidTestImplementation(libs.androidx.espresso.core)

	// Unit Tests
	testImplementation(libs.junit.jupiter)
	testRuntimeOnly(libs.junit.jupiter.engine)
	testImplementation(libs.kotlin.test)
	testImplementation(libs.google.truth)

	// Jetpack Compose
	implementation(platform(libs.compose.bom))
	implementation(libs.compose.activity)
	implementation(libs.compose.material3)
	implementation(libs.compose.viewmodel)
	implementation(libs.compose.ui)
	implementation(libs.compose.ui.graphics)
	implementation(libs.compose.ui.tooling.preview)
	debugImplementation(libs.compose.ui.tooling)
	debugImplementation(libs.compose.ui.test.manifest)
	androidTestImplementation(libs.compose.ui.test.junit4)
	androidTestImplementation(platform(libs.compose.bom))

	// Room
	implementation(libs.room.ktx)
	ksp(libs.room.compiler)
}