package com.example.calculadorasimples

class Calcular {
        fun somar(N1 : Int, N2 : Int): Int{
            val result =  N1 + N2
            return(result)
        }

        fun multiplicar(N1 : Int, N2 : Int): Int
        {
            val result = N1 * N2
            return(result)
        }

        fun dividir(N1 : Int, N2 : Int): Int
        {
            val result = N1 / N2
            return(result)
        }

        fun subtrair(N1 : Int, N2 : Int): Int{
            val result = N1 - N2
            return(result)
        }
}