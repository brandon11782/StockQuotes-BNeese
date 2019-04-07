package com.csci490bn.stockquotes_bneese;

import android.util.Log;
import org.json.JSONObject;

public class JSonUtils {

    public static JSONObject parseStockQuoteJson(String json) {
        JSONObject quote = null;
        try {
            JSONObject jsonObject = new JSONObject(json);
            quote = jsonObject.getJSONObject("quote");
            Log.i("JSON", quote.toString());

        } catch (Exception ex) {
            Log.e("JSON", "Error parsing JSON");
        }
        return quote;
    }
}
