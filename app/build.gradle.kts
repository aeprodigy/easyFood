import java.util.Properties

plugins {


    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}
// Read .env properties
val envFile = rootProject.file(".env")
val envProperties = Properties()

if (envFile.exists()) {
    envFile.inputStream().use { envProperties.load(it) }
}

android {
    namespace = "com.example.easyfood"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.easyfood"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildConfigField("String", "NEWS_API_KEY", "\"${envProperties["NEWS_API_KEY"]}\"")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {
    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.lifecycleRuntimeKtx)
    implementation(Dependencies.AndroidX.activityCompose)

    implementation(platform(Dependencies.Compose.bom))
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.graphics)
    implementation(Dependencies.Compose.toolingPreview)
    implementation(Dependencies.Compose.material3)

    testImplementation(Dependencies.Testing.junit)
    androidTestImplementation(Dependencies.Testing.testJunit)
    androidTestImplementation(Dependencies.Testing.espresso)
    androidTestImplementation(platform(Dependencies.Compose.bom))
    androidTestImplementation(Dependencies.Compose.testJunit4)

    debugImplementation(Dependencies.Compose.tooling)
    debugImplementation(Dependencies.Compose.testManifest)
    //
    implementation(project(Modules.utilities))

    //hilt
    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltAndroidCompiler)
    implementation(Dependencies.navigationCompose)

    //retrofit
    // Retrofit Core
    implementation(Dependencies.retrofit)

    // OkHttp Core and Logging
    implementation(Dependencies.okhttp)
    implementation(Dependencies.loggingInterceptor)

    // JSON Converters
    implementation(Dependencies.gsonConverter)
    implementation(Dependencies.moshi)
    implementation(Dependencies.moshiConverter)
}
kapt{
    correctErrorTypes = true
}
