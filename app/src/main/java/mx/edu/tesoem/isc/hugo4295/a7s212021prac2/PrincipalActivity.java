package mx.edu.tesoem.isc.hugo4295.a7s212021prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void opcsumar(View v){
        Intent intent = new Intent(this, SumarActivity.class);
        startActivity(intent);
    }
}