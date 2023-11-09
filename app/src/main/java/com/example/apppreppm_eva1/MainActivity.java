package com.example.apppreppm_eva1;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent Pagina2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonData=findViewById(R.id.buttonData);
        EditText EditTextQT=findViewById(R.id.EditTextQT);
        EditText EditTextQT2=findViewById(R.id.EditTextQT2);
        TextView TextVDRR=findViewById(R.id.TextVDRR);

        ImageView shadowImage=findViewById(R.id.shadowImage);

        Pagina2 = new Intent(this, Page2dr.class);




try{
    Intent intent = getIntent();
    Bundle bundle = intent.getExtras();
    String receivedVariableBack = bundle.getString("variableWordQT");

    if(receivedVariableBack!=null){
        TextVDRR.setText(TextVDRR.getText()+" "+receivedVariableBack);
    }
}catch (Exception e){
    Log.v(TAG, "no previous nickname found");
}





        buttonData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Pagina2.putExtra("variableWordQT", "LoGIN CORECTO");
                //Pagina2.putExtra("variableNumberQT", 4);

                Bundle bundle = new Bundle();
                bundle.putString("variableWordQT", EditTextQT.getText().toString());
                bundle.putInt("variableNumberQT", Integer.valueOf(EditTextQT2.getText().toString()));
                Pagina2.putExtras(bundle);

                startActivity(Pagina2);

            }
        });



//same but withn the image
        shadowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Pagina2.putExtra("variableWordQT", "LoGIN CORECTO");
                //Pagina2.putExtra("variableNumberQT", 4);

                Bundle bundle = new Bundle();
                bundle.putString("variableWordQT", EditTextQT.getText().toString());
                bundle.putInt("variableNumberQT", Integer.valueOf(EditTextQT2.getText().toString()));
                Pagina2.putExtras(bundle);

                startActivity(Pagina2);

            }
        });









    }
}