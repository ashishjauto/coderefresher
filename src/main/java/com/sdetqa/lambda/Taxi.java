package com.sdetqa.lambda;



    @FunctionalInterface
    interface  YellowTaxi{
        public  String bookCab(String source,String destination);

    }


    public class Taxi{


        public static void main(String[] args) {
            YellowTaxi taxi=(source, destination)->{
                System.out.println("Yellow Taxi Book for " +source+destination);
                return ("INR 500");
            };

            System.out.println(taxi.bookCab("BLR","IDR"));


        }

    }



