package com.simplemobiletools.contacts.pro.activities

import android.os.Bundle
import com.simplemobiletools.commons.extensions.checkAppSideloading
import com.simplemobiletools.commons.extensions.updateTextColors
import com.simplemobiletools.contacts.pro.R
import kotlinx.android.synthetic.main.activity_call.*

class CallActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        if (checkAppSideloading()) {
            return
        }
    }

    override fun onResume() {
        super.onResume()
        updateTextColors(call_holder)
    }
}
