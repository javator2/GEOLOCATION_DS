package com.sda.geolocation;

import com.sda.geolocation.model.Maps;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

public class MapsService {

    private String finalUrl;

    public MapsService(String url, String apiKey) {
        finalUrl = url + "?key=" + apiKey;
    }


    public Maps getLocation(String places) {
        Maps maps = new Maps();
        String requestUrl = finalUrl + places;

        JSONObject json = null;
        try {
            json = new JSONObject(IOUtils.toString(new URL(requestUrl), Charset.forName("UTF-8")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        maps.setLat((Double)json.getJSONArray("results").getJSONObject(Integer.parseInt("0")).getJSONObject("geometry").getJSONObject("location").get("lat"));
        maps.setLng((Double)json.getJSONArray("results").getJSONObject(Integer.parseInt("0")).getJSONObject("geometry").getJSONObject("location").get("lng"));
        return maps;

    }
}
