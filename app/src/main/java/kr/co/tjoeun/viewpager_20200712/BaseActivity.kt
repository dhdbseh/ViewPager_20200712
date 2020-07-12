package kr.co.tjoeun.viewpager_20200712

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
            //AppCompatActivity를 상속해줄거야
    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()


}