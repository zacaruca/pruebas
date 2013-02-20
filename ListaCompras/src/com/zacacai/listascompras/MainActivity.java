package com.zacacai.listascompras;

import android.os.Bundle;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.zacacai.listascompras.R;

public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	// --Sobre escribimos el metodo para saber que item fue pulsado
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			// --Llamamos al metodo que sabe que itema fue seleccionado
			return MenuSelecciona(item);
		}

		private boolean MenuSelecciona(MenuItem item) {
			switch (item.getItemId()) {

			case 0:
				
				Toast.makeText(this, "Has pulsado el Home del Action Bar",
						Toast.LENGTH_SHORT).show();
				return true;

			case 1:
				Toast.makeText(this, "Has pulsado el Item 2 del Action Bar",
						Toast.LENGTH_SHORT).show();
				return true;

			case 2:
				Toast.makeText(this, "Has pulsado el Item 3 del Action Bar",
						Toast.LENGTH_SHORT).show();
				return true;

			case 3:
				Toast.makeText(this, "Has pulsado el Item 4 del Action Bar",
						Toast.LENGTH_SHORT).show();
				return true;

			case 4:
				Toast.makeText(this, "Has pulsado el Item 5 del Action Bar",
						Toast.LENGTH_SHORT).show();
				return true;

				// --Añadimos el caso para cuando se pulse el boton home

			case android.R.id.home:
				Toast.makeText(this, "Has pulsado el Home del Action Bar",
						Toast.LENGTH_SHORT).show();
				return true;

			}
			return false;
		}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.activity_main, menu);
		// --Creamos un metodo para crear cada item
		CrearMenu(menu);
		return true;
	}

	private void CrearMenu(Menu menu) {

		MenuItem item1 = menu.add(0, 0, 0, "Añadir Lista");
		{
			// --Copio las imagenes que van en cada item
			item1.setIcon(android.R.drawable.ic_menu_edit);
			item1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

		MenuItem item2 = menu.add(0, 1, 1, "Item 2");
		{
			item2.setIcon(R.drawable.calendar);
			item2.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

		MenuItem item3 = menu.add(0, 2, 2, "Item 3");
		{
			item3.setIcon(R.drawable.question);
			item3.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
			// item3.setVisible(false);
		}

		MenuItem item4 = menu.add(0, 3, 3, "Item 4");
		{
			item4.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

		MenuItem item5 = menu.add(0, 4, 4, "Item 5");
		{
			item5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

	}

}
