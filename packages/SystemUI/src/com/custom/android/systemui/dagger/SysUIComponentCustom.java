package com.custom.android.systemui.dagger;

import com.android.systemui.dagger.DefaultComponentBinder;
import com.android.systemui.dagger.DependencyProvider;
import com.android.systemui.dagger.SysUISingleton;
import com.android.systemui.dagger.SystemUIBinder;
import com.android.systemui.dagger.SysUIComponent;
import com.android.systemui.dagger.SystemUIModule;

import com.custom.android.systemui.keyguard.KeyguardSliceProviderCustom;
import com.custom.android.systemui.smartspace.KeyguardSmartspaceController;

import dagger.Subcomponent;

@SysUISingleton
@Subcomponent(modules = {
        DefaultComponentBinder.class,
        DependencyProvider.class,
        SystemUIBinder.class,
        SystemUIModule.class,
        SystemUICustomModule.class})
public interface SysUIComponentCustom extends SysUIComponent {
    @SysUISingleton
    @Subcomponent.Builder
    interface Builder extends SysUIComponent.Builder {
        SysUIComponentCustom build();
    }

    /**
     * Member injection into the supplied argument.
     */
    void inject(KeyguardSliceProviderCustom keyguardSliceProviderCustom);

    @SysUISingleton
    KeyguardSmartspaceController createKeyguardSmartspaceController();
}
