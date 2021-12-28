package com.custom.android.systemui;

import android.content.Context;

import com.custom.android.systemui.dagger.DaggerGlobalRootComponentCustom;
import com.custom.android.systemui.dagger.GlobalRootComponentCustom;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class SystemUICustomFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerGlobalRootComponentCustom.builder()
                .context(context)
                .build();
    }
}
