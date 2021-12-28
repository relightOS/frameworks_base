package com.custom.android.systemui.dagger;

import dagger.Module;

/**
 * Dagger module for including the WMComponent.
 */
@Module(subcomponents = {SysUIComponentCustom.class})
public abstract class SysUISubcomponentModuleCustom {
}
