package refat.com.androidrefactor.utility;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by refat on 05.06.18.
 */

public class Utilities {


    /**
     * get current country information from http://ip-api.com/json
     *
     *
     *
     * @param context
     * @return
     */


    public static String setCurrency(final Context context){

        final String IP_URL="http://ip-api.com/json";
        RequestQueue queue = Volley.newRequestQueue(context);

        if (NetworkConnectionUtil.isConnectedToMobileNetwork(context)||
                NetworkConnectionUtil.isConnectedToWifi(context)||
                NetworkConnectionUtil.isConnectedToInternet(context)) {
            JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, IP_URL, null,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {

                            try {
                                if(response.get("country")!=null){
                                    /*SharedPrefUtil sharedPrefUtil= new SharedPrefUtil(context,Constants.USER_PREFS_NAME);
                                    for (Locale locale :getAvailableLocales()) {
                                        if(locale.getDisplayCountry().equals(response.get("country").toString())){
                                            DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);
                                            String currencySymbol = symbols.getCurrencySymbol();

                                            sharedPrefUtil.saveString("COUNTRY_NAME",locale.getDisplayCountry());
                                            sharedPrefUtil.saveString("CURRENCY_CODE",symbols.getCurrency().getCurrencyCode());
                                            sharedPrefUtil.saveString("CURRENCY_SYMBOL",currencySymbol);

                                            sharedPrefUtil.saveString("CITY",response.get("city").toString());
                                            sharedPrefUtil.saveString("AS",response.get("as").toString());
                                            sharedPrefUtil.saveString("ISP",response.get("isp").toString());
                                            sharedPrefUtil.saveString("LAT",response.get("lat").toString());
                                            sharedPrefUtil.saveString("LON",response.get("lon").toString());
                                            sharedPrefUtil.saveString("QUERY",response.get("query").toString());
                                            sharedPrefUtil.saveString("REGION",response.get("region").toString());
                                            sharedPrefUtil.saveString("ZIP",response.get("zip").toString());

*/
                                             /*{"as":"AS3209 Vodafone GmbH",
                                            "city":"Frankfurt am Main",
                                            "country":"Germany",
                                            "countryCode":"DE",
                                            "isp":"Vodafone DSL",
                                            "lat":50.139,
                                            "lon":8.6725,
                                            "org":"Vodafone DSL",
                                            "query":"88.68.239.119",
                                            "region":"HE",
                                            "regionName":"Hesse",
                                            "status":"success",
                                            "timezone":"Europe/Berlin",
                                            "zip":"60320"}*/
                                    /*

                                        }

                                    }*/

                                }else {
                                    Toast.makeText(context, "No Currency info found.Please, set currency in Settings.", Toast.LENGTH_SHORT).show();
                                }

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }



                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });

            queue.add(request);

        }else{
            NetworkConnectionUtil.showNoInternetAvailableErrorDialog(context);
        }
        return null;
    }
}
