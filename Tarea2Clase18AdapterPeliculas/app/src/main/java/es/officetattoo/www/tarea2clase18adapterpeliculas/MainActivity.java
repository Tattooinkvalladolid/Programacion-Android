package es.officetattoo.www.tarea2clase18adapterpeliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Peliculas_Contenido> arrayListaPeliculas;


    private void listaPeliculas() {

        arrayListaPeliculas.add(new Peliculas_Contenido("hola","mola","coca","ic_launcher_background"));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView = (ListView) findViewById(R.id.am_Lista_Personalizada);
    }

    private void ObjetoPelicula() {

        arrayListaPeliculas = new ArrayList<Peliculas_Contenido>();

        listaPeliculas();

        Adapter_Peliculas adapter = new Adapter_Peliculas(this.arrayListaPeliculas);

        listView.setAdapter(adapter);
    }


    public void onResume(){

        super.onResume();
        ObjetoPelicula();
    }


}
