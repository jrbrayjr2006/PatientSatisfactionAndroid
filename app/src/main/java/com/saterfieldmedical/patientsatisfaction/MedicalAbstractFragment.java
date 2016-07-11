package com.saterfieldmedical.patientsatisfaction;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by jamesbray on 6/29/16.
 */
public class MedicalAbstractFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public interface OnNextViewListener {

        void onNextHospitalVisit();

        void onNextClinicVisit();

    }
}
