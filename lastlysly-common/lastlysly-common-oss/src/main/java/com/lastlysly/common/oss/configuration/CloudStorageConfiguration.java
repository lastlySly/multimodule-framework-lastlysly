package com.lastlysly.common.oss.configuration;

import com.lastlysly.common.oss.OssProperties;
import com.lastlysly.common.oss.service.CloudStorageService;
import com.lastlysly.common.oss.service.impl.AliCloudStorageServiceImpl;
import com.lastlysly.common.oss.service.impl.QqCloudStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-01-21 13:51
 *
 * 云存储配置
 *
 **/
@Configuration
@EnableConfigurationProperties(OssProperties.class)
public class CloudStorageConfiguration {
    @Autowired
    private OssProperties ossProperties;

    @Bean("cloudStorageService")
    public CloudStorageService cloudStorageService() {
        if (ossProperties.getType() == null) {
            return null;
        }
        if (ossProperties.getType().equals(1)) {
            return new AliCloudStorageServiceImpl(ossProperties);
        } else if (ossProperties.getType().equals(2)) {
            return new QqCloudStorageServiceImpl(ossProperties);
        }
        return null;
    }

}
