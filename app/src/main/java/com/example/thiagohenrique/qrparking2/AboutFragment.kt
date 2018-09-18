package com.example.thiagohenrique.qrparking2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.*

class AboutFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_about, null)

        val view = inflater.inflate(R.layout.fragment_about, null)


        val recyclerView = view.findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(getContext(), LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("Como Funciona"))
        users.add(User("Pagamento"))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter

    }


}