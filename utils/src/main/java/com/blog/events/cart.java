package com.blog.events;

import com.blog.models.IShopingItem;
import com.blog.models.tshirt;

import java.util.ArrayList;

public class cart {

    public ArrayList<IShopingItem> shopingList;

    public static void main(String[] args) {

        tshirt underarmour = new tshirt(55.45);
        tshirt nike = new tshirt(66.3);
        System.out.println(nike.getTax(14));
    }

}
