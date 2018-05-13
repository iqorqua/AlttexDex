package com.app.altex.alttexdex.etherum_wallet.interfaces;


import okhttp3.Response;

public interface NetworkUpdateListener {

    public void onUpdate(Response s);
}
