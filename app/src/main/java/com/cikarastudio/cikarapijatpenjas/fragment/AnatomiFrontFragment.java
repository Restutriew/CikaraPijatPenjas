package com.cikarastudio.cikarapijatpenjas.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.FrontHeadBottomSheetDialog;
import com.cikarastudio.cikarapijatpenjas.R;


public class AnatomiFrontFragment extends Fragment implements View.OnClickListener {

    public AnatomiFrontFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_anatomi_front, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button headButton = view.findViewById(R.id.head_button);
        headButton.setOnClickListener(this);

        Button handButton = view.findViewById(R.id.hand_button);
        handButton.setOnClickListener(this);

        Button footButton = view.findViewById(R.id.foot_button);
        footButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.head_button:
                FrontHeadBottomSheetDialog frontHeadBottomSheetDialog = new FrontHeadBottomSheetDialog();
                frontHeadBottomSheetDialog.show(getFragmentManager(), "aiuoe");
                break;
            case R.id.hand_button:
                Toast.makeText(getActivity(), "Tangan Ditekan", Toast.LENGTH_LONG).show();
                break;
            case R.id.foot_button:
                Toast.makeText(getActivity(), "Kakiii Ditekan", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
