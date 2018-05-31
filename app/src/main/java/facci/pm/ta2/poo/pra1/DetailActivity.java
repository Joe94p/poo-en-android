package facci.pm.ta2.poo.pra1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import facci.pm.ta2.poo.datalevel.DataException;
import facci.pm.ta2.poo.datalevel.DataObject;
import facci.pm.ta2.poo.datalevel.DataQuery;
import facci.pm.ta2.poo.datalevel.GetCallback;

public class DetailActivity extends AppCompatActivity {

    TextView prec;
    ImageView imag;
    TextView descrip;
    TextView Nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("PR1 :: Detail");


        // INICIO - CODE6
        //pregunta 3.1
        //recibido como parámetro en la actividad
        Nombre = findViewById(R.id.imagen);
        String c = getIntent().getExtras().getString("id2");
        Nombre.setText(c);
        //Imagen
        imag = findViewById(R.id.thumbnail);
        Intent intent = getIntent();
        Bitmap bitmap = intent.getParcelableExtra("img");
        imag.setImageBitmap(bitmap);
        //Descripcion
        descrip = findViewById(R.id.desct);
        String b = getIntent().getExtras().getString("id1");
        descrip.setText(b);
        // Precio.
        prec = findViewById(R.id.precci);
        String a = getIntent().getExtras().getString("id");
        prec.setText(a);

        // FIN - CODE6

    }

}
