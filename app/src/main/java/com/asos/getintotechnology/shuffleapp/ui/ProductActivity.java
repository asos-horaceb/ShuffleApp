package com.asos.getintotechnology.shuffleapp.ui;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.asos.getintotechnology.shuffleapp.R;
import com.asos.getintotechnology.shuffleapp.model.Product;
import com.asos.getintotechnology.shuffleapp.network.ProductService;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProductActivity extends AppCompatActivity implements SensorEventListener, ProductService.OnResultListener {

    private static final int COLUMN_NUMBER = 2;
    private static final int ACCELERATION = 25;
    @Bind(R.id.product_grid)
    RecyclerView productGrid;
    private ProductAdapter productAdapter;
    private GridLayoutManager gridLayoutManager;
    private List<Product> productList;
    private SensorManager sensorManager;
    private Sensor sensor;

    private float acceleration;
    private float accelerationCurrent;
    private float accelerationLast;
    @Bind(R.id.radioButton2)
    RadioButton men;
    @Bind(R.id.radioButton3)
    RadioButton women;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initialiseSensor();
        initialiseProductGrid();
        requestProducts();

    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        if (hasDeviceShaken(event)) {
            requestProducts();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }


    private void initialiseSensor() {
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        acceleration = 0.00f;
        accelerationCurrent = SensorManager.GRAVITY_EARTH;
        accelerationLast = SensorManager.GRAVITY_EARTH;
    }

    private void initialiseProductGrid() {
        productList = new ArrayList<>();
        productAdapter = new ProductAdapter(this, productList);
        gridLayoutManager = new GridLayoutManager(this, COLUMN_NUMBER);
        productGrid.setLayoutManager(gridLayoutManager);
        productGrid.setAdapter(productAdapter);

    }


    private void requestProducts() {
        ProductService service = new ProductService(this);

        if (men.isChecked()) {
            service.getMenProducts();
        } else {
            service.getWomenProducts();
        }

    }


    private boolean hasDeviceShaken(SensorEvent event) {
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];
        accelerationLast = accelerationCurrent;
        accelerationCurrent = (float) Math.sqrt((double) (x * x + y * y + z * z));
        float delta = accelerationCurrent - accelerationLast;
        acceleration = acceleration * 0.9f + delta; // perform low-cut filter

        if (acceleration > ACCELERATION) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void displayProducts(List<Product> products) {
        productList.clear();
        productList.addAll(products);
        productAdapter.notifyDataSetChanged();
    }

    @Override
    public void displayError(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button)
    void shuffleProducts() {
        requestProducts();
    }


}
