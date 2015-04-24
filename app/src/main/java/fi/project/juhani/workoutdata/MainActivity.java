package fi.project.juhani.workoutdata;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.net.URLEncoder;


public class MainActivity extends Activity {

    final String myTag = "DocsUpload";
    final String col1 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(myTag, "OnCreate()");

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        postData1();
                    }
                });
                t.start();
                Toast.makeText(getApplicationContext(), "Salikerta kirjattu ylös", Toast.LENGTH_SHORT).show();
            }

        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        postData2();
                    }
                });
                t.start();
                Toast.makeText(getApplicationContext(), "Muu harjoite kirjattu ylös", Toast.LENGTH_SHORT).show();
            }

        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        postData3();
                    }
                });
                t.start();
                Toast.makeText(getApplicationContext(), "Sairauspäivä kirjattu ylös, parane pian!", Toast.LENGTH_SHORT).show();
            }

        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                finish();
                System.exit(0);

            }

        });

}
    public void postData1() {
        String col1 = "Sali";

        String fullUrl = "https://docs.google.com/forms/d/1b8q9Fd0WwGRSM6PkoXbJVouCFEhohNm8ZIl-rgaoRY4/formResponse";
        HttpRequest mReq = new HttpRequest();


        String data = "entry.1145111841=" + URLEncoder.encode(col1);
        String response = mReq.sendPost(fullUrl, data);
        Log.i(myTag, response);
    }

    public void postData2() {
        String col1 = "Muu";

        String fullUrl = "https://docs.google.com/forms/d/1b8q9Fd0WwGRSM6PkoXbJVouCFEhohNm8ZIl-rgaoRY4/formResponse";
        HttpRequest mReq = new HttpRequest();


        String data = "entry.1145111841=" + URLEncoder.encode(col1);
        String response = mReq.sendPost(fullUrl, data);
        Log.i(myTag, response);
    }

    public void postData3() {
        String col1 = "Kipea";

        String fullUrl = "https://docs.google.com/forms/d/1b8q9Fd0WwGRSM6PkoXbJVouCFEhohNm8ZIl-rgaoRY4/formResponse";
        HttpRequest mReq = new HttpRequest();


        String data = "entry.1145111841=" + URLEncoder.encode(col1);
        String response = mReq.sendPost(fullUrl, data);
        Log.i(myTag, response);
    }


}