package com.tian.spring;

import com.tian.spring.model.BeanScope;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tianchengbei
 * @since 2019-12-01
 */
public class BeanFactory {

    private List<BeanDefine> defineBeans;
    private Map<String, Object> singleBeans;

    public BeanFactory(List<BeanDefine> list) throws Exception {
        this.defineBeans = list;
        singleBeans = new HashMap<>(100);
        for (BeanDefine bean : defineBeans) {
            //单例模式初始化
            if (BeanScope.singleton.equals(bean.getScope())) {
                Class<?> clazz = Class.forName(bean.getClassPath());
                Object obj = clazz.newInstance();
                singleBeans.put(bean.getId(), obj);
            }
        }

    }

    public Object getBean(String beanId) throws Exception {
        Object obj = null;
        for (BeanDefine bean : defineBeans) {
            if (!beanId.equals(bean.getId())) {
                continue;
            }
            Class<?> clazz = Class.forName(bean.getClassPath());
            //prototype 每次都创建对象
            if (BeanScope.prototype.equals(bean.getScope())) {
                obj = clazz.newInstance();
            }
            if (BeanScope.singleton.equals(bean.getScope())) {
                obj = singleBeans.get(beanId);
            }
            //为获取到的实例进行DI注入，为队形属性赋值
            setValue(obj, clazz, bean.getPropertityMap());
            return obj;
        }
        return obj;
    }

    /**
     * 依赖注入，给对想的属性赋值
     */
    public void setValue(Object instance, Class classObj, Map<String, String> propertyMap) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        //遍历需要注入的属性
        for (Map.Entry<String, String> entrySet : propertyMap.entrySet()) {
            String propertyName = entrySet.getKey();
            String propertyValue = entrySet.getValue();
            //找到对应的属性
            Field field = classObj.getDeclaredField(propertyName);
            Method[] methods = classObj.getMethods();
            String methodName = "set" + propertyName;
            //从对应属性中，查找set方法
            for (Method method : methods) {
                if (!method.getName().equalsIgnoreCase(methodName)) continue;
                //遍历到对应的set方法,进行属性赋值
                setProperty(instance, field, method, propertyValue);
                break;
            }

        }
    }

    private void setProperty(Object instance, Field field, Method method, String propertyValue) throws InvocationTargetException, IllegalAccessException {
        Class<?> type = field.getType();
        if (type == String.class) {
            method.invoke(instance, propertyValue);
        } else if (type == Integer.class) {
            method.invoke(instance, Integer.valueOf(propertyValue));
        } else if (type == List.class) {
            String[] split = propertyValue.split(",");
            List<String> list = Arrays.asList(split);
            method.invoke(instance, list);
        } else {
            //当数组处理
            String[] split = propertyValue.split(",");
            Object[] objects = new Object[1];
            objects[0] = split;
            method.invoke(instance, objects);
        }

    }

}
