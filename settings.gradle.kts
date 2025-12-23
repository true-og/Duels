pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "Duels"

include(
    "duels-worldguard",
    "duels-worldguard-v6",
    "duels-worldguard-v7",
    "duels-api",
    "duels-plugin"
)

