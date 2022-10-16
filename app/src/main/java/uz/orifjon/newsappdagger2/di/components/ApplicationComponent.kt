package uz.orifjon.newsappdagger2.di.components

import dagger.Component
import uz.orifjon.newsappdagger2.di.modules.NetworkModule
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface ApplicationComponent {

}