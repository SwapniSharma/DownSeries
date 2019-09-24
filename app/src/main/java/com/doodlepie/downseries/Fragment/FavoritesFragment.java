package com.doodlepie.downseries.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.doodlepie.downseries.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritesFragment extends Fragment {

    private static FavoritesFragment INSTANCE = null;

    public FavoritesFragment() {
        // Required empty public constructor
    }

    public static FavoritesFragment getInstance(){
        if(INSTANCE == null)
            INSTANCE = new FavoritesFragment();

            return INSTANCE;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recent, container, false);
    }

}
