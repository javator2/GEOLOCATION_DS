package com.sda.geolocation;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MapsService mapsService = new MapsService("https://maps.googleapis.com/maps/api/geocode/json?address=", "AIzaSyD975Ypdk8STtFCUmjwd5LUp-HMUAGJ2CM");

        System.out.println("Podaj miejsce i miasto:");
        Scanner scanner = new Scanner(System.in);
        String places = scanner.nextLine();
        scanner.close();

        String encoderUrl = null;
        try{
            encoderUrl = URLEncoder.encode(places,"UTF-8");
        } catch (UnsupportedEncodingException ignored){ }


        System.out.println(mapsService.getLocation(encoderUrl));
    }
}
