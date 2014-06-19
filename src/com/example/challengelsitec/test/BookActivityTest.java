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
		assertTrue(book.startsWith("www.daisyindia.org"));
		assertTrue(book.contains("www.daisyindia.org".trim()));
		assertTrue(book.contains("capabilities that survived".trim()));
		assertTrue(book.contains("You will need to assess".trim()));
		assertTrue(book.contains("latex barrier will help prevent infection".trim()));
		assertTrue(book.contains("Glowsticks. Candles are a safety hazard,".trim()));
		assertTrue(book.contains("so--your property is not worth".trim()));
		assertTrue(book.contains("Evacuate immediately if you suspect imminent danger".trim()));
	}

}
