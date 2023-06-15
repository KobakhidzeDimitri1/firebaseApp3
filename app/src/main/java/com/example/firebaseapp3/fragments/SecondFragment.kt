package com.example.firebaseApp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firebaseapp3.R
import com.example.firebaseapp3.databinding.FragmentFirstBinding
import com.example.firebaseapp3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var _binding : FragmentSecondBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.text1.text = SecondFragmentArgs.fromBundle(requireArguments()).name
        binding.text2.text = SecondFragmentArgs.fromBundle(requireArguments()).description
    }


}