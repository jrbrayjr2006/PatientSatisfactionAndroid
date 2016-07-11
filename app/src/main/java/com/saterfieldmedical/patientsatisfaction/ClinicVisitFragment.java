package com.saterfieldmedical.patientsatisfaction;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jamesbray on 6/29/16.
 */
public class ClinicVisitFragment extends Fragment {

    private TextView titleClinicVisitTextView;
    private TextView whyFeelTextView;
    private Button timePhysicianBtn;
    private Button waitingBtn;
    private Button nursingInteractionsBtn;
    private Button receptionistInteractionBtn;
    private Button dischargeProcessBtn;
    private Button followUpInstuctionsBtn;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_clinic_visit, container, false);

        //TODO add logic here

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
