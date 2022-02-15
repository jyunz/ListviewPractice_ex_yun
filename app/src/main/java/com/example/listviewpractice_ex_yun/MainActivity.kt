package com.example.listviewpractice_ex_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice_ex_yun.adapters.FriendsAdapter
import com.example.listviewpractice_ex_yun.datas.Friends
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mFriendsList = ArrayList<Friends>()

    lateinit var mAdapter : FriendsAdapter


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

//        만들어둔 어댑터를 리스트와 액티비티에서 연결 위에서 멤버변수 먼저 만들기
//        리스트를 다 더해서 채운 다음에 실행하기 때문에 lateinit var mAdapter
//        이퀄이 아니라 나중에 넣을 거라 :해줌.

//        어댑터 클래스를 객체화
//        어댑터 변수 = 어댑터클래스(this, R.layout.~list_item, 목록변수 이름)
        mAdapter = FriendsAdapter(this,R.layout.friend_list_item, mFriendsList)

        friendsListView.adapter = mAdapter
    }
}