package com.example.listviewpractice_ex_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice_ex_yun.datas.Friends

class MainActivity : AppCompatActivity() {

    val mFriendsList = ArrayList<Friends>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFriendsList.add(Friends("김영일", "010-0101-0101", 2001))
        mFriendsList.add(Friends("박영이", "010-0202-0202", 2002))
        mFriendsList.add(Friends("이영삼", "010-0303-0303", 2003))
        mFriendsList.add(Friends("최영사", "010-0404-0404", 2004))
        mFriendsList.add(Friends("정영오", "010-0505-0505", 2005))
        mFriendsList.add(Friends("조영육", "010-0606-0606", 2006))
        mFriendsList.add(Friends("곽영칠", "010-0707-0707", 2007))
    }
}