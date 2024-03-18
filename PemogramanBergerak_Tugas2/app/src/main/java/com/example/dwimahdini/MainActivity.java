package com.example.dwimahdini;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.myapplication.R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<item> items = new ArrayList<item>();
        items.add(new item("Nama: Abmi Sukma Edri","Nim: 1205012o0341",R.drawable.amiii));
        items.add(new item("Nama: Ahmad Kurniawan","Nim: 12250111514",R.drawable.Ahmed));
        items.add(new item("Nama: Aufa Hajati","Nim: 12250120338",R.drawable.Aufa));
        items.add(new item("Nama: Daffa Finanda","Nim: 12250111603",R.drawable.DAPIN));
        items.add(new item("Nama: Daffa Ikhwan Nurfauzan","Nim: 12250110979",R.drawable.Dafuq));
        items.add(new item("Nama: Diki Afdol","Nim: 112250110383",R.drawable.a));
        items.add(new item("Nama: Dwi Jelita Adhliyah","Nim: 12250120331",R.drawable.jelita));
        items.add(new item("Nama: Dwi Mahdini","Nim: 12250111298",R.drawable.dwik));
        items.add(new item("Nama: Fajri","Nim: 1225011082",R.drawable.fajri));
        items.add(new item("Nama: Fakhri","Nim: 12250111381",R.drawable.Fakhri));
        items.add(new item("Nama: Farras Lathief","Nim: 12250111328",R.drawable.farras));
        items.add(new item("Nama: Gilang Ramadhan Indra","Nim: 12250111323",R.drawable.gilang));
        items.add(new item("Nama: Hafidz Alhadid Rahman","Nim: 12250111794",R.drawable.a));
        items.add(new item("Nama: Haritsah Naufaldy","Nim: 12250110361",R.drawable.aldy));
        items.add(new item("Nama: M. Nabil Dawami","Nim: 12250111527",R.drawable.Nabil));
        items.add(new item("Nama: M. Zaki Erbay Syas","Nim: 12250111134",R.drawable.zaki));
        items.add(new item("Nama: Muhammad Aditya Rinaldi","Nim: 12250111048",R.drawable.adit));
        items.add(new item("Nama: Muhammad Dhimas Hadid","Nim: 12250111231",R.drawable.dms));
        items.add(new item("Nama: Muhammad Faruq","Nim: 12250111791",R.drawable.faruqhz));
        items.add(new item("Nama: Muhammad Rafly Wirayudha","Nim: 12250111489",R.drawable.rafly));
        items.add(new item("Nama: Nurika Dwi Wahyuni","Nim: 12250120360",R.drawable.nurika));
        items.add(new item("Nama: Ogya Secio Noegroho.s","Nim: 12250111346",R.drawable.ogi));
        items.add(new item("Nama: Rahma Laksita","Nim:12250124357",R.drawable.Rahma));
        items.add(new item("Nama: Raka Sabri","Nim: 12250110342",R.drawable.a));
        items.add(new item("Nama: Surya Hidayatullah Firdaus","Nim: 12250111759",R.drawable.Srya));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new penghubung(getApplicationContext(),items));

    }
}