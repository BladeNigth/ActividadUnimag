package co.edu.unimagdalena.apmoviles.actividadunimag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptadorAutos extends ArrayAdapter<Auto> {
    private Context context;
    private ArrayList<Auto> autos;
    private LayoutInflater inflater;

    public AdaptadorAutos(@NonNull Context context, ArrayList<Auto> autos) {
        super(context,  0, autos);
        this.context = context;
        this.autos = autos;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Nullable
    @Override
    public Auto getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       // return super.getView(position, convertView, parent);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.fila_autos,null);
        }
        Auto a = getItem(position);
        TextView modelo = convertView.findViewById(R.id.txtmodelo);
        TextView marca = convertView.findViewById(R.id.txtmarca);
        TextView placa = convertView.findViewById(R.id.txtplaca);
        modelo.setText(a.modelo);
        marca.setText(a.marca);
        placa.setText(a.placa);

       return convertView;
    }
}
