package jp.techacademy.jiro.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import jp.techacademy.jiro.calcapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //editText1とeditText２に数字を入力のうえ、ボタン１（足し算ボタン）を押したら、足し算用の関数を呼び出す。
        //数字未入力の場合はToastでアラートを出す、数字入力がある場合は計算へ
        binding.button1.setOnClickListener{
            val input1 = binding.editText1.text.toString()
            val input2 = binding.editText2.text.toString()
            if(input1.isEmpty()|| input2.isEmpty()) {
                Toast.makeText(this, "数字が入力されていません", Toast.LENGTH_SHORT).show()
            }else{
                val number1 = input1.toFloat()
                val number2 = input2.toFloat()
                calculation_plus(number1, number2)
            }
        }
        binding.button2.setOnClickListener{
            val input1 = binding.editText1.text.toString()
            val input2 = binding.editText2.text.toString()
            if(input1.isEmpty()|| input2.isEmpty()) {
                Toast.makeText(this, "数字が入力されていません", Toast.LENGTH_SHORT).show()
            }else{
                val number1 = input1.toFloat()
                val number2 = input2.toFloat()
                calculation_minus(number1, number2)
            }
        }

        binding.button3.setOnClickListener{
            val input1 = binding.editText1.text.toString()
            val input2 = binding.editText2.text.toString()
            if(input1.isEmpty()|| input2.isEmpty()) {
                Toast.makeText(this, "数字が入力されていません", Toast.LENGTH_SHORT).show()
            }else{
                val number1 = input1.toFloat()
                val number2 = input2.toFloat()
                calculation_multiple(number1, number2)
            }
        }

        binding.button4.setOnClickListener{
            val input1 = binding.editText1.text.toString()
            val input2 = binding.editText2.text.toString()
            if(input1.isEmpty()|| input2.isEmpty()) {
                Toast.makeText(this, "数字が入力されていません", Toast.LENGTH_SHORT).show()
            }else{
                val number1 = input1.toFloat()
                val number2 = input2.toFloat()
                calculation_division(number1, number2)
            }
        }
    }
    //足し算＋intentの関数
    fun calculation_plus(factor1:Float,factor2:Float) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE", "${factor1 + factor2}".toFloat())
        startActivity(intent)
    }
    //引き算＋intentの関数
    fun calculation_minus(factor1:Float,factor2:Float) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE", "${factor1 - factor2}".toFloat())
        startActivity(intent)
    }
    //掛け算＋intentの関数
    fun calculation_multiple(factor1:Float,factor2:Float) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE", "${factor1 * factor2}".toFloat())
        startActivity(intent)
    }
    //割り算＋intentの関数
    fun calculation_division(factor1:Float,factor2:Float) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE", "${factor1 / factor2}".toFloat())
        startActivity(intent)
    }
}
