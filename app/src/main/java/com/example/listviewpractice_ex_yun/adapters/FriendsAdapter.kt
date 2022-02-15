package com.example.listviewpractice_ex_yun.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewpractice_ex_yun.datas.Friends

class FriendsAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Friends>) : ArrayAdapter<Friends> (mContext,resId,mList){
//      ㄴ 어댑터의 주 생성자에서 필요한 재료를 받자
//      스튜던트 리스트 아이템과 스튜던트 클래스를 결합하는 것을 여기서 하는것.멤버변수로 생성

    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//    getView는 convertView라는 변수를 가지고 와서 실행하기 때문에 convertView를 검사를 한번 해줌
//    그래서 검사를 위한 내용이 들어감,

        var tempRow = convertView
        if (tempRow == null) {
    }
}