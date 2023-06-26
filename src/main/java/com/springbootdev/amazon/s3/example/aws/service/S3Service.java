package com.springbootdev.amazon.s3.example.aws.service;

import org.springframework.web.multipart.MultipartFile;

public interface S3Service
{

    void deleteFileFromS3Bucket(String fileName);
    void uploadFileToS3Bucket(MultipartFile multipartFile);
}
