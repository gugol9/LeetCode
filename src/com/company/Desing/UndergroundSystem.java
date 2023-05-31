package com.company.Desing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndergroundSystem {
    private int idC;
    private int t;
    private int tStart;
    private int tStop;
    private Map<Map<String, String >, Integer> map;
    private Map<String, String> nestedMap ;



    private String stationName;
    private String startStation;
    private String endStation;



    public UndergroundSystem() {
        map = new HashMap<>();
        nestedMap = new HashMap<>();
    }

    //Klient o identyfikatorze karty równym id melduje się na stacji stationName o godzinie t.
    public void checkIn(int id, String stationName, int t) {
        if (idC != id){
            idC = id;
            startStation = stationName;
            tStart = t;
        }
    }

    //Klient o identyfikatorze karty równym id wymeldowuje się ze stacji nazwa_stacji w czasie t.
    public void checkOut(int id, String stationName, int t) {
        if (idC == id){
            endStation = stationName;
            tStop = t;

            nestedMap.put(startStation,endStation);
            map.put(nestedMap,tStop-tStart);


        }
    }


    public double getAverageTime(String startStation, String endStation){
        int sum = 0;
        int count = 0;

        for (Map<String, String> key : map.keySet()) {
            if (key.containsKey(startStation) && key.containsKey(endStation)) {
                sum += map.get(key);
                count++;
            }
        }

        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "UndergroundSystem{" +
                "map=" + map +
                ", nestedMap=" + nestedMap +
                '}';
    }
}
