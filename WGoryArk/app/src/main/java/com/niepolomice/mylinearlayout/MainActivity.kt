package com.niepolomice.mylinearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.niepolomice.mylinearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var licznik = 0 //
    private lateinit var bind:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btnLike.setOnClickListener {
            licznik++
            UpdateLikes(bind.likeNumber)
        }
        bind.btnReset.setOnClickListener {
            licznik = if (licznik>0) licznik-1 else licznik
            UpdateLikes(bind.likeNumber)
        }
        val sharePref = getSharedPreferences("myPref", MODE_PRIVATE);
        val editor = sharePref.edit();
        licznik = sharePref.getInt("licznik",0);
        UpdateLikes(bind.likeNumber);
        bind.btnSave.setOnClickListener {
            editor.putInt("licznik",licznik);
            editor.apply();
            Toast.makeText(this@MainActivity,"Zapisano",Toast.LENGTH_SHORT).show();
        }
    }
    fun UpdateLikes(view:TextView){
        view.text =  licznik.toString()+" polubień";
    }
}