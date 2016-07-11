package com.saterfieldmedical.patientsatisfaction;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by jamesbray on 6/28/16.
 */
public class HealthCareExperienceFragment extends MedicalAbstractFragment {

    private Button clinicButton;
    private Button hospitalButton;

    private OnNextViewListener mListener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_health_care_experience, container, false);

        clinicButton = (Button)v.findViewById(R.id.clinicBtn);

        hospitalButton = (Button)v.findViewById(R.id.hospitalBtn);

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

}
