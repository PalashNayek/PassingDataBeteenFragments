package com.palash.passingdatabeteenfragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.palash.passingdatabeteenfragments.R
import com.palash.passingdatabeteenfragments.databinding.FragmentMainBinding
import com.palash.passingdatabeteenfragments.databinding.FragmentSecondBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    private val args: SecondFragmentArgs by navArgs()
    /*private var name = ""
    private var email = ""*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            binding.tvName.text = args.name
            binding.tvEmail.text = args.email
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}