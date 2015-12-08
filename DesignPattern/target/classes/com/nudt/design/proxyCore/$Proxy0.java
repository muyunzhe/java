 
package com.nudt.design.proxyCore;
import com.nudt.design.proxyCore.InvocationHandler;
import java.lang.reflect.Method;
public class $Proxy0 implements com.nudt.design.proxy.Moveable { 
    public $Proxy0(InvocationHandler h){ 
        super();
      this.h = h; 
    }
private InvocationHandler h;
 
    @Override
    public void move() {
try{
         Method md = com.nudt.design.proxy.Moveable.class.getMethod("move");
         h.invoke(this,md);
}catch(Exception e){e.printStackTrace();}
    }
}