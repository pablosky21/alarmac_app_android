package proyectotitulo2017.alarmacomunitariav2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GrabarVozActivity extends AppCompatActivity {


    private ImageButton grabadorVoz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grabar_voz);
    }


    public void onclickMsgAlerta(View view){
        alertOneButton();
    }

    public void alertOneButton() {

        AlertDialog alertDialog = new AlertDialog.Builder(GrabarVozActivity.this)
                .setTitle("Grabar Voz")
                .setMessage("Presione para grabar, suelte para terminar la grabación")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                }).show();
    }
}
