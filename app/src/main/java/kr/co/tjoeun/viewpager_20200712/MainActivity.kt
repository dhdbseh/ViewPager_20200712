package kr.co.tjoeun.viewpager_20200712

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.viewpager_20200712.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun setupEvents() {

    }

    override fun setValues() {

        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa

        //탭 레이아웃 + 뷰페이저 연결
        myTabLayout.setupWithViewPager(mainViewPager)

    }
}