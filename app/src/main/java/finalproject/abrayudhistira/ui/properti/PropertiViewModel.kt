package finalproject.abrayudhistira.ui.properti

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PropertiViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is properti Fragment"
    }
    val text: LiveData<String> = _text
}