package com.example.pnr06.equake;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by PNR06 on 11/18/2017.
 */

public class QuakeArrayAdapter extends ArrayAdapter {
    public QuakeArrayAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }
}
