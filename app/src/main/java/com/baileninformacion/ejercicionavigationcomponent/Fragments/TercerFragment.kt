package com.baileninformacion.ejercicionavigationcomponent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.baileninformacion.ejercicionavigationcomponent.R
import com.baileninformacion.ejercicionavigationcomponent.databinding.FragmentTercerBinding

class TercerFragment : Fragment() {
    private lateinit var binding:FragmentTercerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTercerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPantallaInicio.setOnClickListener{
            val navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_tercerFragment_to_primerFragment)
        }

    }
}