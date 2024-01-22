package fr.thomasbernard03.movizz.common.android

import android.content.Context
import androidx.annotation.StringRes
import org.koin.java.KoinJavaComponent

class ResourcesHelper(
    private val context: Context = KoinJavaComponent.get(Context::class.java),
) {
    fun getString(@StringRes stringId: Int, formatArgs: Any? = null)
            = context.getString(stringId, formatArgs)
}