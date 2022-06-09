package com.example.geziuygulamasi

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.Adapters.CommentAdapter
import com.example.geziuygulamasi.databinding.ActivityDetayBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class DetayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBinding
    private lateinit var auth : FirebaseAuth
    private lateinit var db: FirebaseDatabase
    private lateinit var reference : DatabaseReference
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter : CommentAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()
        db = FirebaseDatabase.getInstance()
        reference = db.getReference("Users")

        recyclerView = binding.recyclerViewDetay

        var index = intent.getStringExtra("index")
        binding.btnSend.setOnClickListener{
            sendData(index)
        }
        getData()
    }

    private fun sendData(index: String?){
        var comment = binding.commentEditText.text.toString().trim()
        var puan = binding.ratingBar.rating
        if(comment != ""){
            var email = auth.currentUser!!.email.toString().trim()
            if(email.isNotEmpty() && comment.isNotEmpty()){
                var model =  UserModal(email,comment,puan,index)
                var id = reference.push().key

                reference.child(id!!).setValue(model)
                binding.commentEditText.setText("")
            }
        }



    }

    private fun getData(){
        reference.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                var list = ArrayList<UserModal>()
                for(data in snapshot.children){
                    var model = data.getValue(UserModal::class.java)
                    list.add(model as UserModal)
                }
                if (list.size >0){
                    recyclerView = binding.recyclerViewDetay
                    adapter = CommentAdapter(list)

                    recyclerView.layoutManager = LinearLayoutManager(
                        this@DetayActivity,
                        LinearLayoutManager.VERTICAL,
                        false
                    )
                    recyclerView.setHasFixedSize(true)
                    recyclerView.adapter = adapter

                }
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("cancel",error.toString())
            }

        })
    }

}