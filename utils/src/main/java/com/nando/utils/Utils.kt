package com.nando.utils

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment

object Utils {

    fun toDp(int: Int): Int = (int / Resources.getSystem().displayMetrics.density).toInt()
    fun toDp(double: Double): Double = double / Resources.getSystem().displayMetrics.density

    fun toPx(int: Int): Int = (int * Resources.getSystem().displayMetrics.density).toInt()
    fun toPx(double: Double): Double = double * Resources.getSystem().displayMetrics.density

    fun hideKeyboard(activity: Activity) {
        val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(activity.currentFocus?.windowToken, 0)
    }

    fun hideKeyboard(fragment: Fragment) {
        val imm = fragment.requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(fragment.requireActivity().currentFocus?.windowToken, 0)
    }

    fun showKeyboard(activity: Activity, view: View) {
        val imm: InputMethodManager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
    }

    fun showKeyboard(fragment: Fragment, view: View) {
        val imm: InputMethodManager = fragment.requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
    }
}