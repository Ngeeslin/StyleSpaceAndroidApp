package com.example.stylespace;

import com.google.gson.internal.LinkedTreeMap;

import java.util.Map;

public class Item {

    private String _id;

    private String brand;

    private String[] categories;

    private String[] category_tree;

    private String[] colors;

    private String[] descriptions;

    private int discount_price;

    private String embedding_category;

    private String gender;

    private boolean has_discount;

    private String id;

    private boolean in_stock;

    private float insert_time;

    private float last_update_time;

    private String name;

    private Object[] outfits;

    private Object[] outfits_info;

    private int price;

    private Map<String,String> similar_items;

    private String site;

    private String url;

    private LinkedTreeMap[] variations;


    public String getId(){
        return this._id;
    }

    public String brand(){
        return this.brand;
    }

    public String[] categories(){
        return this.categories;
    }

    public String[] getCategory_tree() {
        return category_tree;
    }

    public String[] getColors() {
        return colors;
    }

    public String[] getDescriptions() {
        return descriptions;
    }

    public int getDiscount_price() {
        return discount_price;
    }

    public String getEmbedding_category() {
        return embedding_category;
    }

    public String getGender() {
        return gender;
    }

    public boolean isHas_discount() {
        return has_discount;
    }

    public boolean isIn_stock() {
        return in_stock;
    }

    public float getInsert_time() {
        return insert_time;
    }

    public float getLast_update_time() {
        return last_update_time;
    }

    public String getName() {
        return name;
    }

    public Object[] getOutfits() {
        return outfits;
    }

    public Object[] getOutfits_info() {
        return outfits_info;
    }

    public int getPrice() {
        return price;
    }

    public Map<String, String> getSimilar_items() {
        return similar_items;
    }

    public String getSite() {
        return site;
    }

    public String getUrl() {
        return url;
    }

    public LinkedTreeMap[] getVariations() {
        return variations;
    }
}
