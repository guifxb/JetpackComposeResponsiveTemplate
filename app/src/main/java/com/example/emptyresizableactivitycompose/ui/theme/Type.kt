package com.example.emptyresizableactivitycompose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
// Add and/or modify sizes and styles to adjust your needs


val typographySmall = Typography(
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 22.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 20.sp
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 16.sp
    ),
    bodyLarge = TextStyle(
        fontSize = 14.sp
    ),
    bodyMedium = TextStyle(
        fontSize = 12.sp
    ),
    bodySmall = TextStyle(
        fontSize = 10.sp
    ),
)

val typographyCompact = Typography(
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 24.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 22.sp
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 18.sp
    ),
    bodyLarge = TextStyle(
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontSize = 14.sp
    ),
    bodySmall = TextStyle(
        fontSize = 10.sp
    ),
)

val typographyMedium = Typography(
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 32.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 28.sp
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 24.sp
    ),
    bodyLarge = TextStyle(
        fontSize = 22.sp
    ),
    bodyMedium = TextStyle(
        fontSize = 20.sp
    ),
    bodySmall = TextStyle(
        fontSize = 18.sp
    ),
)

val typographyLarge = Typography(
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 36.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 32.sp
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Medium, fontSize = 28.sp
    ),
    bodyLarge = TextStyle(
        fontSize = 26.sp
    ),
    bodyMedium = TextStyle(
        fontSize = 24.sp
    ),
    bodySmall = TextStyle(
        fontSize = 22.sp
    ),
)