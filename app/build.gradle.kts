plugins {
    id("com.android.application")
}

android {
    namespace = "com.docwilco.spotlight"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.docwilco.spotlight"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}
