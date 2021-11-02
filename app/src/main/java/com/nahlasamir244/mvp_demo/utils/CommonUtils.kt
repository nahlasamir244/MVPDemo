package com.nahlasamir244.mvp_demo.utils

import java.util.regex.Matcher
import java.util.regex.Pattern

class CommonUtils {
    companion object {
        private const val EMAIL_PATTERN =
            ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
        fun isEmailValid(email: String): Boolean {
            val pattern:Pattern = Pattern.compile(EMAIL_PATTERN)
            val matcher: Matcher = pattern.matcher(email)
            return matcher.matches()
        }
    }
}