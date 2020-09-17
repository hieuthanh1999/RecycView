package com.example.recycview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView txtid, txtname, txtadress;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        txtid = itemView.findViewById(R.id.textview1);
        txtname = itemView.findViewById(R.id.textview2);
        txtadress = itemView.findViewById(R.id.textview3);
    }
}
