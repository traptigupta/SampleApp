package com.example.sampleapp;

import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
import static android.support.test.espresso.Espresso.onView;

public class MainActivityTest {
@Rule
public ActivityTestRule<MainActivity> mActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);
   private MainActivity mActivity=null;
   public String name="Tony";
    // public Instrumentation instr=InstrumentationRegistry.getInstrumentation();
   // public Instrumentation.ActivityMonitor  (SecondActivity.class.getName(),null,false)

     //Instrumentation.ActivityMonitor monitor= instr.addMonitor(SecondActivity.class.getName(),null,false);
    @Before
    public void setUp() throws Exception {
        mActivity=mActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch(){
//View view=mActivity.findViewById(R.id.button);
       /* assertNotNull(mActivity.findViewById(R.id.button));
        Espresso.onView(withId(R.id.button)).perform(click());
        Activity secondActivity= instr.waitForMonitorWithTimeout(monitor,5000);
        assertNotNull(secondActivity);
        secondActivity.finish();*/
        Espresso.onView(withId(R.id.editText)).perform(typeText(name));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.hello)).check(matches(withText(name)));



    }

    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }
}