package chapter.seven;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class UserInterface extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;    
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	LinearLayout bkgr = (LinearLayout)findViewById(R.id.uilayout);
    	ImageView image = (ImageView)findViewById(R.id.imageButton1);
    	
    	switch (item.getItemId()) {
	    	case R.id.buttonone:
	    		image.setImageResource(R.drawable.image1);
	    		break;
	    	case R.id.buttontwo:
	    		image.setImageResource(R.drawable.image2);
	    		break;
	    	case R.id.buttonthree:
	    		bkgr.setBackgroundResource(R.color.background2);
	    		break;
	    	case R.id.buttonfour:
	    		bkgr.setBackgroundResource(R.color.background1);
	    		break;
	    	case R.id.buttonfive:
	    		// the alert code for next section goes here!
	    		break;
    	}
    	return true;
    }
}
