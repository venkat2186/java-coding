package org.example;

public class FindMyMissingWithEXOR
{
    public static void main(String[] args) {

        int[] numbers = {1,2,4,5,6};
        int missingNumber = 0;

        for(int no: numbers){
            missingNumber = missingNumber^no;
        }

        for (int i = 0; i <=6 ; i++) {
            missingNumber = missingNumber^i;

        }

        System.out.println(missingNumber);
    }
}
