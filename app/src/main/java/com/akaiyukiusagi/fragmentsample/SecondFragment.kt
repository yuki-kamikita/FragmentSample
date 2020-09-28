package com.akaiyukiusagi.fragmentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.akaiyukiusagi.fragmentsample.databinding.ActivitySecondFragmentBinding
import androidx.databinding.DataBindingUtil

class SecondFragmentActivity : Fragment() {
    private lateinit var binding: ActivitySecondFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // DataBindingでlayoutにアクセスする build.gradle(:app)にdataBinding追加　//
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.activity_second_fragment,
            container,
            false)
        binding.secondText.text = "hogehoge"

        return binding.root
    }
}