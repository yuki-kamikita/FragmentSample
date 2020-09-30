package com.akaiyukiusagi.fragmentsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // class FragmentActivity をインスタンス化
        val firstFragment = FirstFragmentActivity()
        val secondFragment = SecondFragmentActivity()
        val thirdFragment = ThirdFragmentActivity()

        // buttonをクリックしたときにreplaceFragmentメソッドを実行
        firstButton.setOnClickListener {
            replaceFragment(firstFragment)
        }
        secondButton.setOnClickListener {
            replaceFragment(secondFragment)
        }
        thirdButton.setOnClickListener {
            replaceFragment(thirdFragment)
        }

    }

    // 指定したフラグメントを表示する ActivityからFragment呼び出し
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null) // 上に重ねる設定 これを入れると戻るボタンを押すことで戻れるようになる
        fragmentTransaction.replace(R.id.container, fragment) // R.id.containerの位置に引数で渡されたフラグメントを入れる
        fragmentTransaction.commit()
    }
}

// 出典：https://qiita.com/daichi77/items/09119cdba435ead4a08c