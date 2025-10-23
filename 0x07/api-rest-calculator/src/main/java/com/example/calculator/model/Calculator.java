package com.example.calculator.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {

    public static Double sum(Double number1, Double number2) {
      Double result = 0.0;
      if(number1==null || number2==null){
         throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
      }else{
         result = number1 + number2;
      }
      return result;
    }

    public static Double sub(Double number1, Double number2) {
             Double result = 0.0;
      if(number1==null || number2==null){
         throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
      }else{
         result = number1 - number2;
      }
      return result;
    }

    public static Double divide (Double number1, Double number2)  {
      Double result = 0.0;
      if(number1==null || number2==null){
         throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
      }else{
         if(number2==0){
            throw new ArithmeticException("Divisão por zero não é permitido.");
         }else{
         result = number1 / number2;
         }
         
      }
      return result;

    }

    public static Integer factorial(Integer factorial) {
            Integer result = 1; 

      if(factorial==null || factorial==0){
         throw new NullPointerException("Número é obrigatório.");
      }else{
      
      for(int i = 1; i<=factorial; i++){
         result *= i;
       }
      }

       return result;
          }

        // Exemplos:
    // Integer = 1 -> Binary = 1
    // Integer = 5 -> Binary = 101
    // Integer = 20 -> Binary = 10100
    public static Integer integerToBinary(Integer integer) {
      String result = Integer.toBinaryString(integer);
      return Integer.parseInt(result);
    }   

    // Exemplos:
    // Integer = 1 -> Hexadecimal = "1"
    // Integer = 5 -> Hexadecimal = "37"
    // Integer = 170 -> Binary = "AA"
    public static String integerToHexadecimal(Integer integer) {
      
      return Integer.toHexString(integer);   }

    // Exemplos
    // Date 1 = LocalDate.of(2020, 3, 15);
    // Date 2 = LocalDate.of(2020, 3, 29)
    // Total de dias = 14 
    public static int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
      return (int)ChronoUnit.DAYS.between(date1, date2);
   }

}