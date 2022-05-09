package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.ktx.hookBeforeMethod

class SkyCheckHelper {

    fun init() {
        try {
            "com.miui.gallery.editor_common.libs.SkyCheckHelper".hookBeforeMethod("isSupportTextYanhua") {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}