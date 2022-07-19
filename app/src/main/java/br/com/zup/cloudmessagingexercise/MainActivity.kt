package br.com.zup.cloudmessagingexercise

import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
        private lateinit var auth: FirebaseAuth

//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_main)
//            if (savedInstanceState == null) {
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow()
//            }
//            auth = Firebase.auth
//            getCurrentMessagingToken()
//            crashButton()
//        }
//
//        private fun crashButton(){
//            val crashButton = Button(this)
//            crashButton.text = getString(R.string.test_crash)
//            crashButton.setOnClickListener {
//                throw RuntimeException("Test Crash") // Force a crash
//            }
//
//            addContentView(crashButton, ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT))
//        }
//
//        private fun getCurrentMessagingToken(){
//            FirebaseMessaging.getInstance().token.addOnCompleteListener(
//                OnCompleteListener { task ->
//                    if (!task.isSuccessful) {
//                        return@OnCompleteListener
//                    }
//                    val token = task.result
//                    Log.d(MyFirebaseMessagingService.TAG, "Token: $token")
//                    Toast.makeText(baseContext, token, Toast.LENGTH_SHORT).show()
//                }
//            )
//        }
//
//        public override fun onStart() {
//            super.onStart()
//            // Check if user is signed in (non-null) and update UI accordingly.
//            val currentUser = auth.currentUser
//            if(currentUser != null){
//                Log.d(MyFirebaseMessagingService.TAG, "usuário logado")
//            }
//
//            val user = Firebase.auth.currentUser
//            user?.let {
//                val name = user.displayName
//                val email = user.email
//                val photoUrl = user.photoUrl
//                val emailVerified = user.isEmailVerified
//                val uid = user.uid
//            }
//            Log.d(MyFirebaseMessagingService.TAG, "user: $user")
//
//            val database = FirebaseDatabase.getInstance()
//            val myRef = database.getReference("message")
//            myRef.setValue("Hello, World!")
//
//            myRef.addValueEventListener(object : ValueEventListener {
//                override fun onDataChange(dataSnapshot: DataSnapshot) {
//                    val value = dataSnapshot.value
//                }
//                override fun onCancelled(error: DatabaseError) {
//                    Log.w(TAG, "Failed to read value.", error.toException())
//                }
//            })
//        }
}
