package com.example.listviewpractice_ex_yun.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listviewpractice_ex_yun.datas.Friends

class FriendsAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Friends>) : ArrayAdapter<Friends> (mContext,resId,mList){
    

}