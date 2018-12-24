package es.officetattoo.www.clase19recycleviewtarea1movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movies;
    private RecyclerView listaMovies;
    private AdapterPeliculas adapterPeliculas;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMovies = (RecyclerView) findViewById(R.id.id_RecycleView_am);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listaMovies.setLayoutManager(linearLayoutManager);

        datos();
        inicarAdapter();
    }

    private void datos() {
        movies = new ArrayList<>();
        movies.add(new Movie("AmericanNinja1","Accion","DEscripciom","aladin"));
        movies.add(new Movie("AmericanNinja1","Accion","DEscripciom","aladin"));
        movies.add(new Movie("AmericanNinja1","Accion","DEscripciom","aladin"));
        movies.add(new Movie("AmericanNinja1","Accion","DEscripciom","aladin"));
        movies.add(new Movie("AmericanNinja1","Accion","DEscripciom","aladin"));
        movies.add(new Movie("AmericanNinja1","Accion","DEscripciom","aladin"));
        movies.add(new Movie("AmericanNinja1","Accion","DEscripciom","aladin"));
        movies.add(new Movie("AmericanNinja1","Accion","DEscripciom","aladin"));

        // AdapterPeliculas adapters = new AdapterPeliculas(this , movies);

    }

    private void inicarAdapter() {
        adapterPeliculas = new AdapterPeliculas(this , movies);
        listaMovies.setAdapter(adapterPeliculas);
    }


}
