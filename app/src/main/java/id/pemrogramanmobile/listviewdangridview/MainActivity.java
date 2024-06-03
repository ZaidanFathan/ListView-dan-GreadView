package id.pemrogramanmobile.listviewdangridview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterList myAdapter;
    private List<ItemList> itemlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemlist = new ArrayList<>();
        itemlist.add(new ItemList("", "", ""));
        itemlist.add(new ItemList("", "", ""));
        itemlist.add(new ItemList("", "", ""));

        myAdapter = new AdapterList(itemlist);
        recyclerView.setAdapter((RecyclerView.Adapter) myAdapter);

        itemlist = new ArrayList<>();
        itemlist.add(new ItemList("Indonesia Merdeka", "Indonesia merdeka Tahun 1945", "https://via.placeholder.com/150"));
        itemlist.add(new ItemList("Indonesia Merdeka", "Indonesia merdeka Tahun 1945", "https://via.placeholder.com/150"));
        itemlist.add(new ItemList("Indonesia Merdeka", "Indonesia merdeka Tahun 1945", "https://via.placeholder.com/150"));

    }
}