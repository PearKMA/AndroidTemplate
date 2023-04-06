import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    alias(libs.plugins.com.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.androidx.navigation.safeargs)
    alias(libs.plugins.com.dagger.hilt)
    alias(libs.plugins.com.google.services)
    alias(libs.plugins.com.firebase.crashlytics)
    kotlin("kapt")
}

//val key: String = gradleLocalProperties(rootDir).getProperty("")

android {
    namespace = "com.testarossa.android_template"
    compileSdk = libs.versions.compile.sdk.version.get().toInt()

    defaultConfig {
        applicationId = "com.testarossa.android_template"
        minSdk = libs.versions.min.sdk.version.get().toInt()
        targetSdk = libs.versions.target.sdk.version.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        buildConfigField("String", "WEATHER_URL", "\"" + key + "\"")
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
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        dataBinding = true
    }

    lint {
        disable += "UnusedResources"
    }
}

dependencies {
    implementation(projects.base)

    coreLibraryDesugaring(libs.desugar)
    kapt(libs.hilt.compiler)
    kapt(libs.glide.compiler)
    kapt(libs.room.compiler)

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.sdp)
    implementation(libs.ssp)
    implementation(libs.fragment.ktx)
    implementation(libs.viewmodel)
    implementation(libs.lifecycle.runtime)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.recyclerview)
    implementation(libs.viewpager2)
    implementation(libs.coroutines)
    implementation(libs.coroutines.core)
    implementation(libs.glide)
    implementation(libs.glide.webp)
    implementation(libs.datastore)
    implementation(libs.timber)
    implementation(platform(libs.firebase.bom))
    implementation(libs.crashlytics)
    implementation(libs.analytics)
    implementation(libs.configs)
    implementation(libs.hilt)
    implementation(libs.lottie)
    implementation(libs.exo.core)
    implementation(libs.exo.ui)
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    implementation(libs.retrofit)
    implementation(libs.gson)

    testImplementation(libs.junit)
    androidTestImplementation(libs.truth)
    testImplementation(libs.truth)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.core.test)
    androidTestImplementation(libs.runner)
}

kapt {
    correctErrorTypes = true
}