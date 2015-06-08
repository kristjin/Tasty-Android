package com.herokuapp.tastyapp.tasty;

public class DispatchActivity extends ParseLoginDispatchActivity {

    @Override
    protected Class<?> getTargetClass() {
        return MainActivity.class;
    }
}
