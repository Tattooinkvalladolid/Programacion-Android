package es.officetattoo.www.tarea2clase18adapterpeliculas;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_Peliculas extends ArrayAdapter<Peliculas_Contenido> {



    public  Adapter_Peliculas(Context context, ArrayList<Peliculas_Contenido> peli){

        super(context,0,peli);

    }


    public View getView(int position, View convertView, ViewGroup parent){

         Peliculas_Contenido peliculas_contenido =  getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_personalizado,parent,false);

        }

        TextView titulo = (TextView) convertView.findViewById(R.id.AP_Titulo_Peli);
        TextView genero = (TextView) convertView.findViewById(R.id.AP_Genero_Peli);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.AP_Imgaen);

        titulo.setText(peliculas_contenido.TituloPelicula);
        genero.setText(peliculas_contenido.GeneroPelicula);

        Resources img = getContext().getResources();

        int imgID = img.getIdentifier(peliculas_contenido.ImagenCaratula,"drawable",getContext().getPackageName());

        imageView.setImageResource(imgID);

        return convertView;
    }

}
