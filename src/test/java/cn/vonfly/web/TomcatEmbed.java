package cn.vonfly.web;

import org.apache.catalina.Context;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

/**
 * Created by Administrator on 2017/7/4.
 */
public class TomcatEmbed {
    private static final String hostName = "127.0.0.1";
    private static final int port = 8078;
    private static final String contextPath = "";

    public static void main(String[] args) {
        try {
            Tomcat tomcat = new Tomcat();
            String docBase = "src/main/webapp/";
            StandardContext standardContext = (StandardContext) tomcat.addWebapp(contextPath, new File(docBase).getAbsolutePath());
            tomcat.setHostname(hostName);
            tomcat.setPort(port);
            //增加tomcat-jasper等包的获取路径
            WebResourceRoot webResourceRoot = new StandardRoot(standardContext);
            webResourceRoot.addPreResources(new DirResourceSet(webResourceRoot,
                    "/WEB-INF/classes",
                    new File("target/classes").getAbsolutePath(),
                    "/"));
            standardContext.setResources(webResourceRoot);
            tomcat.start();
            tomcat.getServer().await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
