package com.baileninformacion.ejercicionavigationcomponent.Fragments

import android.os.Bundle
import android.text.Layout.Directions
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.baileninformacion.ejercicionavigationcomponent.R
import com.baileninformacion.ejercicionavigationcomponent.databinding.FragmentPrimerBinding

class PrimerFragment : Fragment() {
    private lateinit var binding : FragmentPrimerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrimerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSegundaPantalla.setOnClickListener{
            val navController = Navigation.findNavController(it)
            if(!binding.txtNumero.text.toString().isEmpty() && !binding.txtTexto.text.toString().isEmpty()){
                var datos = Bundle()
                datos.putString("texto",binding.txtTexto.text.toString())
                datos.putString("numero", binding.txtNumero.text.toString())
                navController.navigate(R.id.action_primerFragment_to_segundoFragment,datos)
            }else{
                Toast.makeText(activity,"Debe Rellenar Todos Los Campos",Toast.LENGTH_LONG).show()
            }
        }
    }
}