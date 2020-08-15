package com.example.testapp;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = findViewById(R.id.spinner);
        final Spinner spinner2 = findViewById(R.id.spinner2);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("AFGHANISTAN (AFN)");
        arrayList.add("ALGERIA (DZD)");
        arrayList.add("AMERICAN SAMOA (USD)");
        arrayList.add("ANDORRA (EUR)");
        arrayList.add("ANGOLA (AOA)");
        arrayList.add("ANGUILLA (XCD)");
        arrayList.add("ANTIGUA AND BARBUDA (XCD)");
        arrayList.add("ARGENTINA (ARS)");
        arrayList.add("ARMENIA (AMD)");
        arrayList.add("ARUBA (AWG)");
        arrayList.add("AUSTRALIA (AUD)");
        arrayList.add("AUSTRIA (EUR)");
        arrayList.add("AZERBAIJAN (AZN)");
        arrayList.add("BAHAMAS (THE) (BSD)");
        arrayList.add("BAHRAIN (BHD)");
        arrayList.add("BANGLADESH (BDT)");
        arrayList.add("BARBADOS (BBD)");
        arrayList.add("BELARUS (BYN)");
        arrayList.add("BELGIUM (EUR)");
        arrayList.add("BELIZE (BZD)");
        arrayList.add("BENIN (XOF)");
        arrayList.add("BERMUDA (BMD)");
        arrayList.add("BHUTAN (BTN)");
        arrayList.add("BHUTAN (INR)");
        arrayList.add("BOLIVIA (PLURINATIONAL STATE OF) (BOB)");
        arrayList.add("BONAIRE, SINT EUSTATIUS AND SABA (USD)");
        arrayList.add("BOSNIA AND HERZEGOVINA (BAM)");
        arrayList.add("BOTSWANA (BWP)");
        arrayList.add("BOUVET ISLAND (NOK)");
        arrayList.add("BRAZIL (BRL)");
        arrayList.add("BRITISH INDIAN OCEAN TERRITORY (THE) (USD)");
        arrayList.add("BRUNEI DARUSSALAM (BND)");
        arrayList.add("BULGARIA (BGN)");
        arrayList.add("BURKINA FASO (XOF)");
        arrayList.add("BURUNDI (BIF)");
        arrayList.add("CABO VERDE (CVE)");
        arrayList.add("CAMBODIA (KHR)");
        arrayList.add("CAMEROON (XAF)");
        arrayList.add("CANADA (CAD)");
        arrayList.add("CAYMAN ISLANDS (THE) (KYD)");
        arrayList.add("CENTRAL AFRICAN REPUBLIC (THE) (XAF)");
        arrayList.add("CHAD (XAF)");
        arrayList.add("CHILE (CLF)");
        arrayList.add("CHILE (CLP)");
        arrayList.add("CHINA (CNY)");
        arrayList.add("CHRISTMAS ISLAND (AUD)");
        arrayList.add("COCOS (KEELING) ISLANDS (THE) (AUD)");
        arrayList.add("COLOMBIA (COP)");
        arrayList.add("COMOROS (THE) (KMF)");
        arrayList.add("CONGO (THE DEMOCRATIC REPUBLIC OF THE) (CDF)");
        arrayList.add("CONGO (THE) (XAF)");
        arrayList.add("COOK ISLANDS (THE) (NZD)");
        arrayList.add("COSTA RICA (CRC)");
        arrayList.add("CROATIA (HRK)");
        arrayList.add("CUBA (CUC)");
        arrayList.add("CUBA (CUP)");
        arrayList.add("CURAÇAO (ANG)");
        arrayList.add("CYPRUS (EUR)");
        arrayList.add("CZECH REPUBLIC (THE) (CZK)");
        arrayList.add("CÔTE D'IVOIRE (XOF)");
        arrayList.add("DENMARK (DKK)");
        arrayList.add("DJIBOUTI (DJF)");
        arrayList.add("DOMINICA (XCD)");
        arrayList.add("DOMINICAN REPUBLIC (THE) (DOP)");
        arrayList.add("ECUADOR (USD)");
        arrayList.add("EGYPT (EGP)");
        arrayList.add("EL SALVADOR (SVC)");
        arrayList.add("EL SALVADOR (USD)");
        arrayList.add("EQUATORIAL GUINEA (XAF)");
        arrayList.add("ERITREA (ERN)");
        arrayList.add("ESTONIA (EUR)");
        arrayList.add("ETHIOPIA (ETB)");
        arrayList.add("EUROPEAN UNION (EUR)");
        arrayList.add("FALKLAND ISLANDS (THE) [MALVINAS] (FKP)");
        arrayList.add("FAROE ISLANDS (THE) (DKK)");
        arrayList.add("FIJI (FJD)");
        arrayList.add("FINLAND (EUR)");
        arrayList.add("FRANCE (EUR)");
        arrayList.add("FRENCH GUIANA (EUR)");
        arrayList.add("FRENCH POLYNESIA (XPF)");
        arrayList.add("FRENCH SOUTHERN TERRITORIES (THE) (EUR)");
        arrayList.add("GABON (XAF)");
        arrayList.add("GAMBIA (THE) (GMD)");
        arrayList.add("GEORGIA (GEL)");
        arrayList.add("GERMANY (EUR)");
        arrayList.add("GHANA (GHS)");
        arrayList.add("GIBRALTAR (GIP)");
        arrayList.add("GREECE (EUR)");
        arrayList.add("GREENLAND (DKK)");
        arrayList.add("GRENADA (XCD)");
        arrayList.add("GUADELOUPE (EUR)");
        arrayList.add("GUAM (USD)");
        arrayList.add("GUATEMALA (GTQ)");
        arrayList.add("GUERNSEY (GBP)");
        arrayList.add("GUINEA (GNF)");
        arrayList.add("GUINEA-BISSAU (XOF)");
        arrayList.add("GUYANA (GYD)");
        arrayList.add("HAITI (HTG)");
        arrayList.add("HAITI (USD)");
        arrayList.add("HEARD ISLAND AND McDONALD ISLANDS (AUD)");
        arrayList.add("HOLY SEE (THE) (EUR)");
        arrayList.add("HONDURAS (HNL)");
        arrayList.add("HONG KONG (HKD)");
        arrayList.add("HUNGARY (HUF)");
        arrayList.add("ICELAND (ISK)");
        arrayList.add("INDIA (INR)");
        arrayList.add("INDONESIA (IDR)");
        arrayList.add("INTERNATIONAL MONETARY FUND (IMF)  (XDR)");
        arrayList.add("IRAN (ISLAMIC REPUBLIC OF) (IRR)");
        arrayList.add("IRAQ (IQD)");
        arrayList.add("IRELAND (EUR)");
        arrayList.add("ISLE OF MAN (GBP)");
        arrayList.add("ISRAEL (ILS)");
        arrayList.add("ITALY (EUR)");
        arrayList.add("JAMAICA (JMD)");
        arrayList.add("JAPAN (JPY)");
        arrayList.add("JERSEY (GBP)");
        arrayList.add("JORDAN (JOD)");
        arrayList.add("KAZAKHSTAN (KZT)");
        arrayList.add("KENYA (KES)");
        arrayList.add("KIRIBATI (AUD)");
        arrayList.add("KOREA (THE DEMOCRATIC PEOPLE’S REPUBLIC OF) (KPW)");
        arrayList.add("KOREA (THE REPUBLIC OF) (KRW)");
        arrayList.add("KUWAIT (KWD)");
        arrayList.add("KYRGYZSTAN (KGS)");
        arrayList.add("LAO PEOPLE’S DEMOCRATIC REPUBLIC (THE) (LAK)");
        arrayList.add("LATVIA (EUR)");
        arrayList.add("LEBANON (LBP)");
        arrayList.add("LESOTHO (LSL)");
        arrayList.add("LESOTHO (ZAR)");
        arrayList.add("LIBERIA (LRD)");
        arrayList.add("LIBYA (LYD)");
        arrayList.add("LIECHTENSTEIN (CHF)");
        arrayList.add("LITHUANIA (EUR)");
        arrayList.add("LUXEMBOURG (EUR)");
        arrayList.add("MACAO (MOP)");
        arrayList.add("MADAGASCAR (MGA)");
        arrayList.add("MALAWI (MWK)");
        arrayList.add("MALAYSIA (MYR)");
        arrayList.add("MALDIVES (MVR)");
        arrayList.add("MALI (XOF)");
        arrayList.add("MALTA (EUR)");
        arrayList.add("MARSHALL ISLANDS (THE) (USD)");
        arrayList.add("MARTINIQUE (EUR)");
        arrayList.add("MAURITIUS (MUR)");
        arrayList.add("MAYOTTE (EUR)");
        arrayList.add("MEXICO (MXN)");
        arrayList.add("MICRONESIA (FEDERATED STATES OF) (USD)");
        arrayList.add("MOLDOVA (THE REPUBLIC OF) (MDL)");
        arrayList.add("MONACO (EUR)");
        arrayList.add("MONGOLIA (MNT)");
        arrayList.add("MONTENEGRO (EUR)");
        arrayList.add("MONTSERRAT (XCD)");
        arrayList.add("MOROCCO (MAD)");
        arrayList.add("MOZAMBIQUE (MZN)");
        arrayList.add("MYANMAR (MMK)");
        arrayList.add("NAMIBIA (NAD)");
        arrayList.add("NAMIBIA (ZAR)");
        arrayList.add("NAURU (AUD)");
        arrayList.add("NEPAL (NPR)");
        arrayList.add("NETHERLANDS (THE) (EUR)");
        arrayList.add("NEW CALEDONIA (XPF)");
        arrayList.add("NEW ZEALAND (NZD)");
        arrayList.add("NICARAGUA (NIO)");
        arrayList.add("NIGER (THE) (XOF)");
        arrayList.add("NIGERIA (NGN)");
        arrayList.add("NIUE (NZD)");
        arrayList.add("NORFOLK ISLAND (AUD)");
        arrayList.add("NORTHERN MARIANA ISLANDS (THE) (USD)");
        arrayList.add("NORWAY (NOK)");
        arrayList.add("OMAN (OMR)");
        arrayList.add("PAKISTAN (PKR)");
        arrayList.add("PALAU (USD)");
        arrayList.add("PANAMA (PAB)");
        arrayList.add("PANAMA (USD)");
        arrayList.add("PAPUA NEW GUINEA (PGK)");
        arrayList.add("PARAGUAY (PYG)");
        arrayList.add("PERU (PEN)");
        arrayList.add("PHILIPPINES (THE) (PHP)");
        arrayList.add("PITCAIRN (NZD)");
        arrayList.add("POLAND (PLN)");
        arrayList.add("PORTUGAL (EUR)");
        arrayList.add("PUERTO RICO (USD)");
        arrayList.add("QATAR (QAR)");
        arrayList.add("REPUBLIC OF NORTH MACEDONIA (MKD)");
        arrayList.add("ROMANIA (RON)");
        arrayList.add("RUSSIAN FEDERATION (THE) (RUB)");
        arrayList.add("RWANDA (RWF)");
        arrayList.add("RÉUNION (EUR)");
        arrayList.add("SAINT BARTHÉLEMY (EUR)");
        arrayList.add("SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA (SHP)");
        arrayList.add("SAINT KITTS AND NEVIS (XCD)");
        arrayList.add("SAINT LUCIA (XCD)");
        arrayList.add("SAINT MARTIN (FRENCH PART) (EUR)");
        arrayList.add("SAINT PIERRE AND MIQUELON (EUR)");
        arrayList.add("SAINT VINCENT AND THE GRENADINES (XCD)");
        arrayList.add("SAMOA (WST)");
        arrayList.add("SAN MARINO (EUR)");
        arrayList.add("SAUDI ARABIA (SAR)");
        arrayList.add("SENEGAL (XOF)");
        arrayList.add("SERBIA (RSD)");
        arrayList.add("SEYCHELLES (SCR)");
        arrayList.add("SIERRA LEONE (SLL)");
        arrayList.add("SINGAPORE (SGD)");
        arrayList.add("SINT MAARTEN (DUTCH PART) (ANG)");
        arrayList.add("SLOVAKIA (EUR)");
        arrayList.add("SLOVENIA (EUR)");
        arrayList.add("SOLOMON ISLANDS (SBD)");
        arrayList.add("SOMALIA (SOS)");
        arrayList.add("SOUTH AFRICA (ZAR)");
        arrayList.add("SPAIN (EUR)");
        arrayList.add("SRI LANKA (LKR)");
        arrayList.add("SUDAN (THE) (SDG)");
        arrayList.add("SURINAME (SRD)");
        arrayList.add("SVALBARD AND JAN MAYEN (NOK)");
        arrayList.add("SWAZILAND (SZL)");
        arrayList.add("SWEDEN (SEK)");
        arrayList.add("SWITZERLAND (CHF)");
        arrayList.add("SYRIAN ARAB REPUBLIC (SYP)");
        arrayList.add("TAIWAN (PROVINCE OF CHINA) (TWD)");
        arrayList.add("TAJIKISTAN (TJS)");
        arrayList.add("TANZANIA, UNITED REPUBLIC OF (TZS)");
        arrayList.add("THAILAND (THB)");
        arrayList.add("TIMOR-LESTE (USD)");
        arrayList.add("TOGO (XOF)");
        arrayList.add("TOKELAU (NZD)");
        arrayList.add("TONGA (TOP)");
        arrayList.add("TRINIDAD AND TOBAGO (TTD)");
        arrayList.add("TUNISIA (TND)");
        arrayList.add("TURKEY (TRY)");
        arrayList.add("TURKMENISTAN (TMT)");
        arrayList.add("TURKS AND CAICOS ISLANDS (THE) (USD)");
        arrayList.add("TUVALU (AUD)");
        arrayList.add("UGANDA (UGX)");
        arrayList.add("UKRAINE (UAH)");
        arrayList.add("UNITED ARAB EMIRATES (THE) (AED)");
        arrayList.add("UNITED KINGDOM OF GREAT BRITAIN AND NORTHERN IRELAND (THE) (GBP)");
        arrayList.add("UNITED STATES MINOR OUTLYING ISLANDS (THE) (USD)");
        arrayList.add("UNITED STATES OF AMERICA (THE) (USD)");
        arrayList.add("URUGUAY (UYU)");
        arrayList.add("UZBEKISTAN (UZS)");
        arrayList.add("VANUATU (VUV)");
        arrayList.add("VENEZUELA (BOLIVARIAN REPUBLIC OF) (VEF)");
        arrayList.add("VIETNAM (VND)");
        arrayList.add("VIRGIN ISLANDS (BRITISH) (USD)");
        arrayList.add("VIRGIN ISLANDS (U.S.) (USD)");
        arrayList.add("WALLIS AND FUTUNA (XPF)");
        arrayList.add("WESTERN SAHARA (MAD)");
        arrayList.add("YEMEN (YER)");
        arrayList.add("ZAMBIA (ZMW)");
        arrayList.add("ZIMBABWE (ZWL)");
        arrayList.add("ÅLAND ISLANDS (EUR)");

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner2.setAdapter(arrayAdapter);

        //final Integer stopRunExec = 0;
        //outerLoop:
        //do {
        textView=(TextView)findViewById(R.id.textView2);
            final Button button = findViewById(R.id.button);
            final ImageButton imageButton = findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer val=arrayAdapter.getPosition(spinner.getSelectedItem().toString());
                String conValTest=spinner2.getSelectedItem().toString();
                Integer valNew=arrayAdapter.getPosition(spinner2.getSelectedItem().toString());
                spinner2.setSelection(val);
                spinner.setSelection(valNew);

            }
        });

            button.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    //Drawable dr = getResources().getDrawable(R.drawable.button_pressed);
                    //dr.setColorFilter(Color.parseColor("#FF0000"), PorterDuff.Mode.SRC_ATOP);
                    final ConstraintLayout layout=(ConstraintLayout)findViewById(R.id.cLayout);

                    final EditText mEdit = findViewById(R.id.editTextNumber);
                    String amtVal = mEdit.getText().toString();
                    String convertFromText = spinner.getSelectedItem().toString();
                    String convertToText = spinner2.getSelectedItem().toString();

                    String convertFromTextnew = convertFromText.substring(convertFromText.length() - 4, convertFromText.length() - 1);
                    String convertToTextnew = convertToText.substring(convertToText.length() - 4, convertToText.length() - 1);


                    if (!amtVal.isEmpty()) {

                        Double newAmtVal = Double.valueOf(amtVal);
                        Toast.makeText(MainActivity.this, "Please Wait..", Toast.LENGTH_SHORT).show();
                        try {
                            convertCurrency(convertFromTextnew,convertToTextnew,newAmtVal);
                            //layout.setBackgroundColor(Color.parseColor("#00ff15"));
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "Something went wrong...", Toast.LENGTH_SHORT).show();
                            //layout.setBackgroundColor(Color.parseColor("#ff4f4f"));
                            e.printStackTrace();
                        }
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Please enter amount Value!", Toast.LENGTH_SHORT).show();

                        }
                }
            });

        }

    public void convertCurrency(String convertFromTextnew, String convertToTextnew, final Double newAmtVal) {

        String newUrl = "https://free.currconv.com/api/v7/convert?q=" + convertFromTextnew + "_" + convertToTextnew + "&compact=ultra&apiKey=9437dc2ba5814d45852e";

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(newUrl)
                .header("Content-Type", "application/json")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                String mMessage = e.getMessage().toString();
                Log.w("failure Response", mMessage);
                Toast.makeText(MainActivity.this, mMessage, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(final Response response) throws IOException {
                final String mMessage = response.body().string();
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //Toast.makeText(MainActivity.this, mMessage, Toast.LENGTH_SHORT).show();
                        try {

                            String[] splitInlineVal = mMessage.split(":");
                            String getAmtVal = (String) Array.get(splitInlineVal, 1);
                            String finalAmtVal = getAmtVal.substring(0,(getAmtVal.length()-1));
                            Double finalAmtValtoUse=Double.valueOf(finalAmtVal);

                            Double amtValtodisplay=finalAmtValtoUse*newAmtVal;

                            DecimalFormat dec_for = new DecimalFormat("0.0000"); //Make new decimal format
                            String formattedAmount=dec_for.format(amtValtodisplay);

                            textView.setText(String.valueOf(formattedAmount));

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                });
            }

        });

    }


}

