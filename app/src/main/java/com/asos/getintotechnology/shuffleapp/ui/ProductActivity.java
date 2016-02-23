package com.asos.getintotechnology.shuffleapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.Toast;

import com.asos.getintotechnology.shuffleapp.R;
import com.asos.getintotechnology.shuffleapp.model.Product;
import com.asos.getintotechnology.shuffleapp.network.ProductService;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ProductActivity extends AppCompatActivity implements ProductService.OnResultListener {

    @Bind(R.id.product_grid)
    GridView productGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        requestProducts();
    }

    private void requestProducts() {
        ProductService service = new ProductService(this);
        service.getProducts();
    }

    @Override
    public void displayProducts(List<Product> products) {
        ProductAdapter adapter = new ProductAdapter(this, products);
        productGrid.setAdapter(adapter);
    }

    @Override
    public void displayError(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }
}
