package com.joe.joe.tour.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import com.joe.joe.tour.R;
import com.joe.joe.tour.adapters.LocationAdapter;
import com.joe.joe.tour.app.Site;

public class NatureFragment extends Fragment {

    public NatureFragment() {
        Log.i("Fragment Check ", "Nature Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(getString(R.string.cascade_djerida_title), R.drawable.cascade_djerida, getString(R.string.cascade_djerida_details)));
        sites.add(new Site(getString(R.string.lac_noir_title), R.drawable.lac_noir, getString(R.string.lac_noir_details)));
        sites.add(new Site(getString(R.string.cap_carbon_title), R.drawable.cap_carbon, getString(R.string.cap_carbon_details)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), sites);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
