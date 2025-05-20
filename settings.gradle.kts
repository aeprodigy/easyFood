pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()

    }
//    plugins{
//        alias(libs.plugins.android.application) apply false
//        alias(libs.plugins.kotlin.android) apply false
//        alias(libs.plugins.kotlin.compose) apply false
//        alias(libs.plugins.android.library) apply false
//        id("dagger.hilt.android.plugin") apply false
//
//    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "easyFood"
include(":app")
include(":utilities")
