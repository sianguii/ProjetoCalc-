package com.example.calculadorasimples

class Calcular {
        fun somar(N1 : Float, N2 : Float): Float{
            val result =  N1 + N2
            return(result)
        }

        fun multiplicar(N1 : Float, N2 : Float): Float{
            val result = N1 * N2
            return(result)
        }

        fun dividir(N1 : Float, N2 : Float): Float{
            val result = N1 / N2
            return(result)
        }

        fun subtrair(N1 : Float, N2 : Float): Float{
            val result = N1 - N2
            return(result)
        }
}