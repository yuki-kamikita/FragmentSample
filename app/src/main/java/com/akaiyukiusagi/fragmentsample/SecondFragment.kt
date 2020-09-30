package com.akaiyukiusagi.fragmentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.akaiyukiusagi.fragmentsample.databinding.ActivitySecondFragmentBinding
import kotlinx.android.synthetic.main.activity_second_fragment.*


class SecondFragmentActivity : Fragment() {
    private lateinit var binding: ActivitySecondFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // DataBindingでlayoutにアクセスする build.gradle(:app)にdataBinding追加 //
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.activity_second_fragment,
            container,
            false)
        binding.secondText.text = "hogehoge"

        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        val thirdFragment = ThirdFragmentActivity()

        // ThirdFragmentに遷移 FragmentからFragment呼び出し
        button2.setOnClickListener {
            val fragmentManager: FragmentManager? = fragmentManager // Activityの時はここが supportFragmentManager だった
            if (fragmentManager != null) {
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.replace(R.id.container, thirdFragment)
                fragmentTransaction.commit()
            }
        }

    }
}