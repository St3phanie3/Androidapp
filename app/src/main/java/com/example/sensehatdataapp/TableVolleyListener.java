package com.example.sensehatdataapp;

import org.json.JSONArray;
import org.json.JSONException;

public interface TableVolleyListener {
    void onError(String message);
    void onResponse(String response) throws JSONException;
}
