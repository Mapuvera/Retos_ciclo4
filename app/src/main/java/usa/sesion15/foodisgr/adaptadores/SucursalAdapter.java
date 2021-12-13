package usa.sesion15.foodisgr.adaptadores;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import usa.sesion15.foodisgr.R;
import usa.sesion15.foodisgr.modelos.Servicio;
import usa.sesion15.foodisgr.modelos.Sucursal;

public class SucursalAdapter extends BaseAdapter {
    Context context;
    ArrayList<Sucursal> sucursales;
    LayoutInflater inflater;

    public SucursalAdapter(Context context, ArrayList<Sucursal> productos) {
        this.context = context;
        this.sucursales = sucursales;
    }

    @Override
    public int getCount() {
        return sucursales.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }
        if (convertView == null){
            convertView = inflater.inflate(R.layout.grid_item, null);
        }

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView campo1 = convertView.findViewById(R.id.tvCampo1);
        TextView campo2 = convertView.findViewById(R.id.tvCampo2);
        TextView campo3 = convertView.findViewById(R.id.tvCampo3);
        TextView campoId = convertView.findViewById(R.id.tvId);

        Sucursal  sucursal =  sucursales.get(position);
        byte[] image = sucursal.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);

        campoId.setText("ID: "+ sucursal.getId());
        campo1.setText(sucursal.getName());
        campo2.setText(sucursal.getDescripcion());
        campo3.setText(sucursal.getUbicacion());
        imageView.setImageBitmap(bitmap);

        return convertView;
    }

}
