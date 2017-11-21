package proyectotitulo2017.alarmacomunitariav2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MensajeActivity extends AppCompatActivity {

    private Button grabadorVoz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);
    }

    public void onclickMsgAlerta(View view){
        alertOneButton();
    }

    public void onClickScreenMsgVoz(View view){
        grabadorVoz =(Button) findViewById(R.id.btnGrabadorVoz);
        Intent intent = new Intent(MensajeActivity.this, GrabarVozActivity.class);
        startActivity(intent);
    }

    public void alertOneButton() {

        AlertDialog alertDialog = new AlertDialog.Builder(MensajeActivity.this)
                .setTitle("Alerta enviada")
                .setMessage("Se ha enviado un mensaje a todos los usuarios de la comunidad")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                }).show();
    }
}
