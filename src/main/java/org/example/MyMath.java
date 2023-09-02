package org.example;

public class MyMath {
     public static final double PI = 3.141592653589793;
     public static final double E = 2.718281828459045;

     // вычисление тангенса
     public static double tg(double degrees){

          return sin(degrees)/cos(degrees);
     }

     // вычисление косинуса
     public static double cos(double degrees){

          double sin = sin(degrees);
          return  Math.sqrt(1- sin * sin);  //использование библиотеки Math, простите((
     }

     // вычисление синуса
     public static double sin(double degrees){

          double radians = toRadians(degrees);
          double sin = 0;
          double progress = radians;

          // разложение в ряд Тейлора для синуса, точность +-0.0001
          for (int i = 1; i <= 10; i++){
               sin += progress;
               progress *= -(radians * radians)/((2 * i)*(2 * i + 1));
          }

          return sin;
     }

     // вычисление площади окружности
     public static double areaCircle(double radius){

          return PI * (radius * radius);
     }

     // вычисление длинны окружности
     public static double lengthCircle(double radius){

          return 2 * PI * radius;
     }

     // перевод из градусов в радианы
     public static double toRadians(double degrees){

          return degrees * (PI/180);
     }

     // метод псевдорандома с помощью использования значения счетчика высокоточного таймера
     public static int random(int max){
         return (int) ((System.nanoTime()/9) % max+1);
     }

     // переопределён метод рандом и выдаёт значения от 0 до 9
     public static int random(){
          return (int) ((System.nanoTime()/9%99)%10);
     }

}
