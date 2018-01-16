package com.myapp.caloriemate.test;
import com.myapp.caloriemate.*;
import android.util.Log;
import android.content.pm.ActivityInfo;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.*;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.EspressoKey;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.uiautomator.*;
import android.support.test.runner.AndroidJUnit4;
import org.hamcrest.*;
import android.support.test.espresso.assertion.ViewAssertions;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Pair;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.view.View;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.Random;
import com.myapp.caloriemate.R;
@RunWith(AndroidJUnit4.class)
	public class ActivityTest30{
	private UiDevice mDevice;
	private Intent temp;
	@Rule
	public ActivityTestRule<com.myapp.caloriemate.MainActivity> mActivityRule = new ActivityTestRule(com.myapp.caloriemate.MainActivity.class);
	@Before
	public void setUp() throws Exception{
		mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
	}
	@After
	public void tearDown() throws Exception{}
@Test
public void testnumber0() 
{
	Log.d("TestExecutionStarted","TestCase0");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase0");
}

@Test
public void testnumber1() 
{
	Log.d("TestExecutionStarted","TestCase1");

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase1");
}

@Test
public void testnumber2() 
{
	Log.d("TestExecutionStarted","TestCase2");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase2");
}

@Test
public void testnumber3() 
{
	Log.d("TestExecutionStarted","TestCase3");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase3");
}

@Test
public void testnumber4() 
{
	Log.d("TestExecutionStarted","TestCase4");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase4");
}

@Test
public void testnumber5() 
{
	Log.d("TestExecutionStarted","TestCase5");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase5");
}

@Test
public void testnumber6() 
{
	Log.d("TestExecutionStarted","TestCase6");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase6");
}

@Test
public void testnumber7() 
{
	Log.d("TestExecutionStarted","TestCase7");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase7");
}

@Test
public void testnumber8() 
{
	Log.d("TestExecutionStarted","TestCase8");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase8");
}

@Test
public void testnumber9() 
{
	Log.d("TestExecutionStarted","TestCase9");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase9");
}

@Test
public void testnumber10() 
{
	Log.d("TestExecutionStarted","TestCase10");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase10");
}

@Test
public void testnumber11() 
{
	Log.d("TestExecutionStarted","TestCase11");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase11");
}

@Test
public void testnumber12() 
{
	Log.d("TestExecutionStarted","TestCase12");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase12");
}

@Test
public void testnumber13() 
{
	Log.d("TestExecutionStarted","TestCase13");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase13");
}

@Test
public void testnumber14() 
{
	Log.d("TestExecutionStarted","TestCase14");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase14");
}

@Test
public void testnumber15() 
{
	Log.d("TestExecutionStarted","TestCase15");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase15");
}

@Test
public void testnumber16() 
{
	Log.d("TestExecutionStarted","TestCase16");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase16");
}

@Test
public void testnumber17() 
{
	Log.d("TestExecutionStarted","TestCase17");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase17");
}

@Test
public void testnumber18() 
{
	Log.d("TestExecutionStarted","TestCase18");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase18");
}

@Test
public void testnumber19() 
{
	Log.d("TestExecutionStarted","TestCase19");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase19");
}

@Test
public void testnumber20() 
{
	Log.d("TestExecutionStarted","TestCase20");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase20");
}

@Test
public void testnumber21() 
{
	Log.d("TestExecutionStarted","TestCase21");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase21");
}

@Test
public void testnumber22() 
{
	Log.d("TestExecutionStarted","TestCase22");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase22");
}

@Test
public void testnumber23() 
{
	Log.d("TestExecutionStarted","TestCase23");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase23");
}

@Test
public void testnumber24() 
{
	Log.d("TestExecutionStarted","TestCase24");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase24");
}

@Test
public void testnumber25() 
{
	Log.d("TestExecutionStarted","TestCase25");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase25");
}

@Test
public void testnumber26() 
{
	Log.d("TestExecutionStarted","TestCase26");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase26");
}

@Test
public void testnumber27() 
{
	Log.d("TestExecutionStarted","TestCase27");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase27");
}

@Test
public void testnumber28() 
{
	Log.d("TestExecutionStarted","TestCase28");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase28");
}

@Test
public void testnumber29() 
{
	Log.d("TestExecutionStarted","TestCase29");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase29");
}

@Test
public void testnumber30() 
{
	Log.d("TestExecutionStarted","TestCase30");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase30");
}

@Test
public void testnumber31() 
{
	Log.d("TestExecutionStarted","TestCase31");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase31");
}

@Test
public void testnumber32() 
{
	Log.d("TestExecutionStarted","TestCase32");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase32");
}

@Test
public void testnumber33() 
{
	Log.d("TestExecutionStarted","TestCase33");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase33");
}

@Test
public void testnumber34() 
{
	Log.d("TestExecutionStarted","TestCase34");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase34");
}

@Test
public void testnumber35() 
{
	Log.d("TestExecutionStarted","TestCase35");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase35");
}

@Test
public void testnumber36() 
{
	Log.d("TestExecutionStarted","TestCase36");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase36");
}

@Test
public void testnumber37() 
{
	Log.d("TestExecutionStarted","TestCase37");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase37");
}

@Test
public void testnumber38() 
{
	Log.d("TestExecutionStarted","TestCase38");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase38");
}

@Test
public void testnumber39() 
{
	Log.d("TestExecutionStarted","TestCase39");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase39");
}

@Test
public void testnumber40() 
{
	Log.d("TestExecutionStarted","TestCase40");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase40");
}

@Test
public void testnumber41() 
{
	Log.d("TestExecutionStarted","TestCase41");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase41");
}

@Test
public void testnumber42() 
{
	Log.d("TestExecutionStarted","TestCase42");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase42");
}

@Test
public void testnumber43() 
{
	Log.d("TestExecutionStarted","TestCase43");

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase43");
}

@Test
public void testnumber44() 
{
	Log.d("TestExecutionStarted","TestCase44");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase44");
}

@Test
public void testnumber45() 
{
	Log.d("TestExecutionStarted","TestCase45");

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase45");
}

@Test
public void testnumber46() 
{
	Log.d("TestExecutionStarted","TestCase46");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase46");
}

@Test
public void testnumber47() 
{
	Log.d("TestExecutionStarted","TestCase47");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase47");
}

@Test
public void testnumber48() 
{
	Log.d("TestExecutionStarted","TestCase48");

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase48");
}

@Test
public void testnumber49() 
{
	Log.d("TestExecutionStarted","TestCase49");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase49");
}

@Test
public void testnumber50() 
{
	Log.d("TestExecutionStarted","TestCase50");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase50");
}

@Test
public void testnumber51() 
{
	Log.d("TestExecutionStarted","TestCase51");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase51");
}

@Test
public void testnumber52() 
{
	Log.d("TestExecutionStarted","TestCase52");

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase52");
}

@Test
public void testnumber53() 
{
	Log.d("TestExecutionStarted","TestCase53");

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase53");
}

@Test
public void testnumber54() 
{
	Log.d("TestExecutionStarted","TestCase54");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase54");
}

@Test
public void testnumber55() 
{
	Log.d("TestExecutionStarted","TestCase55");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase55");
}

@Test
public void testnumber56() 
{
	Log.d("TestExecutionStarted","TestCase56");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase56");
}

@Test
public void testnumber57() 
{
	Log.d("TestExecutionStarted","TestCase57");

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase57");
}

@Test
public void testnumber58() 
{
	Log.d("TestExecutionStarted","TestCase58");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase58");
}

@Test
public void testnumber59() 
{
	Log.d("TestExecutionStarted","TestCase59");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("7521"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("7"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase59");
}

@Test
public void testnumber60() 
{
	Log.d("TestExecutionStarted","TestCase60");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase60");
}

@Test
public void testnumber61() 
{
	Log.d("TestExecutionStarted","TestCase61");

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText(""));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("851246"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("5"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("1"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("235"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase61");
}

@Test
public void testnumber62() 
{
	Log.d("TestExecutionStarted","TestCase62");

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase62");
}

@Test
public void testnumber63() 
{
	Log.d("TestExecutionStarted","TestCase63");

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.weight_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.height_input)).perform(ViewActions.clearText(),ViewActions.typeText("17537"));
		Espresso.closeSoftKeyboard();

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("0"));
		Espresso.closeSoftKeyboard();

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("2"));
		Espresso.closeSoftKeyboard();

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for EditText
	Espresso.onView(ViewMatchers.withId(R.id.age_input)).perform(ViewActions.clearText(),ViewActions.typeText("4"));
		Espresso.closeSoftKeyboard();

		//Event for a switch
			Espresso.onView(ViewMatchers.withId(R.id.switch1)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton9)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());


	Log.d("TestExecutionFinished","TestCase63");
}

@Test
public void testnumber64() 
{
	Log.d("TestExecutionStarted","TestCase64");

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.next_button)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();
		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
		Espresso.pressBack();
		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton2)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton8)).perform(ViewActions.click());

		//Event for a radiobutton
					Espresso.onView(ViewMatchers.withId(R.id.radioButton10)).perform(ViewActions.click());

		//Event for a button
			Espresso.onView(ViewMatchers.withId(R.id.calc_calories)).perform(ViewActions.click());

//Event for a menu item
	mDevice.pressKeyCode(276);
	mDevice.pressKeyCode(224);
//Event for a menu item
		Espresso.pressBack();

	Log.d("TestExecutionFinished","TestCase64");
}

}

