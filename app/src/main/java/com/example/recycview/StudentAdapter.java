package com.example.recycview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;

public class StudentAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<StudentModel> studentModels;
    Context context;

    public StudentAdapter(ArrayList<StudentModel> studentModels, Context context) {
        this.studentModels = studentModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycview_line, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StudentModel studentModel = studentModels.get(position);

        holder.txtid.setText(String.valueOf(studentModel.getID_student()));
        holder.txtname.setText(studentModel.getName_student());
        holder.txtadress.setText(studentModel.getAdress_student());
        holder.txtadress.setText(studentModel.getAdress_student());
    }

    @Override
    public int getItemCount() {
        return studentModels.size();
    }
}
