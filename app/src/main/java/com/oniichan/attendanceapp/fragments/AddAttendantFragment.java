package com.oniichan.attendanceapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.oniichan.attendanceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddAttendantFragment extends Fragment {


    public AddAttendantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_attendant, container, false);
    }

}
