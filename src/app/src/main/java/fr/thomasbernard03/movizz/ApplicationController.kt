package fr.thomasbernard03.movizz

import android.app.Application
import fr.thomasbernard03.movizz.common.android.ResourcesHelper
import fr.thomasbernard03.movizz.domain.usecases.MovieUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext
import org.koin.dsl.module

class ApplicationController : Application() {
    private val appModule = module {
        single { ResourcesHelper() }

        single { MovieUseCase() }

        // https://developer.android.com/kotlin/coroutines/coroutines-best-practices?hl=fr
        single<CoroutineDispatcher> { Dispatchers.IO }
    }

    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            modules(appModule)
            androidContext(this@ApplicationController)
        }
    }
}