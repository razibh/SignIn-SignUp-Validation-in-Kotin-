package Helper

import android.text.TextUtils

class Helper {
    fun IsValidEmail(email: String): Boolean{
        if (TextUtils.isEmpty(email)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }
    }
}