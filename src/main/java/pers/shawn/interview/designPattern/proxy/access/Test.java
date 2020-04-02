package pers.shawn.interview.designPattern.proxy.access;

import pers.shawn.interview.designPattern.proxy.access.bean.PersonBean;
import pers.shawn.interview.designPattern.proxy.access.bean.PersonBeanImpl;
import pers.shawn.interview.designPattern.proxy.access.handler.NonOwnerInvocationHandler;
import pers.shawn.interview.designPattern.proxy.access.handler.OwnerInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/**
 * MyProxy class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public class Test {

    public static void main(String[] args) {
        init();
        drive();
    }

    public static void drive() {
        PersonBean joe = getPerson("JOE");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, GO");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, GO");
        } catch (Exception e) {
            System.out.println("Can't set Interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    static HashMap<String, PersonBean> map = new HashMap();

    public static void init() {
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName("JOE");
        personBean.setGender("男性");
        personBean.setHotOrNotRating(9);
        personBean.setInterests("YES");
        map.put(personBean.getName(), personBean);
    }

    public static PersonBean getPerson(String name) {
        return map.get(name);
    }

    static PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

    static PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }

}
