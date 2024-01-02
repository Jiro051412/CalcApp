package jp.techacademy.jiro.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD
import androidx.appcompat.app.AlertDialog
=======
import android.widget.Toast
>>>>>>> fea793a (課題４（UI）再提出)
import jp.techacademy.jiro.calcapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //editText1とeditText２に数字を入力のうえ、ボタン１（足し算ボタン）を押したら、足し算用の関数を呼び出す。
<<<<<<< HEAD
        //数字未入力の場合はアラートを出す設定にしたがったが上手くアラートが出ず。
        binding.button1.setOnClickListener{
            val input1 = binding.editText1.text.toString().toFloat()
            val input2 = binding.editText2.text.toString().toFloat()
            if(input1 !=null && input2 !=null) {
                calculation_plus(input1, input2)
            } else{
                showAlertDialog()
            }
        }
        //editText1とeditText２に数字を入力のうえ、ボタン２（引き算ボタン）を押したら、引き算用の関数を呼び出す。
        //数字未入力の場合はアラートを出す設定にしたがったが上手くアラートが出ず。
        binding.button2.setOnClickListener{
            val input1 = binding.editText1.text.toString().toFloat()
            val input2 = binding.editText2.text.toString().toFloat()
            if(input1 !=null && input2 !=null) {
                calculation_minus(input1, input2)
            } else{
                showAlertDialog()
            }
        }
        //editText1とeditText２に数字を入力のうえ、ボタン３（掛け算ボタン）を押したら、掛け算用の関数を呼び出す
        //数字未入力の場合はアラートを出す設定にしたがったが上手くアラートが出ず。
        binding.button3.setOnClickListener{
            val input1 = binding.editText1.text.toString().toFloat()
            val input2 = binding.editText2.text.toString().toFloat()
            if(input1 !=null && input2 !=null) {
                calculation_multiple(input1, input2)
            } else{
                showAlertDialog()
            }
        }
        //editText1とeditText２に数字を入力のうえ、ボタン４（割り算ボタン）を押したら、割り算用の関数を呼び出す
        //数字未入力の場合はアラートを出す設定にしたがったが上手くアラートが出ず。
        binding.button4.setOnClickListener{
            val input1 = binding.editText1.text.toString().toFloat()
            val input2 = binding.editText2.text.toString().toFloat()
            if(input1 !=null && input2 !=null) {
                calculation_division(input1, input2)
            } else{
                showAlertDialog()
=======
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
>>>>>>> fea793a (課題４（UI）再提出)
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
<<<<<<< HEAD
    //数字が未入力の場合にアラートを出すための関数
    private fun showAlertDialog(){
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("注意")
        alertDialogBuilder.setMessage("入力漏れがあります")
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
=======
>>>>>>> fea793a (課題４（UI）再提出)
}
