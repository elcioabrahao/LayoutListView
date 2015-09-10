package br.usjt.arqdsis.layoutlistview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Tela2Activity extends ListActivity {

    private String[] estados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

       estados = new String[]{"Sâo Paulo","Rio de Janeiro","Allagoas","Sergipe","Ceara","Maranhão"};

        this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, estados));


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){

        super.onListItemClick(l, v, position, id);

        Object o = this.getListAdapter().getItem(position);

        String estadoClicado = o.toString();

        Toast.makeText(this, "Você clicou no estado: "+estadoClicado, Toast.LENGTH_LONG).show();



    }


}
