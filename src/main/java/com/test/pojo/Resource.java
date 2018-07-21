package com.test.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author huangsongyang
 * @date 2018/7/20 21:10
 */
@Configuration //引用资源文件
@ConfigurationProperties(prefix = "com.imooc.opensource") //前缀
@PropertySource(value = "classpath:resource.properties")
public class Resource {

    private String name;
    private String website;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
