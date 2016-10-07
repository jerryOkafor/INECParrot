package com.bellman.inecparrot.home;

/**
 * Created by Potencio on 9/30/2016.
 */

import com.bellman.inecparrot.BasePresenter;
import com.bellman.inecparrot.BaseView;

/**
 * This specifies the Contract between the Presenter and the View
 */
public interface HomeContract {
    interface View extends BaseView<Presenter> {

    }


    interface Presenter extends BasePresenter {

    }
}
