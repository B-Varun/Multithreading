package com.hotel.order.preparation.time;

public class OrderPreparationTime{
 public static int getTime(String str){
  int time=0;
  switch(str.toUpperCase()){
    case "PASTA":
	time = 10;
    case "FRIES":
	time = 5;
    case "SPAGHETTI":
	time = 10;
    case "BOBA":
	time = 8;
    case "ICE CREAM":
	time = 6;
    case "BURGER":
	time = 7;
 }
    return time;
 }
}