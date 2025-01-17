package finalproject.abrayudhistira.ui.jenisproperti

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import finalproject.abrayudhistira.databinding.FragmentJenisPropertiBinding

class JenisPropertiFragment : Fragment() {

    private var _binding: FragmentJenisPropertiBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val jenisPropertiViewModel =
            ViewModelProvider(this).get(JenisPropertiViewModel::class.java)

        _binding = FragmentJenisPropertiBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textJenisproperti
        jenisPropertiViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}