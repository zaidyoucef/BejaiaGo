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

public class PlagesFragment extends Fragment {

    public PlagesFragment() {
        Log.i("Fragment Check ", "Plages Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(getString(R.string.tichy_title), R.drawable.tichy, getString(R.string.tichy_details)));
        sites.add(new Site(getString(R.string.aokas_title), R.drawable.aokas, getString(R.string.aokas_details)));
        sites.add(new Site(getString(R.string.boulimat_title), R.drawable.boulimat, getString(R.string.boulimat_details)));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), sites);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
