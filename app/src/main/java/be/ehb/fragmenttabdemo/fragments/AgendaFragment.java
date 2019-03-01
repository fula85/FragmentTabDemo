package be.ehb.fragmenttabdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import be.ehb.fragmenttabdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AgendaFragment extends Fragment {

    private static final String LUCKY_KEY = "lucky key";

    private TextView tvLucky;

    //factory method
    //met parameter
    public static AgendaFragment newInstance(int luckyInt){
        AgendaFragment af = new AgendaFragment();

        Bundle bundle = new Bundle();
        bundle.putInt(LUCKY_KEY, luckyInt);
        af.setArguments(bundle);

        return af;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_agenda, container, false);

        tvLucky = view.findViewById(R.id.tv_lucky);

        tvLucky.setText( ""+ getArguments().getInt(LUCKY_KEY) );

        return view;
    }

}
