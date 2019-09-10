package test;

import com.google.common.base.MoreObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Pattern;

public class StringTest {

    private Logger logger = LoggerFactory.getLogger(StringTest.class);
    public static void main(String[] args){
        new StringTest().test();
        new StringTest().convert("chenName");
    }

    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                .add("name","chencong")
                .add("add","uestc").toString();
    }

    public void test(){
        logger.info("使用guava后："+toString());
        logger.info("使用guava前"+super.toString());
    }

    public void convert(String s){
        String regex = "([a-z])([A-Z])";
        String replacement = "$1_$2";
        logger.info(s.replaceAll(regex,replacement));

        logger.info("chen".replaceAll("[a-z]","$0"));

        logger.info(" "+Pattern.matches("[a-z]?","ne"));
    }
}
