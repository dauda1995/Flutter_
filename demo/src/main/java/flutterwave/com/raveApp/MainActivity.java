package flutterwave.com.raveApp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.common.collect.Lists;

import java.util.Map;


import flutterwave.com.rave.Components.RaveDialog;
import flutterwave.com.rave.models.RaveData;
import flutterwave.com.rave.utils.RaveAuthModel;


public class MainActivity extends AppCompatActivity {

    private Button raveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        raveButton = (Button)findViewById(R.id.rave_btn);

        raveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RaveData raveData = new RaveData.Builder(
                        "Aso Ebi and gele",
                        "Aso Ebi and gele for Dauda",
                        1400.00,
                        "FLWPUBK-0d554f6d7407838ac8053b7c90662f18-X",
                        "FLWSECK-a48e913b79bed67dd4779e119a24c945-X",
                        "dauda933@gmail.com",
                        "rave-checkout-1485623235",
                        RaveAuthModel.PIN)
                        .build();
                RaveDialog rave = new RaveDialog(MainActivity.this, raveData);
                rave.show();
            }
        });
    }
}
