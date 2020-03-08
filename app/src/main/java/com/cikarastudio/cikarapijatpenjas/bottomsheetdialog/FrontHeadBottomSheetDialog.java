package com.cikarastudio.cikarapijatpenjas.bottomsheetdialog;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cikarastudio.cikarapijatpenjas.R;
import com.cikarastudio.cikarapijatpenjas.activity.VideoActivity;
import com.cikarastudio.cikarapijatpenjas.adapter.Adapter;
import com.cikarastudio.cikarapijatpenjas.model.Massage;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

public class FrontHeadBottomSheetDialog extends BottomSheetDialogFragment {

    private RecyclerView rvMassage;
    private ArrayList<Massage> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_bottom_sheet, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvMassage = view.findViewById(R.id.rv_massage);
        rvMassage.setHasFixedSize(true);
        list.addAll(getListMassage());
        showRecyclerList();
    }

    private ArrayList<Massage> getListMassage() {
        String[] dataTitle = getResources().getStringArray(R.array.data_massage_head);
        String[] dataDescription = getResources().getStringArray(R.array.data_description_massage_head);
        TypedArray dataPhoto = getResources().obtainTypedArray(R.array.data_photo_massage_head);
        TypedArray datavideo = getResources().obtainTypedArray(R.array.data_video_massage_head);
        ArrayList<Massage> listMassage = new ArrayList<>();
        for (int i = 0; i < dataTitle.length; i++) {
            Massage massage = new Massage();
            massage.setTitle(dataTitle[i]);
            massage.setDescription(dataDescription[i]);
            massage.setVideo(datavideo.getResourceId(i,-1));
            massage.setImage(dataPhoto.getResourceId(i, -1));
            listMassage.add(massage);
        }
        return listMassage;
    }


    private void showRecyclerList() {
        rvMassage.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adapter listMassageAdapter = new Adapter(list);
        rvMassage.setAdapter(listMassageAdapter);

        listMassageAdapter.setOnItemClickCallback(new Adapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Massage data) {
                Intent detailmassage = new Intent(getActivity(), VideoActivity.class);
                detailmassage.putExtra(VideoActivity.EXTRA_MASSAGE, data);
                startActivity(detailmassage);
            }
        });
    }
}
