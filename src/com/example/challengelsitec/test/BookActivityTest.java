package com.example.challengelsitec.test;

import java.io.IOException;
import java.io.InputStream;
import android.content.res.AssetManager;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import com.example.challengelsitec.BookActivity;

public class BookActivityTest extends ActivityInstrumentationTestCase2<BookActivity> {

	private BookActivity mainActivity;
    private AssetManager assetManager;
    
    public BookActivityTest() {
		super(BookActivity.class);
	}
    
	@Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
        assetManager = getInstrumentation().getContext().getAssets();
    }
	
	public void testPreconditions() {
	    assertNotNull(mainActivity);
	}
	
	/**
	 * A test for the input xml file located in assets folder: inputBook1.xml
	 */
	public void testParseXml1(){
		InputStream inputStream = null;
		try {
			inputStream = assetManager.open("inputBook1.xml");
		} catch (IOException e) {
			e.printStackTrace();
			Log.e("HW"," IOException" + e.getMessage());
		}
		String book = mainActivity.parseXML(inputStream);
	    assertEquals("", book);
	}
	
	/**
	 * A test for the input xml file located in assets folder: inputBook2.xml
	 */
	public void testParseXml2(){
		InputStream inputStream = null;
		try {
			inputStream = assetManager.open("inputBook2.xml");
		} catch (IOException e) {
			e.printStackTrace();
			Log.e("HW"," IOException" + e.getMessage());
		}
		String book = mainActivity.parseXML(inputStream);
	    assertEquals("Paragrafo 2".trim(), book.trim());
	}
	
	/**
	 * A test for the input xml file located in assets folder: inputBook3.xml
	 */
	public void testParseXml3(){
		InputStream inputStream = null;
		try {
			inputStream = assetManager.open("inputBook3.xml");
		} catch (IOException e) {
			e.printStackTrace();
			Log.e("HW"," IOException" + e.getMessage());
		}
		String book = mainActivity.parseXML(inputStream);
	    assertEquals("Glowsticks. Candles are NOT to be used because of gas leaks, explosive matter, flammable matter in the area.".trim(), book.trim());
	}
	
	/**
	 * A test for the input xml file located in assets folder: inputBook4.xml
	 */
	public void testParseXml4(){
		InputStream inputStream = null;
		try {
			inputStream = assetManager.open("inputBook4.xml");
		} catch (IOException e) {
			e.printStackTrace();
			Log.e("HW"," IOException" + e.getMessage());
		}
		String book = mainActivity.parseXML(inputStream);
	    assertEquals("Texto".trim(), book.trim());
	}
	
	/**
	 * A test for the input xml file located in assets folder: inputBook5.xml
	 */
	public void testParseXml5(){
		InputStream inputStream = null;
		try {
			inputStream = assetManager.open("inputBook5.xml");
		} catch (IOException e) {
			e.printStackTrace();
			Log.e("HW"," IOException" + e.getMessage());
		}
		String book = mainActivity.parseXML(inputStream);
	    assertEquals("www.daisyindia.org".trim(), book.trim());
	}
	
	/**
	 * A test for the input xml file located in assets folder: inputBook6.xml
	 */
	public void testParseXml6(){
		InputStream inputStream = null;
		try {
			inputStream = assetManager.open("inputBook6.xml");
		} catch (IOException e) {
			e.printStackTrace();
			Log.e("HW"," IOException" + e.getMessage());
		}
		String book = mainActivity.parseXML(inputStream);
		String output = "Fix potential hazards in your home. Once you've identified potential disaster scenarios, thoroughly inspect your house and try to make it as safe as possible. Here are just a few examples:";
	    assertEquals(output.trim(), book.trim());
	}
	
	/**
	 * A test for the input xml file located in assets folder: livro.xml
	 */
	public void testParseXml7(){
		InputStream inputStream = null;
		try {
			inputStream = assetManager.open("livro.xml");
		} catch (IOException e) {
			e.printStackTrace();
			Log.e("HW"," IOException" + e.getMessage());
		}
		String book = mainActivity.parseXML(inputStream);
		String output = "www.daisyindia.org Fix potential hazards in your home. Once you've identified potential disaster scenarios, thoroughly inspect your house and try to make it as safe as possible. Here are just a few examples: It is a good idea to pick two or three emergency contacts, one who lives outside of your local area code in addition to one who lives within and also someone who can receive text messages. In major disasters one can often call a number outside your area code but not within. In extreme cases, people have had to rely on text messaging when phone lines and towers were decimated in the disaster. After Hurricane Katrina cell phones were just about useless to make calls in the affected areas, but they saved many lives and helped reunite families thanks to their text messaging capabilities that survived.  This is not intended to be a complete guide to disaster preparation. You will need to assess the unique set of potential hazards in your area and prepare for them accordingly."+  
						 "A minimum of two pairs of Latex gloves for the smallest kit. Remember, it may be a stranger who needs your help and having a latex barrier will help prevent infection.  Go to the store to buy the items you don't already have.  Glowsticks. Candles are a safety hazard, especially if there is gas leaks going on, explosive, flammable gas is in the area. Using candles can cause a fire, even a explosion.  During episodes of civil unrest, many people fail to heed warnings to evacuate so that they can protect their homes or businesses. Consider this decision carefully, as it may put you in grave danger. It's important to remember that if looters strike you will likely be outnumbered, and your attackers may be armed. If you can evacuate, it's usually better to do so--your property is not worth your life.  Landslides are extremely dangerous and nothing to played around with. Evacuate immediately if you suspect imminent danger.";
	    assertEquals(output.startsWith("www.daisyindia.org"), book.startsWith("www.daisyindia.org"));
	    assertEquals(output.contains("Fix potential hazards in your home".trim()), book.contains("Fix potential hazards in your home".trim()));
	    assertEquals(output.contains("capabilities that survived".trim()), book.contains("capabilities that survived".trim()));
	    assertEquals(output.contains("You will need to assess".trim()), book.contains("You will need to assess".trim()));
	    assertEquals(output.contains("latex barrier will help prevent infection".trim()), book.contains("latex barrier will help prevent infection".trim()));
	    assertEquals(output.contains("Glowsticks. Candles are a safety hazard,".trim()), book.contains("Glowsticks. Candles are a safety hazard,".trim()));
	    assertEquals(output.contains("so--your property is not worth".trim()), book.contains("so--your property is not worth".trim()));
	    assertEquals(output.contains("Evacuate immediately if you suspect imminent danger".trim()), book.contains("Evacuate immediately if you suspect imminent danger".trim()));
	}

}
