object Dependencies {
    object AndroidX {
        val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
        val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}" }
        val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    }

    object Compose {
        val bom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }
        val ui by lazy { "androidx.compose.ui:ui" }
        val graphics by lazy { "androidx.compose.ui:ui-graphics" }
        val toolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
        val material3 by lazy { "androidx.compose.material3:material3" }
        val tooling by lazy { "androidx.compose.ui:ui-tooling" }
        val testJunit4 by lazy { "androidx.compose.ui:ui-test-junit4" }
        val testManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
    }

    object Testing {
        val junit by lazy { "junit:junit:${Versions.junit}" }
        val testJunit by lazy { "androidx.test.ext:junit:${Versions.testJunit}" }
        val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    }

    //hilt
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hilt}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }

    val compiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltNavigationCompose}" }
    val navigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}" }

    //retrofit
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp}" }
    val gsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}" }
    val moshi by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshi}" }
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}" }
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}" }

}

object Modules {
//    const val app = ":app"
    const val utilities = ":utilities"
}