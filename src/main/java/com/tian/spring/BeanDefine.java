package com.tian.spring;

import com.tian.spring.model.BeanScope;
import java.util.Map;
import org.springframework.context.annotation.Bean;

/**
 * @author tianchengbei
 * @since 2019-12-01
 */
public class BeanDefine {

    private String id;
    private String classPath;
    private BeanScope scope = BeanScope.singleton;
    private Map<String,String> propertityMap;

    public Map<String, String> getPropertityMap() {
        return propertityMap;
    }

    public void setPropertityMap(Map<String, String> propertityMap) {
        this.propertityMap = propertityMap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public BeanScope getScope() {
        return scope;
    }

    public void setScope(BeanScope scope) {
        this.scope = scope;
    }
}
