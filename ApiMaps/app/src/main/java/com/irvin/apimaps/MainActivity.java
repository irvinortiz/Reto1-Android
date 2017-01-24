package com.irvin.apimaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.mi_mapa);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        //Ciudad 1
        LatLng lugar1 = new LatLng(-8.1126, -79.0288);
        googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_usuario))
                .position(lugar1));

        //Ciudad 2
        LatLng lugar2 = new LatLng(-8.1109, -79.0299);
        googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_usuario))
                .position(lugar2));

        //Ciudad 3
        LatLng lugar3 = new LatLng(-8.1112, -79.0288);
        googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_usuario))
                .position(lugar3));

        //Ciudad 4
        LatLng lugar4 = new LatLng(-8.1116183, -79.0280675);
        googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_usuario))
                .position(lugar4));

        //Ciudad 5
        LatLng lugar5 = new LatLng(-8.1118, -79.0287);
        googleMap.addMarker(new MarkerOptions()
                .position(lugar5)
                .title("Plaza de Armas de Trujillo")
                .snippet("Trujillo Ciudad de la Eterna Primavera"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar5, 17.5f));
    }
}