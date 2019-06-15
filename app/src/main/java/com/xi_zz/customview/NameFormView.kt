package com.xi_zz.customview

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class NameFormView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.view_name_form, this)
        orientation = HORIZONTAL
    }
}
