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

public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        Log.i("Fragment Check ", "Places Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(getString(R.string.gueydon_title), R.drawable.gueydon, getString(R.string.gueydon_details)));
        sites.add(new Site(getString(R.string.brise_title), R.drawable.brise, getString(R.string.brise_details)));
        sites.add(new Site(getString(R.string.soummam_title), R.drawable.soummam, getString(R.string.soummam_details)));
        sites.add(new Site(getString(R.string.zaidyoucef_title),R.drawable.brise, getString(R.string.zaidyoucef_details)  ));
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), sites);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
