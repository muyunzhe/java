package com.nudt.design.proxyCore;

import java.lang.reflect.Method;

/**
 * Created by jeffrey on 15-12-3.
 */
public interface InvocationHandler {
    public void invoke(Object o,Method m);
}
