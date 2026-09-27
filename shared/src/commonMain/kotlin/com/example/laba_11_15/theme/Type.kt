package com.example.laba_11_15.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import laba_1115.shared.generated.resources.Res
import laba_1115.shared.generated.resources.*
import org.jetbrains.compose.resources.Font

@Composable
fun BodyFontFamily() = FontFamily(
    Font(
        Res.font.Abel_Regular,
        weight = FontWeight.Normal
    )
)

@Composable
fun DisplayFontFamily() = FontFamily(
    Font(
        Res.font.Abel_Regular,
        weight = FontWeight.Normal
    )
)

@Composable
fun AppTypography(): Typography {

    val bodyFont = BodyFontFamily()
    val displayFont = DisplayFontFamily()
    val baseline = Typography()

    return Typography(
        displayLarge = baseline.displayLarge.copy(fontFamily = displayFont),
        displayMedium = baseline.displayMedium.copy(fontFamily = displayFont),
        displaySmall = baseline.displaySmall.copy(fontFamily = displayFont),

        headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFont),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFont),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFont),

        titleLarge = baseline.titleLarge.copy(fontFamily = displayFont),
        titleMedium = baseline.titleMedium.copy(fontFamily = displayFont),
        titleSmall = baseline.titleSmall.copy(fontFamily = displayFont),

        bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFont),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFont),
        bodySmall = baseline.bodySmall.copy(fontFamily = bodyFont),

        labelLarge = baseline.labelLarge.copy(fontFamily = bodyFont),
        labelMedium = baseline.labelMedium.copy(fontFamily = bodyFont),
        labelSmall = baseline.labelSmall.copy(fontFamily = bodyFont),
    )
}