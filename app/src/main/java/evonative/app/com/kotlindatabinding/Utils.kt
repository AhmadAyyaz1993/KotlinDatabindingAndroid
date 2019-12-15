package evonative.app.com.kotlindatabinding

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService

object Utils {
    @JvmStatic
    fun hideKeyboard(view: View, c: Context){
        val imm = c.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}