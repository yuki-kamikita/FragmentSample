package com.akaiyukiusagi.fragmentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //FirstFragmentActivityクラスをインスタンス化その下も同様。
        val firstFragment = FirstFragmentActivity()
        val secondFragment = SecondFragmentActivity()
        //buttonをクリックしたときにreplaceFragmentメソッドを実行
        firstButton.setOnClickListener {
            replaceFragment(firstFragment)
        }
        secondButton.setOnClickListener {
            replaceFragment(secondFragment)
        }
    }
    //R.id.containerに引数で渡されたフラグメントを入れる。
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }
}

// 出典：https://qiita.com/daichi77/items/09119cdba435ead4a08c