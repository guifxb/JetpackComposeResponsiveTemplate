package com.example.emptyresizableactivitycompose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember

@Composable
fun ProvideAppDimensionsAndOrientation(
    appDimensions: Dimensions,
    appOrientation: Orientation,
    content: @Composable () -> Unit,
) {
    val dimensionSet = remember { appDimensions }
    val orientation = remember { appOrientation }
    CompositionLocalProvider(
        LocalAppDimensions provides dimensionSet,
        LocalOrientation provides orientation,
        content = content
    )
}

val LocalAppDimensions = compositionLocalOf { smallDimensions }
val LocalOrientation = compositionLocalOf { Orientation.Portrait }