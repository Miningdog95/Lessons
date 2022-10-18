package com.company;

    class Solution {
        public static void main(String[] args) {
            int nums[] = new int[4];

            try {
                System.out.println("begin");
              nums [7] =10;
            }
            catch (ArrayIndexOutOfBoundsException w) {
                System.out.println("not");
            }
        }
    }





