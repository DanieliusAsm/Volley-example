package io.visiogen.volleyproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import kotlin.jvm.javaClass
/**
 * Created by Danielius on 2018-05-23.
 */
class MainKotlinActivity : AppCompatActivity() {

    var ip:TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ip = findViewById(R.id.tv_ip)
        ip?.text = "hi"

        val url:String ="http://services.runescape.com/m=itemdb_rs/api/catalogue/items.json?category=1&alpha=a&page=1"
        val requestQueue:RequestQueue = Volley.newRequestQueue(this)

        val request:StringRequest = StringRequest(Request.Method.GET,url,
                Response.Listener<String>(){ response ->
                    var gson = Gson()
                    var items:ItemsInCategory = gson.fromJson(response,ItemsInCategory::class.java)
                    ip?.text = items.getItems()?.get(0)?.getId()
                },
                Response.ErrorListener(){error -> ip?.text = error.toString()})

        requestQueue.add(request)
    }
}