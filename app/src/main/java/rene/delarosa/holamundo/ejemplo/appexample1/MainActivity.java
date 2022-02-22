package rene.delarosa.holamundo.ejemplo.appexample1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Aplicación Creada", Toast.LENGTH_SHORT).show();

        //et1 = "casting" (EditText) findViewById(R.id.txt_num1); dentro del parentesis tipo dato a convertir
        //Clase ...encontrar vista por Id(clase R puente con parte grafica, con identificador de EditText )
        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.text_resultado);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Aplicacion Iniciada", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Aplicación en Curso", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

    //Este método Realiza la suma de los 2 numeros
    public void Sumar (View view){
        String valor1 = et1.getText().toString(); //Recibir texto, reservar variable String
                                                    //Recuperar con getText()
                                                    //Parciar a tipo String .toString()
        String valor2 = et2.getText().toString();
        //convertir valores string a Entero
        int num1 =Integer.parseInt(valor1); // Parseo de tipo String a Int con Integer.parseInt(nombre variable string)
        int num2 =Integer.parseInt(valor2);
        //Hasta aqui ya tenemos los valores con las variables correspondientes

        int suma = num1 + num2;  //operacion

        String result = String.valueOf(suma); //declaramos string para asignarle valor entero mediante String.valueof()
        tv1.setText(result); //Esta Linea establece la variable textview llamada <<Result>>.
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Aplicación en Pausa", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Aplicación Detenida", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Aplicación Eliminada", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }
}