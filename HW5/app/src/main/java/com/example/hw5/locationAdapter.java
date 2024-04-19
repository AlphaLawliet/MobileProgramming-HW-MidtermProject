package com.example.hw5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class locationAdapter extends ArrayAdapter<Location> {
    private Context context;
    private List<Location> locations;

    public locationAdapter(@NonNull Context context, List<Location> locations) {
        super(context,0, locations);
        this.context = context;
        this.locations = locations;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
           convertView = LayoutInflater.from(context).inflate(R.layout.list_layout,parent,false);
        }
        Location eachLocation = locations.get(position);
        ImageView img = convertView.findViewById(R.id.layoutImg);
        TextView text = convertView.findViewById(R.id.layoutText);
        TextView latiText = convertView.findViewById(R.id.latitude);
        TextView longiText = convertView.findViewById(R.id.longitude);
        img.setImageResource(eachLocation.getImageResource());
        text.setText(eachLocation.getName());
        latiText.setText("Latitude: " + eachLocation.getLatitude());
        longiText.setText("Longitude: " + eachLocation.getLongitude());
        return convertView;
    }
}
