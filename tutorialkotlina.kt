package com.example.myapplication

fun main(){
    println("Podaj napis")
    val tekst = readLine()
    var tekstString = tekst!!.toString()
    val dlugosc = tekst.length
    println("Twój napis ma $dlugosc znaków")
    program2()
}

fun program2(){
    println("Podaj napis")
    var napis = readLine()
    var napisString = napis!!.toString()
    when (napisString){
        "pomidor" -> println("pomidor")
        "truskawka" -> println("truskawka")
        else -> println("To nie jest truskawka ani pomidor.")
    }
}