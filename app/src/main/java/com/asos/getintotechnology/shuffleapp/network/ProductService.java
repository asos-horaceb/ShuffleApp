package com.asos.getintotechnology.shuffleapp.network;

import com.asos.getintotechnology.shuffleapp.model.Product;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.GET;

/**
 * This will call the product api and bring back a list of products.
 */
public class ProductService implements Callback<List<Product>> {

    private static final String API_URL = "http://searchapi.asos.com";

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
        api.getProducts(this);
    }

    @Override
    public void success(final List<Product> products, final Response response) {
        listener.displayProducts(products);
    }

    @Override
    public void failure(final RetrofitError error) {
        listener.displayError(error.getMessage());
    }

    private interface ProductApi {

        @GET("/product/search/v1/categories/5897?currency=GBP&store=1&lang=en&channel=desktop-web&offset=0&limit=4")
        void getProducts(Callback<List<Product>> callback);

    }
}
