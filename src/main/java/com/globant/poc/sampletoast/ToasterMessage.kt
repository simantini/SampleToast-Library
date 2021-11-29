package com.globant.poc.sampletoast

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    public fun displayToastMessage(c: Context, msg: String) {
        Toast.makeText(c,msg,Toast.LENGTH_LONG)
    }
}