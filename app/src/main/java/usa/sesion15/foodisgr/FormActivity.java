package usa.sesion15.foodisgr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {
    private TextView Titulo;
    String name ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Titulo =(TextView)findViewById(R.id.titulo);
    Intent intent = getIntent();
        name = intent.getStringExtra("name");

        Titulo.setText(name);

    }
}