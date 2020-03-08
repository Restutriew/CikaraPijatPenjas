package com.cikarastudio.cikarapijatpenjas.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cikarastudio.cikarapijatpenjas.R;
import com.cikarastudio.cikarapijatpenjas.model.Massage;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ListViewHolder> {

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Massage data);
    }

    private ArrayList<Massage> listMassage;

    public Adapter(ArrayList<Massage> listMassage) {
        this.listMassage = listMassage;
    }

    @NonNull
    @Override
    public Adapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Massage massage = listMassage.get(position);
        holder.imgPhoto.setImageResource(massage.getImage());
        holder.tvTitle.setText(massage.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMassage.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMassage.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvTitle;

        public ListViewHolder(@NonNull View itemView) {

            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_massage);
            tvTitle = itemView.findViewById(R.id.title_masssage);
        }
    }
}
