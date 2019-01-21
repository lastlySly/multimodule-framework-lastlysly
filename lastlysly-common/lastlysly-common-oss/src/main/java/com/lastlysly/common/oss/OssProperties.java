package com.lastlysly.common.oss;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-01-21 14:18
 *
 * oss配置信息
 **/
@Data
@ConfigurationProperties(prefix = OssProperties.OSS_PREFIX)
public class OssProperties {

    public static final String OSS_PREFIX = "oss";

    /**
     * 类型 1：阿里云  2：腾讯云  3：七牛云
     */

    private Integer type;

    /**
     * 绑定的域名
     */
    private String domain;

    /**
     * 路径前缀
     */
    private String prefix;

    /**
     * AccessKeyId(对应腾讯云：SecretId)
     */
    private String accessKeyId;

    /**
     * AccessKeySecret(对应腾讯云：SecretKey)
     */
    private String accessKeySecret;

    /**
     * bucketName
     */
    private String bucketName;

    /**
     * endPoint(对应腾讯云：Region)
     */
    private String endPoint;


}
