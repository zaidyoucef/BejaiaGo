package com.joe.joe.tour.adapters;

import static android.support.v4.content.ContextCompat.startActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.joe.joe.tour.R;
import com.joe.joe.tour.app.Site;

public class LocationAdapter extends ArrayAdapter<Site> {


    public LocationAdapter(Activity context, ArrayList<Site> sites) {
        super(context, 0, sites);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Site currentSite = getItem(position);

        TextView nameText = listItemView.findViewById(R.id.locationName);
        nameText.setText(currentSite.getName());

        TextView detailsText = listItemView.findViewById(R.id.locationDetails);
        if (currentSite.getDetails() == null) {
            detailsText.setVisibility(View.GONE);
        }
        detailsText.setText(currentSite.getDetails());

        ImageView locationImage = listItemView.findViewById(R.id.locationImage);
        if (currentSite.hasImage()) {
            locationImage.setImageResource(currentSite.getImageId());
            locationImage.setVisibility(View.VISIBLE);
        } else {
            locationImage.setVisibility(View.GONE);
        }

        return listItemView;
    }



    }
