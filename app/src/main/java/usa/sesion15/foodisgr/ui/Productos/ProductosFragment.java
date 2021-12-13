package usa.sesion15.foodisgr.ui.Productos;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import usa.sesion15.foodisgr.FormActivity;
import usa.sesion15.foodisgr.R;
import usa.sesion15.foodisgr.databinding.FragmentProductosBinding;

public class ProductosFragment extends Fragment {


    private FragmentProductosBinding binding;
    ImageView img1,img2,img3,img4,img5;
    Drawable drawable1, drawable2, drawable3, drawable4,drawable5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentProductosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_agregar:
                Intent intent = new Intent(getContext(), FormActivity.class);
                intent.putExtra("name","PRODUCTOS");
                getActivity().startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}