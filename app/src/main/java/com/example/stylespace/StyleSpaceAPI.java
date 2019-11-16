package com.example.stylespace;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface StyleSpaceAPI {

    @GET("/get_new_arrival_products")
    Call<Products> getItemList();
}
