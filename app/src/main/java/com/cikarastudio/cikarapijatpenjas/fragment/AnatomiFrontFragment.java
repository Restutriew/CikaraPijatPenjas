package com.cikarastudio.cikarapijatpenjas.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.BetisDepanFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.DadaFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.KepaladanDahiFHBSD;
import com.cikarastudio.cikarapijatpenjas.R;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.LenganAtasBawahFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.PahaDepanFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.PerutFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.PunggungJariKakiFBHSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.PunggungTanganFHBSD;
import com.cikarastudio.cikarapijatpenjas.bottomsheetdialog.TelapakJariTanganFHBSD;

import org.w3c.dom.Text;


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
        TextView kepalaDahi = view.findViewById(R.id.kepalaDahi);
        TextView dada = view.findViewById(R.id.dada);
        TextView perut = view.findViewById(R.id.perut);
        TextView lenganAtasBawah = view.findViewById(R.id.lenganAtasBawah);
        TextView punggungTangan = view.findViewById(R.id.punggungTangan);
        TextView telapakJariTangan = view.findViewById(R.id.telapakJariTangan);
        TextView pahaDepan = view.findViewById(R.id.pahaDepan);
        TextView betisDepan = view.findViewById(R.id.betisDepan);
        TextView punggungJariKaki = view.findViewById(R.id.punggungJariKaki);

        kepalaDahi.setOnClickListener(this);
        dada.setOnClickListener(this);
        perut.setOnClickListener(this);
        lenganAtasBawah.setOnClickListener(this);
        punggungTangan.setOnClickListener(this);
        telapakJariTangan.setOnClickListener(this);
        pahaDepan.setOnClickListener(this);
        betisDepan.setOnClickListener(this);
        punggungJariKaki.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.kepalaDahi:
                KepaladanDahiFHBSD kepaladanDahiFHBSD = new KepaladanDahiFHBSD();
                kepaladanDahiFHBSD.show(getFragmentManager(), "aiuoe");
                break;
            case R.id.dada:
                DadaFHBSD dadaFHBSD = new DadaFHBSD();
                dadaFHBSD.show(getFragmentManager(), "aiuoe");
                break;
            case R.id.perut:
                PerutFHBSD perutFHBSD = new PerutFHBSD();
                perutFHBSD.show(getFragmentManager(), "aiuoe");
                break;
            case R.id.lenganAtasBawah:
                LenganAtasBawahFHBSD lenganAtasBawahFHBSD = new LenganAtasBawahFHBSD();
                lenganAtasBawahFHBSD.show(getFragmentManager(),"aiuoe");
                break;
            case R.id.punggungTangan:
                PunggungTanganFHBSD punggungTanganFHBSD = new PunggungTanganFHBSD();
                punggungTanganFHBSD.show(getFragmentManager(),"aiuoe");
                break;
            case R.id.telapakJariTangan:
                TelapakJariTanganFHBSD telapakJariTanganFHBSD = new TelapakJariTanganFHBSD();
                telapakJariTanganFHBSD.show(getFragmentManager(),"aiuoe");
                break;
            case R.id.pahaDepan:
                PahaDepanFHBSD pahaDepanFHBSD = new PahaDepanFHBSD();
                pahaDepanFHBSD.show(getFragmentManager(),"aiuoe");
                break;
            case R.id.betisDepan:
                BetisDepanFHBSD betisDepanFHBSD = new BetisDepanFHBSD();
                betisDepanFHBSD.show(getFragmentManager(),"aiuoe");
                break;
            case R.id.punggungJariKaki:
                PunggungJariKakiFBHSD punggungJariKakiFBHSD = new PunggungJariKakiFBHSD();
                punggungJariKakiFBHSD.show(getFragmentManager(),"aiuoe");
                break;
        }
    }
}
