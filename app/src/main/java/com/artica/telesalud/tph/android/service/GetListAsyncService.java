package com.artica.telesalud.tph.android.service;

import android.app.ProgressDialog;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.activity.BaseActivity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by interoperabilidad on 23/05/14.
 */
public abstract class GetListAsyncService<T, U, V> extends AbstractAsyncService<T, U, V>{
    private ProgressDialog progressDialog;
    private Boolean showDialog = Boolean.FALSE;
    public GetListAsyncService(BaseActivity activity, Boolean showDialog) {
        super(activity);
        this.showDialog = showDialog;
        this.progressDialog = new ProgressDialog(activity);
        progressDialog.setIndeterminate(Boolean.TRUE);
    }
    @Override
    protected void onPreExecute() {
        if(activity != null && showDialog) {
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
