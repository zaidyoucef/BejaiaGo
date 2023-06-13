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

public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        Log.i("Fragment Check: ", "Monuments Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(getString(R.string.yemma_gouraya_title), R.drawable.yemma_gouraya, getString(R.string.yemma_gouraya_details)));
        sites.add(new Site(getString(R.string.casbah_title), R.drawable.casbah, getString(R.string.casbah_details)));
        sites.add(new Site(getString(R.string.bab_el_fouka_title), R.drawable.bab_el_fouka, getString(R.string.bab_el_fouka_details)));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), sites);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
