package finalproject.abrayudhistira.ui.pemilik

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PemilikViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is pemilik Fragment"
    }
    val text: LiveData<String> = _text
}