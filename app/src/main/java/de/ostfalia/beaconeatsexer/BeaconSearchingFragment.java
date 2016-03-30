package de.ostfalia.beaconeatsexer;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Lina on 29.03.2016.
 */
public class BeaconSearchingFragment extends Fragment{

    //GifView gifView;

    public BeaconSearchingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_beacon_searching, container, false);

        //gifView = (GifView) rootView.findViewById(R.id.gif_view);

        return rootView;

    }
}
