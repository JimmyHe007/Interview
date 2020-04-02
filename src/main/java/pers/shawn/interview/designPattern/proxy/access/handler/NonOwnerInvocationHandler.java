package pers.shawn.interview.designPattern.proxy.access.handler;

import pers.shawn.interview.designPattern.proxy.access.bean.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * NonOwnerInvocationHandler class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(personBean, objects);
        } else if (method.getName().equals("setHotOrNotRating")) {
            return method.invoke(personBean, objects);
        } else if (method.getName().startsWith("set")) {
            throw new IllegalAccessException();
        }
        return null;
    }
}
