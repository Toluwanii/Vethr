package com.codose.vethr.utils

import java.util.regex.Pattern

object Validation {
    fun isValidName(name: String): Boolean {
        return name.isNotEmpty()
    }

    fun isValidEmail(email: String): Boolean {
        val regex = ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
        val pattern = Pattern.compile(regex)
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }

    fun isValidPhoneNo(phoneNo: String?): Boolean {
        return phoneNo != null && phoneNo.length >= 10
    }

    fun isValidPassword(pass: String?): Boolean {
        return pass != null && pass.length >= 8
    }
}