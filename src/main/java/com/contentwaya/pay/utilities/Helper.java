package com.contentwaya.pay.utilities;

import java.util.Random;

public class Helper {
    public static int generateRandom(){
        int min = 20;
        int max = 250;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }

    public static double generateRandomAmount(){
        int min = 20;
        int max = 250;
        double random_int = (double)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }

    public static String generateRandomWalletID(int len) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(random.nextInt(chars.length())));
        return sb.toString();
    }
}
