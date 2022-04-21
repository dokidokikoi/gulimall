package com.harukaze.shop.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @PackageName: com.harukaze.shop.thirdparty
 * @ClassName: TestOss
 * @Description:
 * @Author: doki
 * @Date: 2022/4/17 2:16
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class OssTest {

    @Resource
    private OSSClient ossClient;

    @Test
    public void testOss() throws FileNotFoundException {
        //        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
//        String endpoint = "https://oss-cn-shenzhen.aliyuncs.com";
//        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId =  "LTAI5tLj1ueqGUKVYCsPo2Gv";
//        String accessKeySecret = "2xYG9OACZXOWnprbluGZ3AVIbU0DTu";
        // 填写Bucket名称，例如examplebucket。
        String bucketName = "harukaze-gulimall";
        // 填写文件名。文件名包含路径，不包含Bucket名称。例如exampledir/exampleobject.txt。
        String objectName = "71187447_p0.png";

// 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(bucketName, objectName, new FileInputStream("E:\\71187447_p0.png"));

// 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("ok");
    }
}
