package es.officetattoo.www.clase19recycleviewtarea1movies;



import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterPeliculas extends RecyclerView.Adapter<AdapterPeliculas.MovieViewHolder> {



    private List<Movie> listaPeliculas;
    private Context context;
    private ImageView imageView;
    private String packageName;



    //La declaracion del metodo Movie view Holder
    public class MovieViewHolder extends RecyclerView.ViewHolder {

        private TextView apTitulo;
        private TextView apGenero;
        private TextView apDescripcion;
        private ImageView apImagen;


        //Identificadores de elemontos en el xml
        public MovieViewHolder(View itemView) {
            super(itemView);

            apTitulo = (TextView) itemView.findViewById(R.id.id_Titulo_item);
            apGenero = (TextView) itemView.findViewById(R.id.id_Genero_item);
            apDescripcion = (TextView) itemView.findViewById(R.id.id_Descripcion_item);
            apImagen = (ImageView) itemView.findViewById(R.id.id_Imagen_iteam);


        }
    }

    public AdapterPeliculas(Context context , List<Movie> pelis) {
        this.listaPeliculas = pelis;

    }

    //Sobre ecribir metodo viewHolder selecciona que xml otiliza
    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.aparencia, parent, false);
        return new MovieViewHolder(v);

    }

    //Sobre escribir metodo onBindViewHolder
    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder movieViewHolder, int position) {

        Movie movie = this.listaPeliculas.get(position);

       // movieViewHolder.apTitulo.setText(movie.getTitulo());
       // movieViewHolder.apGenero.setText(movie.getGenero());
      //  movieViewHolder.apDescripcion.setText(movie.getDescripcion());

        TextView tvTiyulo = movieViewHolder.apTitulo;
        tvTiyulo.setText(movie.titulo);
        TextView tvDescripcion = movieViewHolder.apDescripcion;
        tvDescripcion.setText(movie.imagen);

        ImageView tvImageView = movieViewHolder.apImagen;
// Image setting
        Resources res = getContext().getResources();
       int resID = res.getIdentifier(movie.imagen , "drawable", getContext().getPackageName());
        tvImageView.setImageResource(resID);
       

    }




    //Metodo Context
    private Context getContext(){
        return this.context;
    }

    //Metodo que devuelve el tamaño del array
    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }




}



