package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculadorasimples.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            calculator()
            val toast = Toast.makeText(this, "calculo com sucesso", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
    fun calculator(){
        val EditText1 = binding.EditText1
        val EditText2 = binding.EditText2
        val selectedid = binding.RadioGroup.checkedRadioButtonId

        val N1 = EditText1.text.toString().toFloat()
        val N2 = EditText2.text.toString().toFloat()

        val tipcalculate = when (selectedid){
            R.id.RadioButton1 -> Calcular().somar(N1, N2)
            R.id.RadioButton2 -> Calcular().multiplicar(N1, N2)
            R.id.RadioButton3 -> Calcular().dividir(N1, N2)
            else -> Calcular().subtrair(N1, N2)

        }

        val tipResult = DecimalFormat().format(tipcalculate)
        binding.TextView2.text = tipResult
    }
}