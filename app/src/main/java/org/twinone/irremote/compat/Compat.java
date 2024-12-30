package org.twinone.irremote.compat;

import android.content.Context;

import com.afollestad.materialdialogs.MaterialDialog;

import org.twinone.irremote.R;

/**
 * Created by twinone on 1/14/15.
 */
public class Compat {

    public static final MaterialDialog.Builder getMaterialDialogBuilder(Context c) {
        return new MaterialDialog.Builder(c)
                .positiveColorRes(R.color.material_teal_200)
                .negativeColorRes(R.color.material_teal_200)
                .neutralColorRes(R.color.material_teal_200);
    }
}
