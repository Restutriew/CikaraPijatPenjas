package com.cikarastudio.cikarapijatpenjas.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cikarastudio.cikarapijatpenjas.R;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.BahuFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.BetisBelakangFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.PahaBelakangFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.PantatFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.PunggungPinggangFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.TumitTelapakKakiFHBSD;


public class AnatomiBackFragment extends Fragment implements View.OnClickListener {

    public AnatomiBackFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_anatomi_back, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView bahu = view.findViewById(R.id.bahu);
        TextView punggungPinggang = view.findViewById(R.id.punggungPinggang);
        TextView pantat = view.findViewById(R.id.pantat);
        TextView pahaBelakang = view.findViewById(R.id.pahaBelakang);
        TextView betisBelakang = view.findViewById(R.id.betisBelakang);
        TextView tumitTelapakKaki = view.findViewById(R.id.tumitTelapakKaki);

        bahu.setOnClickListener(this);
        punggungPinggang.setOnClickListener(this);
        pantat.setOnClickListener(this);
        pahaBelakang.setOnClickListener(this);
        betisBelakang.setOnClickListener(this);
        tumitTelapakKaki.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bahu:
                BahuFHBSD bahuFHBSD = new BahuFHBSD();
                bahuFHBSD.show(getFragmentManager(), "aiuoe");
                break;
            case R.id.punggungPinggang:
                PunggungPinggangFHBSD punggungPinggangFHBSD = new PunggungPinggangFHBSD();
                punggungPinggangFHBSD.show(getFragmentManager(), "aiuoe");
                break;
            case R.id.pantat:
                PantatFHBSD pantatFHBSD = new PantatFHBSD();
                pantatFHBSD.show(getFragmentManager(), "aiuoe");
                break;
            case R.id.pahaBelakang:
                PahaBelakangFHBSD pahaBelakangFHBSD = new PahaBelakangFHBSD();
                pahaBelakangFHBSD.show(getFragmentManager(), "aiuoe");
                break;
            case R.id.betisBelakang:
                BetisBelakangFHBSD betisBelakangFHBSD = new BetisBelakangFHBSD();
                betisBelakangFHBSD.show(getFragmentManager(), "aiuoe");
                break;
            case R.id.tumitTelapakKaki:
                TumitTelapakKakiFHBSD tumitTelapakKakiFHBSD = new TumitTelapakKakiFHBSD();
                tumitTelapakKakiFHBSD.show(getFragmentManager(), "aiuoe");
                break;
        }
    }
}
