plugins {
    id("com.android.application")
}

android {
    namespace = "net.drwilco.spotlight"
    compileSdk = 36

    defaultConfig {
        applicationId = "net.drwilco.spotlight"
        minSdk = 34
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
