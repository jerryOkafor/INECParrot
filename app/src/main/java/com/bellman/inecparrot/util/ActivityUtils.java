package com.bellman.inecparrot.util;

/**
 * Created by Potencio on 9/30/2016.
 */

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This provides a method to help activities load their UI
 */

public class ActivityUtils {


    /**
     * The {@code fragment} is added to the container view with {@code frameId}. The
     * operation is performed by the {@code fragmentManger}
     *
     * */
    public static void addFragmentToActivity (@NonNull FragmentManager fragmentManager,
                                              @NonNull Fragment fragment, int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment);
        transaction.commit();
    }
}
