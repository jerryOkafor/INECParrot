package com.bellman.inecparrot.home;

/**
 * Created by Potencio on 10/2/2016.
 * <p>
 * Copyright 2016, Potencio
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;

import com.bellman.inecparrot.R;
import com.bellman.inecparrot.TestUtils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.open;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.contrib.DrawerMatchers.isOpen;
import static android.support.test.espresso.contrib.NavigationViewActions.navigateTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


/**
 * Tests for {@link DrawerLayout} layout component in {@link HomeActivity}
 * which manages navigation in the app
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class AppNavigationTests {

    /**
     * {@link ActivityTestRule} is a JUint {@link Rule @Rule} to launch your activity under test
     * <p>
     * <p>
     * Rules are interceptios which are executed for each test method and are important building
     * block for JUnit tests.
     */

    @Rule
    public ActivityTestRule<HomeActivity> mActivityTestRule =
            new ActivityTestRule<>(HomeActivity.class);



    @Test
    public void clickOnAndroidHomeIcon_OpensNavigation() {
        //check the left drawer is closed at startUp
        onView(withId(R.id.drawer_layout))
                .check(matches(isClosed(Gravity.LEFT))); //left Drawer should be closed
        //open Drawer
        onView(withContentDescription(TestUtils.getToolbarNavigationContentDescription(
                mActivityTestRule.getActivity(), R.id.toolbar
        )))
                .perform(click());

        //Check if drawer is open by now
        onView(withId(R.id.drawer_layout))
                .check(matches(isOpen(Gravity.LEFT)));

        //close the drawer
        onView(withContentDescription(TestUtils.getToolbarNavigationContentDescription(
                mActivityTestRule.getActivity(), R.id.toolbar
        ))).perform(click());
    }

    @Test
    public void clickGovNavigationItem_ShowsGovActivity() {
        //open drawer
        onView(withId(R.id.drawer_layout))
                .check(matches(isClosed(Gravity.LEFT))) //left drawer should be closed
                .perform(open());
//        onView(withContentDescription(TestUtils.getToolbarNavigationContentDescription(
//                mActivityTestRule.getActivity(), R.id.toolbar
//        )))
//                .perform(click());
//        //start the gov Screen
//        onView(withId(R.id.navigation_view))
//                .perform(navigateTo(R.id.action_gov));
//
//        //check that the Gov Activity was opened
//        onView(withId(R.id.gov_frag_frame))
//                .check(matches(isDisplayed()));
    }

}
