package com.ken.tutorial.twitterclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwitterCloneApplication {

	/**
	 * 聞きたいポイント
	 * Spring Frameworkに限らず，JavaAppに置いてmain()はjvmが呼び出している？
	 * jvmの実態は少し読んだことあり（GC等）
	 * jarファイルは，クラスファイルとはまた別なのか．jvmとなんか関係ありそう
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TwitterCloneApplication.class, args);
	}
}
