package finalproject.abrayudhistira.ui.manajerproperti

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import finalproject.abrayudhistira.R

class ManajerPropertiFragment : Fragment() {

    companion object {
        fun newInstance() = ManajerPropertiFragment()
    }

    private val viewModel: ManajerPropertiViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_manajer_properti, container, false)
    }
}