package com.jhon.rain;/**
 * Created by jiangyu on 2017/3/2.
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author jiangyu
 * @version v1.0
 * @className ConsumerTest
 * @create 2017-03-02 23:30
 */
public class ConsumerTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();

        for (int i=0;i<10;i++){
            IHelloWorldService helloWorldService = (IHelloWorldService)context.getBean("demoService"); // 获取远程服务代理
            String result = helloWorldService.sayHello("JhonRain"); // 执行远程方法
            System.out.println(""+result); // 显示调用结果
        }

//        System.in.read();
    }
}
