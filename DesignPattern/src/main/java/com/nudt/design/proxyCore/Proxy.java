package com.nudt.design.proxyCore;

import com.nudt.design.proxy.Car;
import org.apache.commons.io.FileUtils;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by jeffrey on 15-12-3.
 */
public class Proxy {
    public static Object newProxyInstance(Class infce,InvocationHandler h) throws Exception{
        String rt = "\r\n";
        String methodStr = "";
        for(Method m :infce.getMethods()){
            methodStr += " " +rt +
                    "    @Override"+rt+
                    "    public void "+m.getName()+"() {"+ rt+
                    "try{" +rt +
                    "         Method md = "+infce.getName()+".class.getMethod(\""+m.getName()+"\");" +rt +
                    "         h.invoke(this,md);" +rt+
                    "}catch(Exception e){e.printStackTrace();}" +rt+
                    "    }";
        }
        String str =" "+ rt+
        "package com.nudt.design.proxyCore;" + rt+
                "import com.nudt.design.proxyCore.InvocationHandler;" +rt+
                "import java.lang.reflect.Method;" +rt+
        "public class $Proxy0 implements "+infce.getName()+" { " +rt+
        "    public $Proxy0(InvocationHandler h){ " +rt+
        "        super();" +rt+
                "      this.h = h; "+rt+
        "    }"+rt+
                "private InvocationHandler h;" +rt +
        methodStr + rt +
        "}";

        String fileName = System.getProperty("user.dir") +"/target/classes/com/nudt/design/proxyCore/$Proxy0.java";
        File file = new File(fileName);
        FileUtils.writeStringToFile(file,str);
        JavaCompiler compile = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compile.getStandardFileManager(null,null,null);
        Iterable utils = fileManager.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask compileTask = compile.getTask(null,fileManager,null,null,null,utils);
        compileTask.call();

        fileManager.close();
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        Class c = cl.loadClass("com.nudt.design.proxyCore.$Proxy0");

        Constructor ct = c.getConstructor(InvocationHandler.class);
        //System.out.println(c.getName());
        return ct.newInstance(h);
    }
}
