package com.yuzh.SpringTest;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;

import java.io.IOException;

public class MetadataTest {
	public static void main(String[] args) throws IOException {
		SimpleMetadataReaderFactory simpleMetadataReaderFactory = new
				SimpleMetadataReaderFactory();
		// 构造一个MetadataReader
		MetadataReader metadataReader =
				simpleMetadataReaderFactory.getMetadataReader("com.yuzh.beans.Jack");
		// 得到一个ClassMetadata，并获取了类名
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		System.out.println(classMetadata.getClassName());
		// 获取一个AnnotationMetadata，并获取类上的注解信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		for (String annotationType : annotationMetadata.getAnnotationTypes()) {
			System.out.println(annotationType);
		}
	}

}
