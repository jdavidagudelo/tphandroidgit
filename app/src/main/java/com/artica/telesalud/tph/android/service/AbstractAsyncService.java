package com.artica.telesalud.tph.android.service;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.activity.BaseActivity;

import java.sql.SQLException;

/**
 * Created by interoperabilidad on 22/05/14.
 */
public abstract class AbstractAsyncService<T, U, V> extends AsyncTask<T, U, V>{

    private ProgressDialog progressDialog;
    protected BaseActivity activity;
    public AbstractAsyncService(BaseActivity activity)
    {
        this.activity = activity;
        this.progressDialog = new ProgressDialog(activity);
        progressDialog.setIndeterminate(Boolean.TRUE);
    }
    @Override
    protected void onPreExecute() {
    }
    public void hideDialog()
    {

    }


}
