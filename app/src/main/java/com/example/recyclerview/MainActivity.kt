package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var ListView : ListView
    private lateinit var UsersAdapter : UsersAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ListView = findViewById(R.id.listview)
        val userList = ArrayList<user>()
        userList.add(user("C Programming", "https://i.pinimg.com/736x/71/5b/59/715b59c8c7545d9dafb1a04111edde40.jpg"))
        userList.add(user("C++","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnaZ2sXeTpse_LITdJYMKzqikFOu5pif_U9Q&usqp=CAU"))
        userList.add(user("Java","https://i.pinimg.com/originals/e9/94/61/e99461fdd5b3db8bdb3081d8acf5e524.png"))
        userList.add(user("Python","https://www.101computing.net/wp/wp-content/uploads/python-logo-1.png"))
        userList.add(user("BootStrap","https://v4-alpha.getbootstrap.com/assets/brand/bootstrap-social-logo.png"))
        userList.add(user("ASP.NET","https://teorema-rd.com/wp-content/uploads/2020/05/ASP-NET-logo-1-1024x576.jpg"))
        userList.add(user("PHP","https://cdn.worldvectorlogo.com/logos/php.svg"))
        userList.add(user("Unix","https://d1yjjnpx0p53s8.cloudfront.net/styles/logo-thumbnail/s3/052011/unix_logo-converted.png?itok=ZQDRl5bT"))

        UsersAdapter = UsersAdapter(this,userList)
        ListView.adapter = UsersAdapter


    }
}