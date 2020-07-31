package com.pavelrekun.rekado.services.extensions

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import com.pavelrekun.penza.services.extensions.asString
import com.pavelrekun.rekado.R

const val NAVIGATION_TYPE = "NAVIGATION_TYPE"
const val NAVIGATION_TITLE = "NAVIGATION_TITLE"

const val NAVIGATION_DESTINATION_UNKNOWN = -1
const val NAVIGATION_DESTINATION_ABOUT = 0
const val NAVIGATION_DESTINATION_SETTINGS = 1
const val NAVIGATION_DESTINATION_TRANSLATORS = 2
const val NAVIGATION_DESTINATION_TOOLS_SERIAL_CHECKER = 3

fun NavController.openAboutScreen() {
    val bundle = Bundle().apply {
        putInt(NAVIGATION_TYPE, NAVIGATION_DESTINATION_ABOUT)
        putString(NAVIGATION_TITLE, R.string.navigation_about.asString())
    }

    this.navigate(R.id.navigationContainerSecondary, bundle)
}

fun NavController.openSettingsScreen() {
    val bundle = Bundle().apply {
        putInt(NAVIGATION_TYPE, NAVIGATION_DESTINATION_SETTINGS)
        putString(NAVIGATION_TITLE, R.string.navigation_settings.asString())
    }

    this.navigate(R.id.navigationContainerSecondary, bundle)
}

fun NavController.openSettingsAppearanceThemesScreen() {
    navigate(R.id.navigation_settings_appearance_themes, null, prepareAnimations())
}

fun NavController.openToolsSerialCheckerScreen() {
    val bundle = Bundle().apply {
        putInt(NAVIGATION_TYPE, NAVIGATION_DESTINATION_TOOLS_SERIAL_CHECKER)
        putString(NAVIGATION_TITLE, R.string.navigation_serial_checker.asString())
    }

    this.navigate(R.id.navigationContainerSecondary, bundle)
}

fun NavController.openTranslatorsScreen() {
    val bundle = Bundle().apply {
        putInt(NAVIGATION_TYPE, NAVIGATION_DESTINATION_TRANSLATORS)
        putString(NAVIGATION_TITLE, R.string.navigation_translators.asString())
    }

    this.navigate(R.id.navigationContainerSecondary, bundle)
}

fun prepareAnimations(): NavOptions {
    return NavOptions.Builder()
            .setEnterAnim(R.anim.nav_default_enter_anim)
            .setExitAnim(R.anim.nav_default_exit_anim)
            .setPopEnterAnim(R.anim.nav_default_pop_enter_anim)
            .setPopExitAnim(R.anim.nav_default_pop_exit_anim)
            .build()
}