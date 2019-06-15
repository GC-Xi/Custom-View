package com.xi_zz.customview

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class CustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.view_custom, this)
        setPadding(16, 16, 16, 16)
    }
}