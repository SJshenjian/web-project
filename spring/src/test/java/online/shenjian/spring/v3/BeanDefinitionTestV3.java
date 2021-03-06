package online.shenjian.spring.v3;

import online.shenjian.spring.beans.BeanDefinition;
import online.shenjian.spring.beans.ConstructorArgument;
import online.shenjian.spring.beans.factory.config.RuntimeBeanReference;
import online.shenjian.spring.beans.factory.config.TypedStringValue;
import online.shenjian.spring.beans.factory.support.DefaultBeanFactory;
import online.shenjian.spring.beans.factory.xml.XmlBeanDefinitionReader;
import online.shenjian.spring.core.io.ClassPathResource;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Jian Shen
 * @version V1.0
 * @date 2018/12/9
 */
public class BeanDefinitionTestV3 {

    @Test
    public void testGetBeanDefinition() {
        DefaultBeanFactory factory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("petstore-v3.xml"));

        BeanDefinition beanDefinition = factory.getBeanDefinition("petStoreServiceOne");
        ConstructorArgument constructorArgument = beanDefinition.getConstructorArgument();
        List<ConstructorArgument.ValueHolder> valueHolders = constructorArgument.getArgumentValues();

        assertEquals(3, valueHolders.size());
        {
            RuntimeBeanReference reference = (RuntimeBeanReference)valueHolders.get(0).getValue();
            assertEquals("accountDao", reference.getBeanName());
        }
        {
            RuntimeBeanReference reference = (RuntimeBeanReference)valueHolders.get(1).getValue();
            assertEquals("itemDao", reference.getBeanName());
        }
        {
            TypedStringValue stringValue = (TypedStringValue)valueHolders.get(2).getValue();
            assertEquals("2", stringValue.getValue());
        }
    }
}
