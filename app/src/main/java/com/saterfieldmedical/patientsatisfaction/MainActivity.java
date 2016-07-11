package com.saterfieldmedical.patientsatisfaction;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity implements HomeFragment.OnFragmentInteractionListener {

    private FragmentManager fragmentManager;
    private Fragment homeFragment;
    private Fragment healthCareExperienceFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        homeFragment = fragmentManager.findFragmentById(R.id.homeFragment);
        if(homeFragment == null) {
            homeFragment = new HomeFragment();
            transaction.add(R.id.fragment_container, homeFragment).commit();
        }
    }


    private void gotToNextScreen() {
        //TODO
    }

    @Override
    public void onFragmentInteraction() {
        if(fragmentManager == null) {
            fragmentManager = getFragmentManager();
        }
        healthCareExperienceFragment = fragmentManager.findFragmentById(R.id.healthCareExperienceFragment);
        if(healthCareExperienceFragment == null) {
            healthCareExperienceFragment = new HealthCareExperienceFragment();
        }
        fragmentManager.beginTransaction().replace(R.id.fragment_container, healthCareExperienceFragment).commit();
    }
}
