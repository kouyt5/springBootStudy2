package test;

import com.google.common.base.MoreObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringTest {

    private Logger logger = LoggerFactory.getLogger(StringTest.class);
    public static void main(String[] args){
        new StringTest().test();
    }

    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                .add("name","chencong")
                .add("add","uestc").toString();
    }

    public void test(){
        logger.info("使用guava后："+toString());
        logger.info("使用guava"+super.toString());
    }
}
