package com.kurdsoft.kikojast.place;


import lombok.Data;

@Data
public class LocationDTO {

   private Double lat;
    private Double lng;


    //Foramt for input latitide and longitude
    @Override
    public String toString(){
            return "LocationDTO={"+
                    "lng="+lng+
                    ",lat,"+lat+
                    "}";


    }
}
