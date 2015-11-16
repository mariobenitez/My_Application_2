package com.bananita.mmbs.myapplication2;

import android.app.Activity;
import android.os.Bundle;

import com.wikitude.architect.ArchitectView;
import com.wikitude.architect.StartupConfiguration;

import java.io.IOException;


/**
 * Created by mmbs on 16/11/2015.
 */
public class ArchitectActivity1 extends Activity {

    private static final String TAG = ArchitectActivity1.class.getSimpleName();

    protected boolean isLoading = false;

    protected static final String WIKITUDE_SDK_KEY = "YUPHdxXsnkpTzSh08C5hEFhyExgwrIybsjDsfahzVFEnXqLfEmaMb0fEq1Oa06IGeEza124tsb9rd5RPIulo41KKEG63C0dxhx/EHJwCoCzXzMe2dIPAsvUzdiG7LeN1urACKJfhtRkLLAcR07+VyubYyIsWSFbPcnuBS7wELQVTYWx0ZWRfX1kR4ttx/zCdAC7mR+KSjL97UCbZxqGeM2tJ9ltHcGIqcxrkY1hTYhFceSgwn73tnFqv7piU0jQ0kHAWFqUY89rQrBGbucv53c14ac2cGT2wEokTaah1ltFUEuDoFqBBMA7HXQbWMaRPoYD1E7yMGUKOBxkREnajWKT+3XC+L/XxjpXMYpKYleNVbQ3b4rxOXJ34LXM7xztfcRn896F0xuEAj9io1qeXTa/S4VtNMzD+zsEOJRGNB0nuJeMWqErBq0ZF3jR6ZEzgOoYm0MPH/FqViG7BqqD4OPvSJSd3QB9TOJQuQprWL2dH6WqW8HmHIZPY0p2sFuOkkDr4TSTRtBqQ4QAQ4NOFC6qOdHKzjHAFQllujgJk7TFdJo94NxTJ9WQ9lt10KCcehm1QOAeanr8HNVOMFf2llF9Pfb7OKu/oGzIBSCdC/ZyfwIavZtnHnwgY+otqevspY6RCvQnCPgwur9/KvE9XvcPLRhXDKfbYpZVHxyCSH24=";

    ArchitectView architectView;

    StartupConfiguration startupConfiguration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_architect1);

        this.architectView = (ArchitectView) this.findViewById(R.id.architectView);

        final StartupConfiguration config; // creo la variable que contendra la configuracion de inicio

        config = new StartupConfiguration(WIKITUDE_SDK_KEY); // le paso a esta nueva variable la key de wikitude

        this.architectView.onCreate(config);


    }

    @Override // desde aca el PostCreate
    protected void onPostCreate(final Bundle savedInstanceState) {

        super.onPostCreate(savedInstanceState);

        if (this.architectView != null) {

            this.architectView.onPostCreate();

            try {

                this.architectView.load("http://tonypig.servebeer.com/Test1/index.html");

           /*     log.e(TAG, "TONY WE LOADED THE ASSET FOLDER/WEB APP CORRECTLY"); */


            } catch
                    (IOException e1) {

                e1.printStackTrace();

            }

        }


    }

    @Override
    public void onResume() {

        super.onResume();
        this.architectView.onResume();


    }

    @Override
    public void onPause() {

        super.onPause();

        if (this.architectView != null) {

            this.architectView.onPause();


        }

    }

    @Override
    public void onStop() {

        super.onStop();

    }

    @Override
    public void onDestroy() {

        super.onDestroy();

        if (this.architectView != null) {

            this.architectView.onDestroy();

        }

    }

    @Override
    public void onLowMemory() {

        super.onLowMemory();

        if (this.architectView  != null){

            this.architectView.onLowMemory();


        }


    }

}
