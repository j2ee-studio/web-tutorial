package com.company.team.utility;

public interface StackTraceHelper {

    default String getClassName(){
        return null;
    }

    default String getMethodName(){
        return null;
    }
}
