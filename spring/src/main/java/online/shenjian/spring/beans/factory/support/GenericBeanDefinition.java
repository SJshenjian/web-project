package online.shenjian.spring.beans.factory.support;

import online.shenjian.spring.beans.BeanDefinition;
import online.shenjian.spring.beans.ConstructorArgument;
import online.shenjian.spring.beans.PropertyValue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jian Shen
 * @version V1.0
 * @date 2018/10/28
 */
public class GenericBeanDefinition implements BeanDefinition {

    private String id;
    private String className;
    private boolean singleton = true;
    private boolean prototype = false;
    private String scope = SCOPE_DEFAULT;
    private List<PropertyValue> propertyValues = new ArrayList<>();
    private ConstructorArgument constructorArgument = new ConstructorArgument();

    public GenericBeanDefinition() {

    }

    public GenericBeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }

    @Override
    public boolean isSingleton() {
        return singleton;
    }

    @Override
    public boolean isPrototype() {
        return prototype;
    }

    @Override
    public String getScope() {
        return scope;
    }

    @Override
    public void setScope(String scope) {
        this.scope = scope;
        this.singleton = SCOPE_SINGLETON.equals(scope) || SCOPE_DEFAULT.equals(scope);
        this.prototype = SCOPE_PROTOTYPE.equals(scope);
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setBeanClassName(String beanClassName) {
        this.className = beanClassName;
    }

    @Override
    public String getBeanClassName() {
        return className;
    }


    @Override
    public List<PropertyValue> getPropertyValues() {
        return propertyValues;
    }

    @Override
    public ConstructorArgument getConstructorArgument() {
        return constructorArgument;
    }

    @Override
    public boolean hasConstructorArgumentValues() {
        return !constructorArgument.isEmpty();
    }
}
