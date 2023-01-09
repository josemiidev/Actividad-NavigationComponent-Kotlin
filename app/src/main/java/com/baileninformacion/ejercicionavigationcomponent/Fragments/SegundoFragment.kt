package com.baileninformacion.ejercicionavigationcomponent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.baileninformacion.ejercicionavigationcomponent.R
import com.baileninformacion.ejercicionavigationcomponent.databinding.FragmentPrimerBinding
import com.baileninformacion.ejercicionavigationcomponent.databinding.FragmentSegundoBinding

class SegundoFragment : Fragment() {
    private lateinit var binding : FragmentSegundoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSegundoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val texto = arguments?.getString("texto")
        val numero = arguments?.getString("numero")
        binding.tvNumero.text = "El número es " + numero
        binding.tvTexto.text = "El texto es " + texto

        binding.btnPantallaFinal.setOnClickListener{
            val navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_segundoFragment_to_tercerFragment)
        }

    }

}