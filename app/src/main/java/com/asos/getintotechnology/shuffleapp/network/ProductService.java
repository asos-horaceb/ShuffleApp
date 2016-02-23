package com.asos.getintotechnology.shuffleapp.network;

import com.asos.getintotechnology.shuffleapp.model.Product;
import com.asos.getintotechnology.shuffleapp.model.SearchResults;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * This will call the product api and bring back a list of products.
 */
public class ProductService implements Callback<SearchResults> {

    private static final String API_URL = "http://searchapi.asos.com";
    private static final String CURRENCY = "currency";
    private static final String STORE = "store";
    private static final String LANG = "lang";
    private static final String CHANNEL = "channel";
    private static final String OFFSET = "offset";
    private static final String LIMIT = "limit";

    private final RestAdapter adapter;

    private OnResultListener listener;

    public interface OnResultListener {
        void displayProducts(final List<Product> products);

        void displayError(final String errorMessage);
    }

    public ProductService(final OnResultListener listener) {
        final RestAdapterCreator creator = new RestAdapterCreator(API_URL);
        adapter = creator.createAdapter();
        this.listener = listener;
    }

    public void getProducts() {
        final ProductApi api = adapter.create(ProductApi.class);
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put(CURRENCY, "GBP");
        queryParams.put(STORE, "1");
        queryParams.put(LANG, "en");
        queryParams.put(CHANNEL, "mobile");
        queryParams.put(OFFSET, "0");
        queryParams.put(LIMIT, "35");
        api.getWomensNike(queryParams, this);
    }

    @Override
    public void success(final SearchResults results, final Response response) {
        final List<Product> mainList = results.getProducts();
        listener.displayProducts(mainList);
    }

    @Override
    public void failure(final RetrofitError error) {
        listener.displayError(error.getMessage());
    }

    private interface ProductApi {

        @GET("/product/search/v1/categories/5897")
        void getWomensNike(@QueryMap Map<String, String> params, Callback<SearchResults> callback);

    }
}
