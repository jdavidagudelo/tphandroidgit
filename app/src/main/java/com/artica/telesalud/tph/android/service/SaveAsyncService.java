package com.artica.telesalud.tph.android.service;

import android.app.ProgressDialog;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.activity.BaseActivity;

import java.sql.SQLException;

/**
 * Created by interoperabilidad on 23/05/14.
 */
public abstract class SaveAsyncService<T, U, V, W> extends AbstractAsyncService<T, U, V> {
    private ProgressDialog progressDialog;
    public SaveAsyncService(BaseActivity activity) {
        super(activity);
        this.activity = activity;
        this.progressDialog = new ProgressDialog(activity);
        progressDialog.setIndeterminate(Boolean.TRUE);
    }
    @Override
    protected void onPreExecute() {
        if(activity != null) {
            progressDialog.setMessage(activity.getString(R.string.loading_dialog_text));
            progressDialog.show();
        }
    }
    public void hideDialog()
    {
        if(progressDialog.isShowing()){
            progressDialog.dismiss();
        }
    }

}
