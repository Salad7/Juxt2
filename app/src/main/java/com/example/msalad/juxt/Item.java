package com.example.msalad.juxt;

import java.util.UUID;

/**
 * Created by msalad on 1/7/2016.
 *
 * Single Item reference class
 */
public class Item {
    public UUID mID;
    public String mName;
    public double mPrice;

    Item(UUID id, String name, double price)
    {
       mID = id;
       mName = name;
       mPrice= price;
    }

    public UUID getID()
    {
        return mID;
    }

    public String getName()
    {
        return mName;
    }

    public double getPrice()
    {
        return mPrice;
    }
}
