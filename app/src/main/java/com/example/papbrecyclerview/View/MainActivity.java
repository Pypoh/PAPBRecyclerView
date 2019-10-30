package com.example.papbrecyclerview.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.papbrecyclerview.Model.ItemModel;
import com.example.papbrecyclerview.R;
import com.example.papbrecyclerview.RecyclerMainAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Button
    private Button refreshBtn;

    // RecyclerView
    private RecyclerView recyclerView;

    // Adapter
    private RecyclerMainAdapter recyclerMainAdapter;

    // Item Data
    private List<ItemModel> mDataSet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        insertData();

        setupRecycler();
    }

    private void setupRecycler() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerMainAdapter = new RecyclerMainAdapter(this, mDataSet);
        recyclerView.setAdapter(recyclerMainAdapter);
    }

    private void insertData() {
        mDataSet.add(new ItemModel(R.drawable.android_logo, "Android"));
        mDataSet.add(new ItemModel(R.drawable.apple_logo, "Apple"));
        mDataSet.add(new ItemModel(R.drawable.macos_logo, "Mac Os"));
        mDataSet.add(new ItemModel(R.drawable.ubuntu_logo, "Ubuntu"));
        mDataSet.add(new ItemModel(R.drawable.windows_logo, "Windows"));

    }

    private void setupViews() {
        recyclerView = findViewById(R.id.recycler_main);

        refreshBtn = findViewById(R.id.btn_refresh);
        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDataSet.clear();
                insertData();
                recyclerMainAdapter.notifyDataSetChanged();
            }
        });
    }
}
