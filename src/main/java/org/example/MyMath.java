package org.example;

public class MyMath {
     public static final double PI = 3.141592653589793;
     public static final double E = 2.718281828459045;

     // вычисление тангенса
     public static double tan(double degrees){

          return sin(degrees)/cos(degrees);
     }

     // вычисление косинуса
     public static double cos(double degrees){

          double sin = sin(degrees);
          return  sqrt(1- sin * sin);
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
     public static int random(int max, int min){
         return (int) (min + System.nanoTime() % (max - min +1));
     }

     // переопределён метод рандом и выдаёт значения от 0 до 9
     public static int random(){
          return (int) ((System.nanoTime()/9)%10);
     }

     public static double sqrt(double number) {
          double t;
          double squareRoot = number / 2;
          do {
               t = squareRoot;
               squareRoot = (t + (number / t)) / 2;
          } while ((t - squareRoot) != 0);
          return squareRoot;
     }
     // максимальное число из 2 чисел
     public static int max(int a, int b){
          if(a>b){
               return a;
          }
          else return b;
     }
     public static long max(long a, long b){
          if(a>b){
               return a;
          }
          else return b;
     }
     public static double max(double a, double b){
          if(a>b){
               return a;
          }
          else return b;
     }
     public static float max(float a, float b){
          if(a>b){
               return a;
          }
          else return b;
     }
}
