package com.example.konstantinospolychroniadis.onefinancialgroup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private static final String TAG = "MapActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng paris = new LatLng(48.864716, 2.349014);
        googleMap.addMarker(new MarkerOptions().position(paris)
                .title("Properties in Paris"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(paris));
        LatLng london = new LatLng(51.509865, -0.118092);
        googleMap.addMarker(new MarkerOptions().position(london)
                .title("Properties in London"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(london));
        LatLng brussels = new LatLng(50.85045, 4.34878);
        googleMap.addMarker(new MarkerOptions().position(brussels)
                .title("Properties in Brussels"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(brussels));
    }
}
