package com.esafirm.imagepicker.features.camera

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.esafirm.imagepicker.features.common.BaseConfig

interface CameraModule {
    fun getCameraIntent(context: Context, config: BaseConfig, bundle: Bundle?): Intent?
    fun getImage(context: Context, intent: Intent?, imageReadyListener: OnImageReadyListener?)
    fun removeImage()
}