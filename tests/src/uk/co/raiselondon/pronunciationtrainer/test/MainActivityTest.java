package uk.co.raiselondon.pronunciationtrainer.test;

import uk.co.raiselondon.pronunciationtrainer.MainActivity;
import uk.co.raiselondon.pronunciationtrainer.R;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
	private MainActivity mainActivity;
	private TextView textView;

	public MainActivityTest() {
		super(MainActivity.class);
	}
	
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
        textView = (TextView) mainActivity.findViewById(R.id.myText);
    }
    
    public void testPreconditions() {
        assertNotNull("mainActivity is null", mainActivity);
        assertNotNull("textView is null", textView);
    }
    
    public void testThatHelloWorldIsDisplayed() {
    	assertEquals("Hello world!", textView.getText().toString());
    }
}