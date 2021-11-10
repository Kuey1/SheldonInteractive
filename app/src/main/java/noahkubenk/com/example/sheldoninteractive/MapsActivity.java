package noahkubenk.com.example.sheldoninteractive;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import noahkubenk.com.example.sheldoninteractive.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
// Add a marker in Sheldon
        LatLng sheldon = new LatLng(-27.5702, 153.2324);
        mMap.addMarker(new MarkerOptions().position(sheldon).title("Marker in Sheldon"));

        LatLng Linq = new LatLng(-27.568647,  153.233617);
        mMap.addMarker(new MarkerOptions().position(Linq).title("Linq Precinct"));

        LatLng secondstory = new LatLng(-27.568676,  153.233396);
        mMap.addMarker(new MarkerOptions().position(secondstory).title("Second Story: LD 13 - Mr Ricky Sinclair"));
        LatLng secondstory1 = new LatLng(-27.568769,  153.233564);
        mMap.addMarker(new MarkerOptions().position(secondstory1).title("Second Story: LD 12 - Mr Ray Scott"));
        LatLng firststory = new LatLng(-27.56845,  153.233417);
        mMap.addMarker(new MarkerOptions().position(firststory).title("First Story: LA 2 - Mr Carl Altschul"));
        LatLng firststory1 = new LatLng(-27.568487,  153.233537);
        mMap.addMarker(new MarkerOptions().position(firststory1).title("First Story: LA 3 - Workshop"));
        LatLng firststory2 = new LatLng(-27.56844,   153.233389);
        mMap.addMarker(new MarkerOptions().position(firststory2).title("First Story: LA 1 - Workshop"));
//move map view to camera
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sheldon));
        mMap.setMinZoomPreference(17);

        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Intent intent = new Intent(MapsActivity.this,ThirdPage.class);
                startActivity(intent);


            }
        });
    }



}
