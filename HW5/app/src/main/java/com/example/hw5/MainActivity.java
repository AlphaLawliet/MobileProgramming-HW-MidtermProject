package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;
    private List<Location> loadData() {
        List<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Phnom Penh",11.5564,104.9282, R.drawable.phnom_penh));
        locations.add(new Location("Sihanoukville", 10.627543,103.522141, R.drawable.sihanouk));
        locations.add(new Location("Kampot",10.594242,104.164032, R.drawable.kampot));
        locations.add(new Location("SiemReap",13.364047,103.860313, R.drawable.siemreap));
        locations.add(new Location("Battambang",13.028697,102.989616, R.drawable.battambong));
        locations.add(new Location("KampongCham",11.99339,105.4635, R.drawable.kampongcham));
        locations.add(new Location("KampongChhnang",12.25,104.66667, R.drawable.kampong_chhang));
        locations.add(new Location("KampongThom",12.71112,104.88873, R.drawable.kampong_thom));
        locations.add(new Location("KohKong",11.61531,102.9838, R.drawable.koh_kong));
        locations.add(new Location("Kep",10.48291,104.31672, R.drawable.kep));
        locations.add(new Location("PreyVeng",11.48682,105.32533, R.drawable.prey_veng));
        locations.add(new Location("Takeo",10.99081,104.78498, R.drawable.takeo));
        locations.add(new Location("Pursat",12.53878,103.9192, R.drawable.pursat));
        locations.add( new Location("Mondolkiri", 12.45583,107.18811, R.drawable.mondolkiri));
        locations.add( new Location("StungTreng",13.52586,105.9683, R.drawable.stung_treng));
        locations.add( new Location("SvayRieng", 11.08785,105.79935, R.drawable.svay_rieng));
        locations.add( new Location("PreahVihear",13.80731,104.98046, R.drawable.preah_vihear));
        locations.add(new Location("Kandal",11.48333,104.95, R.drawable.kandal));
        locations.add( new Location("BanteayMeanchey",13.58588,102.97369, R.drawable.banteay_meanchey));
        locations.add( new Location("Ratanakiri", 13.73939,106.98727, R.drawable.ratanakiri));
        locations.add( new Location("KampongSpeu",11.45332,104.52085, R.drawable.kampong_spue));
        locations.add(new Location("Kratie",12.48811,106.01879, R.drawable.kratie));
        locations.add(new Location("Pailin", 12.84895,102.60928, R.drawable.pailin));
        locations.add(new Location("OddarMeanchey",14.18175,103.51761, R.drawable.oddar_meanchey));
        locations.add(new Location("TbongKhmum", 11.8891,105.8760, R.drawable.tbong_khmum));
        return locations;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationAdapter adapter = new locationAdapter(this,loadData());
        list = findViewById(R.id.listView);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Location clicked = (Location) parent.getItemAtPosition(position);
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            intent.putExtra("imageResource", clicked.getImageResource());
            intent.putExtra("latitude", clicked.getLatitude());
            intent.putExtra("longitude", clicked.getLongitude());
            intent.putExtra("name",clicked.getName());
            startActivity(intent);
        }
        });
    }
}