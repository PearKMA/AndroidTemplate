package com.testarossa.android_template.utils

import com.testarossa.android_template.R
import timber.log.Timber

typealias AppId = R.id
typealias AppLayout = R.layout
typealias AppStr = R.string
typealias AppFont = R.font
typealias AppColor = R.color
typealias AppDraw = R.drawable


fun Any.log() {
    Timber.tag("Hunglv").d(if (this is String) this else this.toString())
}
