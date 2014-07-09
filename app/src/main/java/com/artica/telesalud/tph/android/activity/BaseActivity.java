package com.artica.telesalud.tph.android.activity;


import android.app.Activity;

import com.artica.telesalud.tph.android.dao.DatabaseHelper;

/**
 * Created by interoperabilidad on 20/05/14.
 */
public abstract class BaseActivity extends Activity {
    public abstract DatabaseHelper getHelper();
    public abstract void showSuccessMessage(String message);
    public abstract void showErrorMessage(String message);
}
