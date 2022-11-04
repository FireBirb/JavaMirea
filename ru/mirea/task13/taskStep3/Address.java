package ru.mirea.task13.taskStep3;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Address {
    private String country, region, city, street, house, building, apartment;
    public void split(String ad){
        if (ad.split(", ").length == 7) {
            country = ad.split(", ")[0];
            region = ad.split(", ")[1];
            city = ad.split(", ")[2];
            street = ad.split(", ")[3];
            house = ad.split(", ")[4];
            building = ad.split(", ")[5];
            apartment = ad.split(", ")[6];
            //System.out.println(this);
        }
        else {System.out.println("Wrong address format");}
    }
    public void token(String ad) {
        StringTokenizer st = new StringTokenizer(ad, ",;.");
        String pattern = "(^ )|( $)";
        if (st.countTokens() == 7) {
            country = st.nextToken().replaceAll(pattern, "");
            region = st.nextToken().replaceAll(pattern, "");
            city = st.nextToken().replaceAll(pattern, "");
            street = st.nextToken().replaceAll(pattern, "");
            house = st.nextToken().replaceAll(pattern, "");
            building = st.nextToken().replaceAll(pattern, "");
            apartment = st.nextToken().replaceAll(pattern, "");
            //System.out.println(this);
        }
        else {System.out.println("Wrong address format");}
    }

    public String getApartment() {
        return apartment;
    }

    public String getBuilding() {
        return building;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHouse() {
        return house;
    }

    public String getRegion() {
        return region;
    }

    public String getStreet() {
        return street;
    }
    public String toString() {
        return new StringBuilder().append("Country: ").append(country).
                append("\nRegion: ").append(region).
                append("\nCity: ").append(city).
                append("\nStreet: ").append(street).
                append("\nHouse: ").append(house).
                append("\nBuilding: ").append(building).
                append("\nApartment: ").append(apartment).toString();
    }
}
