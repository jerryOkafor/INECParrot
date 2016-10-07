package com.bellman.inecparrot.home;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Potencio on 9/30/2016.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class HomeScreenTest {

    /**
     * {@link ActivityTestRule} is a JUnit {@link Rule @Rule} to launch your activity under test.
     * <p>
     * Rules are interceptors which are executed for each test method and are important building
     * blocks of Junit tests.
     */
    @Rule
    public ActivityTestRule<HomeActivity> mTasksActivityTestRule =
            new ActivityTestRule<HomeActivity>(HomeActivity.class) {

//                /**
//                 * To avoid a long list of tasks and the need to scroll through the list to find a
//                 * task, we call {@link TasksDataSource#deleteAllTasks()} before each test.
//                 */

//                @Override
//                protected void beforeActivityLaunched() {
//                    super.beforeActivityLaunched();
//                    // Doing this in @Before generates a race condition.
//                    Injection.provideTasksRepository(InstrumentationRegistry.getTargetContext())
//                            .deleteAllTasks();
//                }
            };
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void doNothing()
    {

    }
    @After
    public void tearDown() throws Exception {

    }

}