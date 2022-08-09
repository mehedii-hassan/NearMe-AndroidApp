package com.example.nearme.utils;

import com.example.nearme.R;
import com.example.nearme.models.PlaceModel;

import java.util.ArrayList;
import java.util.Arrays;

public interface Constants {

    ArrayList<PlaceModel> placesNameList = new ArrayList<>(
            Arrays.asList(
                    new PlaceModel(1, R.drawable.ic_restaurant, "Restaurant", "restaurant"),
                    new PlaceModel(2, R.drawable.ic_atm, "ATM", "atm"),
                    new PlaceModel(3, R.drawable.ic_gas_station, "Gas", "gas_station"),
                    new PlaceModel(4, R.drawable.ic_shopping_cart, "Groceries", "supermarket"),
                    new PlaceModel(5, R.drawable.ic_hotel, "Hotels", "hotel"),
                    new PlaceModel(6, R.drawable.ic_pharmacy, "Pharmacies", "pharmacy"),
                    new PlaceModel(7, R.drawable.ic_hospital, "Hospitals & Clinics", "hospital"),
                    new PlaceModel(8, R.drawable.ic_car_wash, "Car Wash", "car_wash"),
                    new PlaceModel(9, R.drawable.ic_saloon, "Beauty Salons", "beauty_salon")

            )
    );
}
