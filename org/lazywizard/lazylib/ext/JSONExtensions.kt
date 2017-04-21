package org.lazywizard.lazylib.ext

import org.json.JSONObject

fun JSONObject.getFloat(key: String): Float = this.getDouble(key).toFloat()
fun JSONObject.optFloat(key: String): Float = this.optDouble(key).toFloat()
fun JSONObject.optFloat(key: String, defaultValue: Float): Float = this.optDouble(key, defaultValue.toDouble()).toFloat()