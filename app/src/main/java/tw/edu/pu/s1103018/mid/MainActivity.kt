package tw.edu.pu.s1103018.mid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnContextClickListener
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    lateinit var txv: TextView
    lateinit var btnZero: Button
    var mid:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv=findViewById(R.id.txv)
        txv.text = mid.toString()
        txv.setOnClickListener(this)


        btnZero = findViewById(R.id.btn2)
        btnZero.setOnClickListener(this)

    }

    fun happy(v: View){
        txv.text = (1..100).random().toString()
    }

    override fun onClick(v: View?) {
        if (v==btnZero){
            mid = 0
        }
        else{
            mid++
        }
        txv.text = mid.toString()
    }
}