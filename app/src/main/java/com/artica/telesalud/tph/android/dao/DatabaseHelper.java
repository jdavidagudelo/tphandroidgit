package com.artica.telesalud.tph.android.dao;

/**
 * Created by interoperabilidad on 20/05/14.
 */

import android.content.Context;
import net.sqlcipher.database.SQLiteDatabase;
import android.util.Log;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.lightweightmodel.CausaAtencionDto;
import com.artica.telesalud.tph.android.lightweightmodel.CityDto;
import com.artica.telesalud.tph.android.lightweightmodel.CountryDto;
import com.artica.telesalud.tph.android.lightweightmodel.EventDto;
import com.artica.telesalud.tph.android.lightweightmodel.StateDto;
import com.artica.telesalud.tph.android.lightweightmodel.UserDto;
import com.j256.ormlite.sqlcipher.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Database helper class used to manage the creation and upgrading of your database. This class also usually provides
 * the DAOs used by the other classes.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    // name of the database file for your application -- change to something appropriate for your app
    private static final String DATABASE_NAME = "RCMedicalRecordTPH.db";
    // any time you make changes to your database objects, you may have to increase the database version
    private static final int DATABASE_VERSION = 1;
    private static final String PASSWORD = "abc123";
    // the DAO object we use to access the SimpleData table
    private Dao<CausaAtencionDto, Integer> causaAtencionDao = null;
    private Dao<StateDto, Integer> stateDao = null;
    private Dao<CityDto, Integer> cityDao = null;
    private Dao<CountryDto, Integer> countryDao = null;
    private Dao<EventDto, Integer> eventDao = null;
    private Dao<UserDto, Integer> userDao=null;
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config, PASSWORD);
    }

    /**
     * This is called when the database is first created. Usually you should call createTable statements here to create
     * the tables that will store your data.
     */
    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        try {
            Log.i(DatabaseHelper.class.getName(), "onCreate");
            TableUtils.createTable(connectionSource, CausaAtencionDto.class);
            TableUtils.createTable(connectionSource, StateDto.class);
            TableUtils.createTable(connectionSource, CityDto.class);
            TableUtils.createTable(connectionSource, EventDto.class);
            TableUtils.createTable(connectionSource, CountryDto.class);
            TableUtils.createTable(connectionSource, UserDto.class);
        } catch (SQLException e) {
            Log.e(DatabaseHelper.class.getName(), "Can't create database", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * This is called when your application is upgraded and it has a higher version number. This allows you to adjust
     * the various data to match the new version number.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, CausaAtencionDto.class, true);
            TableUtils.dropTable(connectionSource, StateDto.class, true);
            TableUtils.dropTable(connectionSource, CityDto.class, true);
            TableUtils.dropTable(connectionSource, EventDto.class, true);
            TableUtils.dropTable(connectionSource, CountryDto.class, true);
            TableUtils.dropTable(connectionSource, UserDto.class, true);
            // after we drop the old databases, we create the new ones
            onCreate(db, connectionSource);
        } catch (SQLException e) {
            Log.e(DatabaseHelper.class.getName(), "Can't drop databases", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns the Database Access Object (DAO) for our SimpleData class. It will create it or just give the cached
     * value.
     */
    public Dao<CausaAtencionDto, Integer> getCausaAtencionDao() throws SQLException {
        if (causaAtencionDao == null) {
            causaAtencionDao = getDao(CausaAtencionDto.class);
        }
        return causaAtencionDao;
    }

    public Dao<StateDto, Integer> getStateDao() throws SQLException {
        if (stateDao == null) {
            stateDao = getDao(StateDto.class);
        }
        return stateDao;
    }

    public Dao<CityDto, Integer> getCityDao() throws SQLException {
        if (cityDao == null) {
            cityDao = getDao(CityDto.class);
        }
        return cityDao;
    }

    public Dao<CountryDto, Integer> getCountryDao() throws SQLException {
        if (countryDao == null) {
            countryDao = getDao(CountryDto.class);
        }
        return countryDao;
    }

    public Dao<EventDto, Integer> getEventDao() throws SQLException {
        if (eventDao == null) {
            eventDao = getDao(EventDto.class);
        }
        return eventDao;
    }
    public Dao<UserDto, Integer> getUserDao() throws SQLException {
        if (userDao == null) {
            userDao = getDao(UserDto.class);
        }
        return userDao;
    }

    /**
     * Close the database connections and clear any cached DAOs.
     */
    @Override
    public void close() {
        super.close();
        causaAtencionDao = null;
        cityDao = null;
        stateDao = null;
        countryDao = null;
        eventDao = null;
        userDao = null;
    }
}