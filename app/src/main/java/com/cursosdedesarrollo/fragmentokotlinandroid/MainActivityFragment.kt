package com.cursosdedesarrollo.fragmentokotlinandroid



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = getView()?.findViewById<View>(R.id.button) as TextView
        val texto = getView()?.findViewById<View>(R.id.texto) as TextView
        button.setOnClickListener {
            texto.text = getString(R.string.main_fragment_text)
        }
    }


}
