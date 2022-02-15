package com.example.listviewpractice_ex_yun.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewpractice_ex_yun.R
import com.example.listviewpractice_ex_yun.datas.Friends

class FriendsAdapter(val mContext : Context, val resId : Int, val mList : ArrayList<Friends>) : ArrayAdapter<Friends> (mContext,resId,mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.friend_list_item, null)

        }

        val row = tempRow!!

        return row

    }


}
