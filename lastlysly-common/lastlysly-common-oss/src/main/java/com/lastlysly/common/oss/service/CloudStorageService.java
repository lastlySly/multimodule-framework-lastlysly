package com.lastlysly.common.oss.service;

import java.io.InputStream;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-01-21 14:25
 **/
public interface CloudStorageService {
    /**
     * 文件上传
     *
     * @param data 文件字节数组
     * @param path 文件路径，包含文件名
     * @return 返回http地址
     */
    String upload(byte[] data, String path);

    /**
     * 文件上传
     *
     * @param data   文件字节数组
     * @param suffix 后缀
     * @return 返回http地址
     */
    String uploadSuffix(byte[] data, String suffix);

    /**
     * 文件上传
     *
     * @param inputStream 字节流
     * @param path        文件路径，包含文件名
     * @return 返回http地址
     */
    String upload(InputStream inputStream, String path);

    /**
     * 文件上传
     *
     * @param inputStream 字节流
     * @param suffix      后缀
     * @return 返回http地址
     */
    String uploadSuffix(InputStream inputStream, String suffix);

    /**
     * 下载文件
     *
     * @param path 文件路径
     * @return InputStream
     * @author maker
     * @date 2018-03-08 21:58
     */
    InputStream download(String path);

    /**
     * 删除文件
     *
     * @param path 文件路径
     * @author maker
     * @date 2018-03-11 00:21
     */
    void delete(String path);
}
