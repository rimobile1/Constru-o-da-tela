package br.com.etechoracio.parimpar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        EditText txtNumero;

        TextView lblResultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                  txtNumero = findViewById(R.id.txtNumero);
                  lblResultado2 = findViewById(R.id.lblResultado2);

    }

    public  void  onProcessar(View v){
        if (txtNumero.getText().toString().isEmpty()){
            Toast.makeText(this,"Digite o valor", Toast.LENGTH_LONG).show();
        }
        else {

            int numero = Integer.parseInt(txtNumero.getText().toString());
            if (numero % 2 == 0) {
                lblResultado2.setText("Par");
            } else {
                lblResultado2.setText("Impar");
            }
        }
    }
}
