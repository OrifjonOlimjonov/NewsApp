package uz.orifjon.newsappdagger2.application

import android.app.Application
import uz.orifjon.newsappdagger2.di.components.ApplicationComponent

class App : Application() {

    companion object {
        lateinit var applicationComponent: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()

    }

}