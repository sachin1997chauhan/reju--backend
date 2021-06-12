package com.medicare.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StorageConfig {

 
  private String accessKey="AKIA2AD6MCSSSTAV5UFT";

  private String accessSecret="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";
  private String region="US_EAST_2";

  @Bean
  public AmazonS3 s3Client() {
      AWSCredentials credentials = new BasicAWSCredentials(accessKey, accessSecret);
      return AmazonS3ClientBuilder.standard()
              .withCredentials(new AWSStaticCredentialsProvider(credentials))
              .withRegion(region).build();
  }

}
