package com.example.apppreppm_eva1;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Page2dr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2dr);

        Button buttonGoBack=findViewById(R.id.buttonGoBack);
        TextView TextViewNick=findViewById(R.id.TextViewNick);

        Intent Pagina1 = new Intent(this, MainActivity.class);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String receivedVariable1 = bundle.getString("variableWordQT");
        int receivedVariable2 = bundle.getInt("variableNumberQT");

        TextViewNick.setText("Your nickname is: "+receivedVariable1+receivedVariable2);





        buttonGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "HI WHORE :)");

                Bundle bundle = new Bundle();
                bundle.putString("variableWordQT", receivedVariable1+receivedVariable2);
                Pagina1.putExtras(bundle);

                startActivity(Pagina1);
            }
        });

    }
}