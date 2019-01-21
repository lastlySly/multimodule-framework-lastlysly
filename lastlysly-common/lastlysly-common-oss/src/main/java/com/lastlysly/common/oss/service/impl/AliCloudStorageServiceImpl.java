package com.lastlysly.common.oss.service.impl;

import com.aliyun.oss.OSSClient;
import com.lastlysly.common.core.exception.BusinessException;
import com.lastlysly.common.oss.OssProperties;
import com.lastlysly.common.oss.service.CloudStorageService;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-01-21 14:26
 *
 * 阿里云对象存储服务类
 **/
public class AliCloudStorageServiceImpl implements CloudStorageService {

    private OssProperties ossProperties;
    private OSSClient client;

    public AliCloudStorageServiceImpl(OssProperties ossProperties) {
        this.ossProperties = ossProperties;
        // 初始化
        init();
    }

    private void init() {
        client = new OSSClient(ossProperties.getEndPoint(), ossProperties.getAccessKeyId(),
                ossProperties.getAccessKeySecret());
    }


    @Override
    public String upload(byte[] data, String path) {
        return upload(new ByteArrayInputStream(data), path);
    }

    @Override
    public String upload(InputStream inputStream, String path) {
        try {
            client.putObject(ossProperties.getBucketName(), path, inputStream);
        } catch (Exception e) {
            throw new BusinessException("上传文件失败，请检查配置信息", e);
        }

        return ossProperties.getDomain() == null ? ossProperties.getEndPoint() : ossProperties.getDomain() + "/" + path;
    }

    @Override
    public String uploadSuffix(byte[] data, String suffix) {
        return null;
    }

    @Override
    public String uploadSuffix(InputStream inputStream, String suffix) {
        return null;
    }

    @Override
    public InputStream download(String path) {
        return client.getObject(ossProperties.getBucketName(), path).getObjectContent();
    }

    @Override
    public void delete(String path) {
        client.deleteObject(ossProperties.getBucketName(), path);
    }
}
