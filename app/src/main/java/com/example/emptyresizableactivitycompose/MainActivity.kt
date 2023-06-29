package com.example.emptyresizableactivitycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.emptyresizableactivitycompose.ui.theme.AppTheme
import com.example.emptyresizableactivitycompose.ui.theme.AppTheme.orient
import com.example.emptyresizableactivitycompose.ui.theme.ResizableAppTheme
import com.example.emptyresizableactivitycompose.ui.theme.Orientation
import com.example.emptyresizableactivitycompose.ui.theme.rememberWindowSize

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowSizeClass = rememberWindowSize()

            ResizableAppTheme(windowSizeClass) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    ResizableTest()
                }
            }
        }
    }


    @Composable
    fun ResizableTest(modifier: Modifier = Modifier) {
        if (orient == Orientation.Portrait){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.android_jetpack_logo),
                    contentDescription = "Android Jetpack",
                    modifier = modifier.size(AppTheme.dimens.imageX, AppTheme.dimens.imageY)
                )
                Spacer(modifier = modifier.size(AppTheme.dimens.medium))
                TextSamples()
            }
        } else {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.android_jetpack_logo),
                    contentDescription = "Android Jetpack",
                    modifier = modifier.size(AppTheme.dimens.imageX, AppTheme.dimens.imageY)
                )
                Spacer(modifier = modifier.size(AppTheme.dimens.medium))
                Column {
                    TextSamples()
                }
            }
        }
    }

    @Composable
    fun TextSamples(modifier: Modifier = Modifier) {
        Spacer(modifier = modifier.size(AppTheme.dimens.large))
        Text(
            text = "Headline Large (${MaterialTheme.typography.headlineLarge.fontSize.value.toInt()}.sp)",
            modifier = modifier,
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(modifier = modifier.size(AppTheme.dimens.medium))
        Text(
            text = "Headline Small (${MaterialTheme.typography.headlineSmall.fontSize.value.toInt()}.sp)",
            modifier = modifier,
            style = MaterialTheme.typography.headlineSmall
        )
        Spacer(modifier = modifier.size(AppTheme.dimens.medium))
        Text(
            text = "Body Large (${MaterialTheme.typography.bodyLarge.fontSize.value.toInt()}.sp)",
            modifier = modifier,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = modifier.size(AppTheme.dimens.medium))
        Text(
            text = "Body Medium (${MaterialTheme.typography.bodyMedium.fontSize.value.toInt()}.sp)",
            modifier = modifier,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}




