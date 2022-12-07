package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.content.res.Resources;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bgButton;
    private ConstraintLayout layouts;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        Button bgButton = (Button) findViewById(R.id.button_fon);
        bgButton.setOnClickListener(this);

        layouts = findViewById(R.id.ConstraintLayout);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final CharSequence[] items = {getText(R.string.red), getText(R.string.yellow), getText(R.string.green)};

        builder.setTitle(R.string.message);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case 0:
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        layouts.setBackgroundResource(R.color.redColor);
                        break;
                    case 1:
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();
                        layouts.setBackgroundResource(R.color.yellowColor);
                        break;
                    case 2:
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        layouts.setBackgroundResource(R.color.greenColor);
                        break;
                }

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}