package com.example.task1

sealed class Shape{
    class Circle(var radius:Float):Shape()
    class Square(var length:Int):Shape()
    class Rectangle(var breath:Int,var length:Int):Shape()
    object notAShape :Shape()
}

