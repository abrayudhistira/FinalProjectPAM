package finalproject.abrayudhistira.ui.jenisproperti

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JenisPropertiViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is jenis properti Fragment"
    }
    val text: LiveData<String> = _text
}