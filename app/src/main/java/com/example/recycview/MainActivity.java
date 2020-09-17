package com.example.recycview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcv;
    private LinearLayoutManager layout;
    ArrayList<StudentModel> studentModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataStudent();
        biultRecycview();

    }

    public  void dataStudent()
    {
        studentModels = new ArrayList<>();
        studentModels.add(new StudentModel(1, "Hiếu Thành", "Hà Nội"));
        studentModels.add(new StudentModel(2, "Hiếu Thành 1", "Hà Nội"));
        studentModels.add(new StudentModel(3, "Hiếu Thành 2", "Hà Nội"));
        studentModels.add(new StudentModel(4, "Hiếu Thành 3", "Hà Nội"));

    }
    public void biultRecycview()
    {
        rcv = findViewById(R.id.listview);
        rcv.setHasFixedSize(true);

        layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        StudentAdapter studentAdapter = new StudentAdapter(studentModels, this);
        rcv.setAdapter(studentAdapter);
        rcv.setLayoutManager(layout);

    }
}
