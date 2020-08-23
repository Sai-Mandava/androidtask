package com.apssdc.recyclerview_af1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int images[];
    String names[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler1);
        setData();
    }

    private void setData() {
        images = new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        names = new String[]{"ala vaikuntpuram","bahubali","chichore","darbar","f2","gang leader","hello","i","jersey"};

    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewInfo>{

        @NonNull
        @Override
        public ViewInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewInfo holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class ViewInfo extends RecyclerView.ViewHolder {
            public ViewInfo(@NonNull View itemView) {
                super(itemView);
            }
        }
    }






}