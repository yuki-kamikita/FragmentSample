package com.akaiyukiusagi.fragmentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.akaiyukiusagi.fragmentsample.databinding.ActivitySecondFragmentBinding
import androidx.databinding.DataBindingUtil
import com.akaiyukiusagi.fragmentsample.databinding.ActivityThirdFragmentBinding

class ThirdFragmentActivity : Fragment() {
    private var _binding: ActivityThirdFragmentBinding? = null
    // このプロパティは、onCreateViewとonDestroyViewの間でのみ有効です。
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // ViewBindingでlayoutにアクセスする build.gradle(:app)にviewBinding追加 //
        _binding = ActivityThirdFragmentBinding.inflate(inflater, container, false)
        binding.thirdText.text = "Lupin the Third"

        return binding.root
    }
}

// 出典：https://developer.android.com/topic/libraries/view-binding?hl=ja#activities