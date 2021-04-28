package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriend(nama = "Stefani Ferdiana Pambudi", jkel = "Perempuan", email = "fani@gmail.com",
            telp = "08579421289", alamat = "Tulungagung")
        )
        listTeman.add(MyFriend(nama = "Yohana Septia Putri", jkel = "Perempuan", email = "hanajojotkj@gmail.com",
            telp = "08154679514", alamat = "L.A.Sucipto"))
        listTeman.add(MyFriend(nama = "Widya Retnaning Pratiwi", jkel = "Perempuan", email = "tiwi@gmail.com",
            telp = "08257164864", alamat = "Donomulyo"))
        listTeman.add(MyFriend(nama = "Indra Oki Sandi", jkel = "Laki-laki", email = "indraoki@gmail.com",
            telp = "08945484265", alamat = "Mergan"))
        listTeman.add(MyFriend(nama = "Desi Ratnasari", jkel = "Perempuan", email = "desi@gmail.com",
            telp = "08597449438", alamat = "L.A.Sucipto"))
    }
    private fun tampilTeman(){
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend , container , false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
