package de.ostfalia.beaconeatsexer;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lina on 29.03.2016.
 */
public class RoomlistFragment extends Fragment{

    public RoomlistFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String LOG_TAG = RoomlistFragment.class.getSimpleName();

        Log.v(LOG_TAG, "verbose     - Meldung");
        Log.d(LOG_TAG, "debug       - Meldung");
        Log.i(LOG_TAG, "information - Meldung");
        Log.w(LOG_TAG, "warning     - Meldung");
        Log.e(LOG_TAG, "error       - Meldung");

        String [] roomlistArray = {
                "Raum 121 - Toilette Herren",
                "Raum 122 - Abstellraum",
                "Raum 123 - Toilette Behinderte",
                "Raum 124 - Prof. Dr. Bernd Müller",
                "Raum 129 - Vorlesungsraum",
                "Raum 130 - Vorlesungsraum",
                "Raum 131 - Vorlesungsraum"
        };

        List<String> aktienListe = new ArrayList<>(Arrays.asList(roomlistArray));

        ArrayAdapter<String> aktienlisteAdapter =
                new ArrayAdapter<>(
                        getActivity(), // Die aktuelle Umgebung (diese Activity)
                        R.layout.list_item_roomlist, // ID der XML-Layout Datei
                        R.id.list_item_roomlist_textview, // ID des TextViews
                        aktienListe); // Beispieldaten in einer ArrayList

        View rootView = inflater.inflate(R.layout.fragment_roomlist, container, false);

        ListView aktienlisteListView = (ListView) rootView.findViewById(R.id.listview_roomlist);
        aktienlisteListView.setAdapter(aktienlisteAdapter);

        return rootView;

    }
}
