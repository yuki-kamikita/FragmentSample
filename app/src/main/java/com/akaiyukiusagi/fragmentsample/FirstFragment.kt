package com.akaiyukiusagi.fragmentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_first_fragment.*

class FirstFragmentActivity : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // findViewByIdでlayoutへアクセスする //
        val view = inflater.inflate(R.layout.activity_first_fragment,container,false)
        val text: TextView = view.findViewById(R.id.firstText)
        text.text = "1st text"

        return view
    }

    // onViewCreatedでならsyntheticを使用して書ける
    // もう全部こっちで書いちゃえば基本的には問題なさそう
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textSynthetic.text = "onViewCreatedでならsyntheticを使用して書ける"

        // フラグメントの終了 非表示、と言った方が近いかも
        buttonFinish.setOnClickListener {
            fragmentManager!!.beginTransaction().remove(this).commit()
        }

    }
}