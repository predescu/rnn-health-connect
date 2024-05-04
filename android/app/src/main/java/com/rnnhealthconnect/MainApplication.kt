package com.rnnhealthconnect

import com.facebook.react.PackageList
import com.facebook.react.ReactPackage

import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.react.NavigationReactNativeHost;

class MainApplication : NavigationApplication() {

    private val mReactNativeHost: NavigationReactNativeHost =
            object : NavigationReactNativeHost(this) {
                override fun getPackages(): List<ReactPackage> =
                        PackageList(this).packages.apply {
                            // Packages that cannot be autolinked yet can be added manually here, for example:
                            // add(MyReactNativePackage())
                        }

                override fun getJSMainModuleName(): String = "index"

                override fun getUseDeveloperSupport(): Boolean = BuildConfig.DEBUG

                override val isNewArchEnabled: Boolean = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED
                override val isHermesEnabled: Boolean = BuildConfig.IS_HERMES_ENABLED
            }

    override val reactNativeHost: NavigationReactNativeHost
        get() = mReactNativeHost

}
