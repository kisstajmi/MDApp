package com.kisstajmi.mdapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity {
	static final LatLng COORD1 = new LatLng(47.60748,	28.98008);
	static final LatLng COORD2 = new LatLng(-4.453767,	-77.59374);
	static final LatLng COORD3 = new LatLng(43.77255,	-102.0031);
	static final LatLng COORD4 = new LatLng(-17.33153,	17.33149);
	static final LatLng COORD5 = new LatLng(-13.44766,	-172.3766);
	static final LatLng COORD6 = new LatLng(34.28371,	76.77374);
	static final LatLng COORD7 = new LatLng(-77.46558,	169.2948);
	static final LatLng COORD8 = new LatLng(55.5676,	-157.4903);

  private GoogleMap map;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
    if(map!=null){
	    Marker coord1 = map.addMarker(new MarkerOptions().position(COORD1).title("coord1"));
	    Marker coord2 = map.addMarker(new MarkerOptions()
	        .position(COORD2)
	        .title("coord2")
	        .snippet("coord2 is cool")
	        .icon(BitmapDescriptorFactory
	            .fromResource(R.drawable.ic_launcher)));
	    Marker coord3 = map.addMarker(new MarkerOptions().position(COORD3).title("coord3"));
	    Marker coord4 = map.addMarker(new MarkerOptions().position(COORD4).title("coord4"));
	    Marker coord5 = map.addMarker(new MarkerOptions().position(COORD5).title("coord5"));
	    Marker coord6 = map.addMarker(new MarkerOptions().position(COORD6).title("coord6"));
	    Marker coord7 = map.addMarker(new MarkerOptions().position(COORD7).title("coord7"));
	    Marker coord8 = map.addMarker(new MarkerOptions().position(COORD8).title("coord8"));
    }
    // Move the camera instantly to hamburg with a zoom of 15.
    //map.moveCamera(CameraUpdateFactory.newLatLngZoom(HAMBURG, 15));

    // Zoom in, animating the camera.
    //map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
  }

}