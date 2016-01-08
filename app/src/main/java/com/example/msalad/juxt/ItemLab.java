package com.example.msalad.juxt;

import android.content.Context;
import java.util.ArrayList;

/**
 * Created by msalad on 1/7/2016.
 *
 * Singleton class that will handle adding a new item to the an arraylist of Items
 */
public class ItemLab {

    private static ArrayList<Item> items;
    private static ItemLab sItemLab;

    private ItemLab()
    {
        //Create an arraylist that can hold Item objects
        items = new ArrayList<Item>();
    }

    public static ItemLab get(Context ctx)
    {
        if(sItemLab == null)
        {
            sItemLab = new ItemLab();
        }
        return sItemLab;
    }

    public static ArrayList<Item> getItemList()
    {
        return items;
    }

    public static void addItem(Item item)
    {
        items.add(item);
    }
}
